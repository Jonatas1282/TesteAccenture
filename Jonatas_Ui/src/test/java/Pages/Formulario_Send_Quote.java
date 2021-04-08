package Pages;

import java.io.IOException;
import Elementos.ElementsFormSendQuote;

public class Formulario_Send_Quote extends Browser {

	Metodos metodos = new Metodos();
	ElementsFormSendQuote elemento = new ElementsFormSendQuote();

	public void preencherFormSendQuode(String email, String phone, String userName, String password,
			String confirmPassword, String comments) throws IOException, InterruptedException {

		metodos.escrever(elemento.getEmail(), email);
		metodos.escrever(elemento.getPhone(), phone);
		metodos.escrever(elemento.getUserName(), userName);
		metodos.escrever(elemento.getPassword(), password);
		metodos.escrever(elemento.getConfirmPassword(), confirmPassword);
		metodos.escrever(elemento.getComments(), comments);
		metodos.screenshot("CT05 - EnviarFormularioInsurantData");
		metodos.clicar(elemento.getSend());

	}

}
