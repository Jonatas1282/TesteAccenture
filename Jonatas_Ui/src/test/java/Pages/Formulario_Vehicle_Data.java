package Pages;

import java.io.IOException;
import Elementos.Elementos;

public class Formulario_Vehicle_Data {

	Metodos metodos = new Metodos();
	Elementos elemento = new Elementos();
	
	public void preencherFormVehicle(String cylinder, String performace, String fabrication, String payload,
			String weight, String price, String licence, String mileage) throws IOException {
		
		elemento.getSelMake();
		elemento.getSelModel();
		metodos.escrever(elemento.getCylinder(), cylinder);
		metodos.escrever(elemento.getPerformace(), performace);
		metodos.escrever(elemento.getFabrication(), fabrication);
		elemento.getSelSeats();
		metodos.clicar(elemento.getSelHands());
		elemento.getSelMoto();
		elemento.getSelFluel();
		metodos.escrever(elemento.getPayload(), payload);
		metodos.escrever(elemento.getWeight(), weight);
		metodos.escrever(elemento.getPrice(), price);
		metodos.escrever(elemento.getLicence(), licence);
		metodos.escrever(elemento.getMileage(), mileage);
		
		metodos.screenshot("CT01 - EnviarFormularioVehicleData");
		
		metodos.clicar(elemento.getNextInsurant());

	}

}
