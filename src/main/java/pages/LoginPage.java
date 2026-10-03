package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	// Locators of element presents in the page
	// Private access modifier can be use within the class

	private WebDriver driver;
	private By usernameTextBox = By.id("Email");
	private By paswordTextBox = By.id("Password");
	private By loginButton = By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button");

	// Action function
	// Constructor is the function in class which having same name as class, will
	// pass instance as argument also

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUserName(String username) {
		driver.findElement(usernameTextBox).clear();
		driver.findElement(usernameTextBox).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(paswordTextBox).clear();
		driver.findElement(paswordTextBox).sendKeys(password);
	}

	public void ClcikLoginButton() {
		driver.findElement(loginButton).click();
	}
}
