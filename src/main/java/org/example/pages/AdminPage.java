package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

    WebDriver driver;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//span[text()='Admin']")
    private WebElement adminMenu;

    @FindBy(xpath = "//label[text()='Username']/following::input[1]")
    private WebElement usernameInput;

    @FindBy(xpath = "//label[text()='User Role']/following::div[@class='oxd-select-text-input'][1]")
    private WebElement userRoleDropdown;

    @FindBy(xpath = "//label[text()='Employee Name']/following::input[1]")
    private WebElement employeeNameInput;

    @FindBy(xpath = "//label[text()='Status']/following::div[@class='oxd-select-text-input'][1]")
    private WebElement statusDropdown;

    public void clickAdminMenu() {
        adminMenu.click();
    }

    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void clickUserRoleDropdown() {
        userRoleDropdown.click();
    }

    public void enterEmployeeName(String name) {
        employeeNameInput.sendKeys(name);
    }

    public void clickStatusDropdown() {
        statusDropdown.click();
    }
}
