package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class _01_RegisterSteps {

    DialogContent dc=new DialogContent();
    @Given("Navigate to basqar")
    public void navigateToBasqar() {

        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
        GWD.getDriver().manage().window().maximize();

    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++)
            dc.findAndClick(listElement.get(i));


    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));


    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {




        dc.findAndContainsText("success","Thank");


    }

    @And("Success message displayed")
    public void successMessageDisplayed() {
        dc.findAndContainsText("saved","saved");
    }

    @And("Purchase verify displayed")
    public void purchaseVerifyDisplayed() {

        dc.findAndContainsText("purchase","Thank");
    }
}
