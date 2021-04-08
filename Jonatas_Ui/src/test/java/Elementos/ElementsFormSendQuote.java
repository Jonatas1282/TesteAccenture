package Elementos;

import org.openqa.selenium.By;
import Pages.Browser;

public class ElementsFormSendQuote extends Browser {

	private By email = By.id("email");
	private By phone = By.id("phone");
	private By userName = By.id("username");
	private By password = By.id("password");
	private By confirmPassword = By.id("confirmpassword");
	private By comments = By.id("Comments");
	private By send = By.id("sendemail");

	public By getEmail() {
		return email;
	}

	public By getPhone() {
		return phone;
	}

	public By getUserName() {
		return userName;
	}

	public By getPassword() {
		return password;
	}

	public By getConfirmPassword() {
		return confirmPassword;
	}

	public By getComments() {
		return comments;
	}

	public By getSend() {
		return send;
	}
}
