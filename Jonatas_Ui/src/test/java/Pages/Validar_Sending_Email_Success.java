package Pages;

import java.io.IOException;

import Elementos.ElementSendingEmailSuccess;
public class Validar_Sending_Email_Success extends Browser {
	
	Metodos metodos = new Metodos();
	ElementSendingEmailSuccess elemento = new ElementSendingEmailSuccess();
	
	public void preemcherSendingEmailSuccess (String texto) throws IOException, InterruptedException {
		
		metodos.esperar(12000);
		metodos.screenshot("CT06 - EnviarFormularioInsurantData");
		metodos.clicar(elemento.getOk());
		
	}
}

