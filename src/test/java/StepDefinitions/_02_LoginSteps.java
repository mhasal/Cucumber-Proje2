package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginSteps {

    DialogContent dc=new DialogContent();
    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        dc.findAndClick("signIn");
        dc.findAndSend("email","grup2223245@gmail.com");
        dc.findAndSend("pass","12234256223Gr-");
        dc.findAndClick("signIn2");

    }

    @Then("User should login successfuly")
    public void userShouldLoginSuccessfuly() {
        dc.findAndContainsText("welcome","Welcome");
    }
}
