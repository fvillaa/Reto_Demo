package co.com.choucair.certification.retodemo.tasks;

import co.com.choucair.certification.retodemo.userinterface.RegisterDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class RegisterDemo implements Task {
    public static RegisterDemo onThePage() {
        return Tasks.instrumented(RegisterDemo.class);
    }

    public static RegisterDemo the(String user) {
        return Tasks.instrumented(RegisterDemo.class,user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterDemoPage.INPUT_FIRSTNAME),
                Enter.theValue("Fernando").into(RegisterDemoPage.INPUT_FIRSTNAME),
                Enter.theValue("Villa Alvarez").into(RegisterDemoPage.INPUT_LASTNAME),
                Enter.theValue("Mz 11 Casa 1 Las Brisas-Pereira").into(RegisterDemoPage.INPUT_ADDRESS),
                Enter.theValue("fvilla.82@hotmail.com").into(RegisterDemoPage.INPUT_EMAIL_ADDRESS),
                Enter.theValue("3124335093").into(RegisterDemoPage.INPUT_PHONE),
                Click.on(RegisterDemoPage.INDICATE_GENDER),
                Click.on(RegisterDemoPage.INDICATE_HOBBIES),
                Click.on(RegisterDemoPage.LANGUAGE),
                Click.on(RegisterDemoPage.CHOSEN_LANGUAGE),
                Click.on(RegisterDemoPage.CHOSEN_LANGUAGE2),
                Click.on(RegisterDemoPage.CHOSEN_LANGUAGE3),
                Click.on(RegisterDemoPage.INDICATE_SKILLS),
                Click.on(RegisterDemoPage.INDICATE_COUNTRY),
                Click.on(RegisterDemoPage.INDICATE_SELECT_COUNTRY),
                SelectFromOptions.byVisibleText("1982").from(RegisterDemoPage.SELECT_YEAR),
                SelectFromOptions.byVisibleText("October").from(RegisterDemoPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText("12").from(RegisterDemoPage.SELECT_DAY),
                Enter.theValue("Poiuytre155**").into(RegisterDemoPage.INPUT_CREATE_PASSWORD),
                Enter.theValue("Poiuytre155**").into(RegisterDemoPage.INPUT_CONFIRM_PASSWORD),
                Click.on(RegisterDemoPage.CLICK_BUTTON_SUBMIT),
                Click.on(RegisterDemoPage.REGISTER_DATA)

        );


    }
}
