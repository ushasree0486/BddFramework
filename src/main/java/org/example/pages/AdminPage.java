package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

    WebDriver driver;

    // Constructor
    public AdminPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ==============================
    // WebElements using @FindBy
    // ==============================

    // 1. Admin menu item
    @FindBy(xpath ="//span[text()='Admin']")
    private WebElement adminMenu;

    // 2. Username input box
    @FindBy(xpath = "//label[text()='Username']/following::input[1]")
    private WebElement usernameInput;

    // 3. User Role dropdown (clickable div)
    @FindBy(xpath = "//label[text()='User Role']/following::div[@class='oxd-select-text-input'][1]")
    private WebElement userRoleDropdown;

    // 4. Employee Name input box
    @FindBy(xpath = "//label[text()='Employee Name']/following::input[1]")
    private WebElement employeeNameInput;

    // 5. Status dropdown (clickable div)
    @FindBy(xpath = "//label[text()='Status']/following::div[@class='oxd-select-text-input'][1]")
    private WebElement statusDropdown;

    // ==============================
    // Action Methods
    // ==============================

    public void clickAdminMenu() {
        adminMenu.click();
    }

    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void clickUserRoleDropdown() {
        userRoleDropdown.click();
    }

    public void enterEmployeeName(String empName) {
        employeeNameInput.sendKeys(empName);
    }

    public void clickStatusDropdown() {
        statusDropdown.click();
    }


}
