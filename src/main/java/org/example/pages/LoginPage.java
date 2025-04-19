package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initialize elements
    }

    // Elements using PageFactory
    @FindBy(xpath = "//button[@type='submit' and contains(@class, 'orangehrm-login-button')]")
    WebElement loginButton;


    @FindBy(xpath = "//input[@name='username']")

    WebElement userIdField;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;


    // Actions
    public void enterUserId(String userId) {
        userIdField.sendKeys(userId);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void loginAs(String userId, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(userIdField));

        userIdField.sendKeys(userId);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}