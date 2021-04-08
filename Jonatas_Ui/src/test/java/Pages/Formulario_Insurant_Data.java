package Pages;

import java.io.IOException;
import Elementos.ElementsFormInsurant;

public class Formulario_Insurant_Data {
	
	Metodos metodos = new Metodos();
	ElementsFormInsurant elemento = new ElementsFormInsurant();
	
	public void preencherFormInsurant (String firstName, String lastName, String dateOfBirth, String streetAddress,
			String zipCode, String city, String website, String imagem) throws IOException, InterruptedException {
		
		metodos.escrever(elemento.getFirstName(), firstName);
		metodos.escrever(elemento.getLastName(), lastName);
		metodos.escrever(elemento.getDateOfBirth(), dateOfBirth);
		metodos.clicar(elemento.getGender());
		metodos.screenshot("CT02 - EnviarFormularioInsurantData");
		metodos.escrever(elemento.getStreetAddress(), streetAddress);
		elemento.getSelCountry();
		metodos.escrever(elemento.getZipCode(), zipCode);
		metodos.escrever(elemento.getCity(), city);
		elemento.getSelOcupation();
		metodos.clicar(elemento.getHobbies());
		metodos.escrever(elemento.getWebsite(), website);
		metodos.escrever(elemento.getEnviarImagem(), imagem);
		metodos.screenshot("CT02 - EnviarFormularioInsurantData1");
		metodos.clicar(elemento.getNextProduct());
	
	}

}
