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
    public void user_launches_the_orange_hrm_site() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Given("User logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String username, String password) {
        loginPage.loginAs(username, password);
    }

    @When("User clicks on Admin menu")
    public void user_clicks_on_admin_menu() {
        adminPage.clickAdminMenu();
    }

    @When("User enters {string} in Username field")
    public void user_enters_in_username_field(String username) {
        adminPage.enterUsername(username);
    }

    @When("User clicks on User Role dropdown")
    public void user_clicks_on_user_role_dropdown() {
        adminPage.clickUserRoleDropdown();
    }

    @When("User enters {string} in Employee Name field")
    public void user_enters_in_employee_name_field(String name) {
        adminPage.enterEmployeeName(name);
    }

    @When("User clicks on Status dropdown")
    public void user_clicks_on_status_dropdown() {
        adminPage.clickStatusDropdown();
    }

    @Then("Admin search filters should be ready")
    public void admin_search_filters_should_be_ready() {
        System.out.println("Admin filter inputs completed.");
    }
}
