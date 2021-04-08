package Elementos;

import org.openqa.selenium.By;
import Pages.Browser;
import Pages.Metodos;



public class elementsFormPriceOption extends Browser{
	
	Metodos metodos = new Metodos();
	
	private By selPrice = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span");
	private By nextSendQuote = By.id("nextsendquote");
	
	public By getSelPrice() {
		return selPrice;
	}
	
	public By getNextSendQuote() {
		return nextSendQuote;
	}

}
