package com.procenne.step_definitions;

import com.procenne.pages.RegistrationForm;
import com.procenne.utilities.ConfigurationReader;
import com.procenne.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Registration {

    RegistrationForm registrationForm = new RegistrationForm();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
    Select select;

    @Given("the user is on the registration form page")
    public void the_user_is_on_the_registration_form_page() {
        Driver.get().get(ConfigurationReader.get("url2"));
        jse.executeScript("arguments[0].scrollIntoView();", registrationForm.submitButton);
    }

    @When("the user enters the name as {string}")
    public void theUserEntersTheNameAs(String name) {
        jse.executeScript("document.getElementById('firstName').setAttribute('value', '" + name + "')");
    }

    @And("the user enters the family name as {string}")
    public void theUserEntersTheFamilyNameAs(String lastName) {
        registrationForm.lastNameInputBox.sendKeys(lastName);
    }

    @And("the user enters the email as {string}")
    public void theUserEntersTheEmailAs(String email) {
        registrationForm.emailInputBox.sendKeys(email);
    }

    @And("the user chooses one of the options as {string}")
    public void theUserChoosesOneOfTheOptionsAs(String sex) {
        List<WebElement> elements = Driver.get().findElements(By.cssSelector("label[class='custom-control-label']"));
        for(int i=1; i <= elements.size() ; i++) {
            WebElement element = Driver.get().findElement(By.xpath("(//label[@class='custom-control-label'])["+i+"]"));
            if (element.getText().toLowerCase().equals(sex.toLowerCase())) {
                element.click();
            }
        }
    }

    @And("the user enters the birthday day:{string} month:{string} year:{string}")
    public void theUserEntersTheBirthdayDayMonthYear(String day, String month, String year) {
        registrationForm.birthday.click();
        select = new Select(registrationForm.selectMonth);
        select.selectByVisibleText(month);
        select = new Select(registrationForm.selectYear);
        select.selectByVisibleText(year);
        if (day.startsWith("0")) {
            day = day.substring(1, 2);
        }
        Driver.get().findElement(By.xpath("(//div[.='" + day + "'])[1]")).click();
    }


    @And("the user enters the phone number as {string}")
    public void theUserEntersThePhoneNumberAs(String phoneNumber) {
        registrationForm.phoneNumber.sendKeys(phoneNumber);

    }

    @And("the user selects the hobby as {string}")
    public void theUserSelectsTheHobbyAs(String hobby) {
        List<WebElement> elements = Driver.get().findElements(By.cssSelector("label[class='custom-control-label']"));
        for(int i=1; i <= elements.size() ; i++) {
            WebElement element = Driver.get().findElement(By.xpath("(//label[@class='custom-control-label'])[" + i + "]"));
            if (element.getText().toLowerCase().equals(hobby.toLowerCase())) {
                element.click();
            }
        }
    }

    @And("the user enters the address as {string}")
    public void theUserEntersTheAddressAs(String address) {
        registrationForm.address.sendKeys(address);
    }

    @Then("the user clicks on the submit button")
    public void theUserClicksOnTheSubmitButton() {
        jse.executeScript("arguments[0].click();", registrationForm.submitButton);
    }
}
