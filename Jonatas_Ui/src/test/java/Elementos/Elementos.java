package Elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Pages.Browser;

public class Elementos extends Browser {

	private By cylinderCapacity = By.id("cylindercapacity");
	private By enginePerformace = By.id("engineperformance");
	private By dateOfManufacture = By.id("dateofmanufacture");
	private By rightHandDrive = By.id("righthanddriveno");
	private By selHands = By.cssSelector(
			"#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(2) > span");
	private By payload = By.id("payload");
	private By totalWeight = By.id("totalweight");
	private By listPrice = By.id("listprice");
	private By licence = By.id("licenseplatenumber");
	private By annualMileage = By.id("annualmileage");
	private By nextInsurant = By.id("nextenterinsurantdata");

	public By getCylinder() {
		return cylinderCapacity;
	}

	public By getPerformace() {
		return enginePerformace;
	}

	public By getFabrication() {
		return dateOfManufacture;
	}

	public By getRightHandDrive() {
		return rightHandDrive;
	}

	public By getPayload() {
		return payload;
	}

	public By getWeight() {
		return totalWeight;
	}

	public By getPrice() {
		return listPrice;
	}

	public By getLicence() {
		return licence;
	}

	public By getMileage() {
		return annualMileage;
	}

	public By getNextInsurant() {
		return nextInsurant;
	}

	public By getSelHands() {
		return selHands;
	}

	public void getSelFluel() {

		Select dropdown = new Select(adriver().findElement(By.id("fuel")));
		dropdown.selectByValue("Electric Power");

	}

	public void getSelMoto() {

		Select dropdown = new Select(adriver().findElement(By.id("numberofseatsmotorcycle")));
		dropdown.selectByValue("2");

	}

	public void getSelSeats() {

		Select dropdown = new Select(getDriver().findElement(By.id("numberofseats")));
		dropdown.selectByValue("2");

	}

	public void getSelModel() {

		Select dropdown = new Select(getDriver().findElement(By.id("model")));
		dropdown.selectByVisibleText("Scooter");

	}

	public void getSelMake() {
		Select dropdown = new Select(adriver().findElement(By.id("make")));
		dropdown.selectByValue("BMW");

	}



}
