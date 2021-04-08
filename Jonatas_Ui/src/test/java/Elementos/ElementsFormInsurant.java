package Elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Pages.Browser;

public class ElementsFormInsurant extends Browser {
	
	private By firstName = By.id("firstname");
	private By lastName = By.id("lastname");
	private By dateOfBirth = By.id("birthdate");
	private By gender = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
	private By streetAddress = By.id("streetaddress");
	private By zipCode = By.id("zipcode");
	private By city = By.id("city");
	private By hobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span");
	private By website = By.id("website");
	private By enviarImagem = By.xpath("//*[@id=\"picture\"]");
	private By nextProduct = By.id("nextenterproductdata");
	
	public By getFirstName() {
		return firstName;
	}
	public By getLastName() {
		return lastName;
	}
	public By getDateOfBirth() {
		return dateOfBirth;
	}
	
	public By getGender() {
		return gender;
	}
	
	public By getStreetAddress() {
		return streetAddress;
	}
	public By getZipCode() {
		return zipCode;
	}
	public By getCity() {
		return city;
	}
	
	public By getHobbies() {
		return hobbies;
	}
	
	public By getWebsite() {
		return website;
	}
	
	public By getEnviarImagem() {
		return enviarImagem;
	}
	
	public By getNextProduct() {
		return nextProduct;
	}

	public void getSelCountry() {

		Select dropdown = new Select(adriver().findElement(By.id("country")));
		dropdown.selectByValue("Brazil");

	}

	public void getSelOcupation() {

		Select dropdown = new Select(adriver().findElement(By.id("occupation")));
		dropdown.selectByValue("Employee");

	}
	
}

