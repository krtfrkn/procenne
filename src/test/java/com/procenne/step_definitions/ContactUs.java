package com.procenne.step_definitions;

import com.procenne.pages.MainPage;
import com.procenne.utilities.ConfigurationReader;
import com.procenne.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class ContactUs {

    MainPage mainPage = new MainPage();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
    Actions action = new Actions(Driver.get());

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() throws InterruptedException {
        Driver.get().get(ConfigurationReader.get("url"));
        jse.executeScript("arguments[0].scrollIntoView(true);",mainPage.sendButton);
    }

    @When("the user enters the first name as {string}")
    public void theUserEntersTheNameAs(String firstname) {
        mainPage.firstNameInputBox.sendKeys(firstname);
    }

    @And("the user enters the last name as {string}")
    public void theUserEntersTheLastNameAs(String lastname) {
        mainPage.lastNameInputBox.sendKeys(lastname);
    }

    @And("the user enters the company name as {string}")
    public void theUserEntersTheCompanyNameAs(String company) {
        mainPage.companyNameInputBox.sendKeys(company);
    }

    @And("the user enters email as {string}")
    public void theUserEntersEmailAs(String email) {
        mainPage.emailAddressInputBox.sendKeys(email);
    }

    @And("the user enters message as {string}")
    public void theUserEntersMessageAs(String message) throws InterruptedException {
        mainPage.messageInputBox.sendKeys(message);
        Thread.sleep(1000);
    }

    @And("the user clicks clarification text")
    public void theUserClicksClarificationText() throws InterruptedException {
        jse.executeScript("arguments[0].click();",mainPage.clarificationTextOfContact);
        //mainPage.clarificationTextOfContact.click();
        //action.moveToElement(mainPage.hoverOver).perform();
        jse.executeScript("arguments[0].scrollIntoView();",mainPage.scroolTo);
        mainPage.readAndAcceptButton.click();
    }

    @And("the user clicks permission text")
    public void theUserClicksPermissionText() throws InterruptedException {
        jse.executeScript("arguments[0].click();",mainPage.communicationPermissionOfContact);
        //mainPage.communicationPermissionOfContact.click();
        jse.executeScript("arguments[0].scrollIntoView();",mainPage.scroolTo);
        mainPage.readAndAcceptButton.click();
    }

    @And("the user clicks on the send button")
    public void theUserClicksOnTheSendButton() throws InterruptedException {
        jse.executeScript("arguments[0].click();",mainPage.sendButton);
        //mainPage.sendButton.click();
        Thread.sleep(3000);
    }


}
