package Pages;

import java.io.IOException;
import Elementos.ElementsFormProduct;

public class Formulario_Product_Data {

	Metodos metodos = new Metodos();
	ElementsFormProduct elemento = new ElementsFormProduct();

	public void preencherFormInsurant(String startDate) throws IOException {

		metodos.escrever(elemento.getStartDate(), startDate);
		elemento.getInsuranceSum();
		elemento.getMeritRating();
		elemento.getDemageInsurance();
		metodos.clicar(elemento.getOptionalProducts());
		elemento.getCourtesyCar();
		metodos.screenshot("CT03 - EnviarFormularioProductData");
		metodos.clicar(elemento.getNextPrice());

	}

}
