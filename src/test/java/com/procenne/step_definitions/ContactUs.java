package com.procenne.step_definitions;

import com.procenne.pages.MainPageProcenne;
import com.procenne.utilities.ConfigurationReader;
import com.procenne.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;

public class ContactUs {

    MainPageProcenne mainPageProcenne = new MainPageProcenne();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.get();

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() throws InterruptedException {
        Driver.get().get(ConfigurationReader.get("url1"));
        jse.executeScript("arguments[0].scrollIntoView(true);", mainPageProcenne.sendButton);
    }

    @When("the user enters the first name as {string}")
    public void theUserEntersTheNameAs(String firstname) {
        mainPageProcenne.firstNameInputBox.sendKeys(firstname);
    }

    @And("the user enters the last name as {string}")
    public void theUserEntersTheLastNameAs(String lastname) {
        mainPageProcenne.lastNameInputBox.sendKeys(lastname);
    }

    @And("the user enters the company name as {string}")
    public void theUserEntersTheCompanyNameAs(String company) {
        mainPageProcenne.companyNameInputBox.sendKeys(company);
    }

    @And("the user enters email as {string}")
    public void theUserEntersEmailAs(String email) {
        mainPageProcenne.emailAddressInputBox.sendKeys(email);
    }

    @And("the user enters message as {string}")
    public void theUserEntersMessageAs(String message) throws InterruptedException {
        mainPageProcenne.messageInputBox.sendKeys(message);
        Thread.sleep(1000);
    }

    @And("the user clicks clarification text")
    public void theUserClicksClarificationText() throws InterruptedException {
        jse.executeScript("arguments[0].click();", mainPageProcenne.clarificationTextOfContact);
        //mainPage.clarificationTextOfContact.click();
        //action.moveToElement(mainPage.hoverOver).perform();
        jse.executeScript("arguments[0].scrollIntoView();", mainPageProcenne.scroolTo);
        mainPageProcenne.readAndAcceptButton.click();
    }

    @And("the user clicks permission text")
    public void theUserClicksPermissionText() throws InterruptedException {
        jse.executeScript("arguments[0].click();", mainPageProcenne.communicationPermissionOfContact);
        //mainPage.communicationPermissionOfContact.click();
        jse.executeScript("arguments[0].scrollIntoView();", mainPageProcenne.scroolTo);
        mainPageProcenne.readAndAcceptButton.click();
    }

    @And("the user clicks on the send button")
    public void theUserClicksOnTheSendButton() throws InterruptedException {
        jse.executeScript("arguments[0].click();", mainPageProcenne.sendButton);
        //mainPage.sendButton.click();
        Thread.sleep(3000);
    }


}
