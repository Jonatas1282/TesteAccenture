package Elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Pages.Browser;

public class ElementsFormProduct extends Browser {

	private By startDate = By.id("startdate");
	private By optionalProducts = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");
	private By nextPrice = By.id("nextselectpriceoption");

	public By getStartDate() {
		return startDate;
	}

	public By getOptionalProducts() {
		return optionalProducts;
	}

	public By getNextPrice() {
		return nextPrice;
	}

	public void getInsuranceSum() {

		Select dropdown = new Select(adriver().findElement(By.id("insurancesum")));
		dropdown.selectByValue("10000000");

	}

	public void getMeritRating() {

		Select dropdown = new Select(adriver().findElement(By.id("meritrating")));
		dropdown.selectByValue("Bonus 3");

	}

	public void getDemageInsurance() {

		Select dropdown = new Select(adriver().findElement(By.id("damageinsurance")));
		dropdown.selectByValue("Full Coverage");

	}

	public void getCourtesyCar() {

		Select dropdown = new Select(adriver().findElement(By.id("courtesycar")));
		dropdown.selectByValue("Yes");

	}
}
