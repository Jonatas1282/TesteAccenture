package Elementos;

import org.openqa.selenium.By;
import Pages.Browser;

public class ElementSendingEmailSuccess extends Browser {

	private By ok = By.xpath("/html/body/div[4]/div[7]/div/button");

	public By getOk() {
		return ok;
	}

}
