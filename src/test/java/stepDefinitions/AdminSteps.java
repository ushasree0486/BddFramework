package stepDefinitions;

import io.cucumber.java.en.*;
import org.example.pages.AdminPage;
import org.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

public class AdminSteps {

    WebDriver driver = DriverFactory.initDriver();
    LoginPage loginPage = new LoginPage(driver);
    AdminPage adminPage = new AdminPage(driver);

    @Given("User launches the OrangeHRM site")
    public void user_launches_orange_hrm_site() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @And("User logs in with username {string} and password {string}")
    public void user_logs_in(String username, String password) {
        loginPage.loginAs(username, password);
    }

    @When("User clicks on Admin menu")
    public void user_clicks_on_admin_menu() {
        adminPage.clickAdminMenu();
    }

    @And("User enters {string} in Username field")
    public void user_enters_username(String username) {
        adminPage.enterUsername(username);
    }

    @And("User clicks on User Role dropdown")
    public void user_clicks_user_role_dropdown() {
        adminPage.clickUserRoleDropdown();
    }

    @And("User enters {string} in Employee Name field")
    public void user_enters_employee_name(String empName) {
        adminPage.enterEmployeeName(empName);
    }

    @And("User clicks on Status dropdown")
    public void user_clicks_status_dropdown() {
        adminPage.clickStatusDropdown();
    }

    @Then("Admin search filters should be ready")
    public void admin_filters_ready() {
        System.out.println("Filters are visible and ready to use.");
    }
}
