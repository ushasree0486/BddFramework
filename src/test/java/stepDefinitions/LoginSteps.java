package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.example.pages.LoginPage;
import utils.DriverFactory;


public class LoginSteps  {

    WebDriver driver;
    LoginPage loginPage;

    @Given("User launches OrangeHRM site")

    public void user_launches_orange_hrm_site(){
        driver = DriverFactory.initDriver();
        System.out.println("Driver initialized: " + driver);  // Should not be null

        driver.get("https://opensource-demo.orangehrmlive.com/");
        loginPage = new LoginPage(driver);
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_credentials(String username, String password) {
        loginPage.enterUserId(username);
        loginPage.enterPassword(password);
        System.out.println("Username entered: " + username); // In @When
        System.out.println("loginPage object: " + loginPage); // Should not be null

    }

    @And("clicks on Login button")
    public void clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("Dashboard page should be displayed")
    public void dashboard_should_be_displayed() {
        String expectedUrl = "dashboard";
        boolean urlContainsDashboard = driver.getCurrentUrl().toLowerCase().contains(expectedUrl);
        Assert.assertTrue(urlContainsDashboard, "Dashboard is not displayed!");
    }
}
