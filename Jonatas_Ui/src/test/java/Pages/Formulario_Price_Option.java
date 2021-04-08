package Pages;

import java.io.IOException;

import Elementos.elementsFormPriceOption;

public class Formulario_Price_Option {

	Metodos metodos = new Metodos();
	elementsFormPriceOption elemento = new elementsFormPriceOption();

	public void preencherFormPriceOption() throws IOException, InterruptedException {

		metodos.clicar(elemento.getSelPrice());
		metodos.screenshot("CT04 - EnviarFormularioPriceOption");
		metodos.esperar(3000);
		metodos.clicar(elemento.getNextSendQuote());
	
	}

}
