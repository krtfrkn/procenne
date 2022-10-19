package com.procenne.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationForm extends BasePage{

    @FindBy(css = "input[name='first_name']")
    public WebElement firstNameInputBox;

    @FindBy(css = "input[id='lastName']")
    public WebElement lastNameInputBox;

    @FindBy(css = "input[id='userEmail']")
    public WebElement emailInputBox;

    @FindBy(css = "input[id='dateOfBirthInput']")
    public WebElement birthday;

    @FindBy(css = "select[class='react-datepicker__month-select']")
    public WebElement selectMonth;

    @FindBy(css = "select[class='react-datepicker__year-select']")
    public WebElement selectYear;

    @FindBy(css = "input[id='userNumber']")
    public WebElement phoneNumber;

    @FindBy(css = "textarea[id='currentAddress']")
    public WebElement address;

    @FindBy(css = "button[id='submit']")
    public WebElement submitButton;

}
