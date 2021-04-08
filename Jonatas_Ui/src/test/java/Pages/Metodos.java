package Pages;

import static org.junit.Assert.assertEquals;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class Metodos extends Browser {

	public void escrever(By elemnto, String texto) {
		adriver().findElement(elemnto).sendKeys(texto);

	}

	public void clicar(By elemento) {
		adriver().findElement(elemento).click();

	}

	public void screenshot(String nomeSrc) throws IOException {

		TakesScreenshot srcShot = ((TakesScreenshot)adriver());
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Evidencias/"+nomeSrc+".png");
		FileUtils.copyFile(srcFile, destFile);

	}

	public void validarTexto(String text, By elemento) {

		WebElement paginaAtual = adriver().findElement(elemento);
		assertEquals(text, paginaAtual);
	}

	public void esperar(int tempo) throws InterruptedException {

		Thread.sleep(tempo);
	}
	
	public void fecharAba() {
		
		adriver().switchTo().window(null);
		  

	}
}
