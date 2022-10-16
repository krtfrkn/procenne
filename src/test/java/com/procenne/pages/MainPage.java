package com.procenne.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    //Contact Us
    @FindBy(css = "input[name='first_name']")
    public WebElement firstNameInputBox;

    @FindBy(css = "input[name='last_name']")
    public WebElement lastNameInputBox;

    @FindBy(css = "input[name='company']")
    public WebElement companyNameInputBox;

    @FindBy(css = "input[name='email']")
    public WebElement emailAddressInputBox;

    @FindBy(css = "textarea[name='message']")
    public WebElement messageInputBox;

    @FindBy(xpath = "(//input[@class='mr-2'])[1]")
    public WebElement clarificationTextOfContact;

    @FindBy(xpath = "(//input[@class='mr-2'])[2]")
    public WebElement communicationPermissionOfContact;

    @FindBy(css = "button[class='bg-primary hover:bg-primary/[.92] btn_ text-white max-w-fit']")
    public WebElement readAndAcceptButton;

    @FindBy(css = "button[class='bg-primary hover:bg-primary/[.92] false false false text-white  mx-auto w-full sm:w_80 md:col-span-2 transition-all']")
    public WebElement sendButton;

    @FindBy(xpath = "//a[.='buradan']")
    public WebElement scroolTo;



}
