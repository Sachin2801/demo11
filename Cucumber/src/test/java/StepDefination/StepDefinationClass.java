package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationClass{ 
WebDriver driver;

	@Given("User is on Login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sachin Jathar\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

	}
	@When("User Entered Valid Login Id and Password")
	public void user_entered_valid_login_id_and_password() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	@Then("User is on Home Page")
	public void user_is_on_home_page() {
		System.out.println(driver.getTitle());
	}
}
