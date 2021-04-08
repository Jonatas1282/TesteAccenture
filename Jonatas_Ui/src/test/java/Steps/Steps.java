package Steps;

import java.io.IOException;
import Elementos.ElementSendingEmailSuccess;
import Pages.Formulario_Insurant_Data;
import Pages.Formulario_Price_Option;
import Pages.Formulario_Product_Data;
import Pages.Formulario_Send_Quote;
import Pages.Formulario_Vehicle_Data;
import Pages.Metodos;
import Pages.Validar_Sending_Email_Success;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Steps {

	Metodos metodos = new Metodos();
	ElementSendingEmailSuccess elementos = new ElementSendingEmailSuccess();
	Formulario_Vehicle_Data form1 = new Formulario_Vehicle_Data();
	Formulario_Insurant_Data form2 = new Formulario_Insurant_Data();
	Formulario_Product_Data form3 = new Formulario_Product_Data();
	Formulario_Price_Option form4 = new Formulario_Price_Option();
	Formulario_Send_Quote form5 = new Formulario_Send_Quote();
	Validar_Sending_Email_Success form6 = new Validar_Sending_Email_Success();

	@Dado("^que esteja no site do teste$")
	public void que_esteja_no_site_do_teste() throws IOException {
		metodos.abrirNavegador("http://sampleapp.tricentis.com/101/app.php");

	}

	@Quando("^preencher os formulario da aba Vehicle Data$")
	public void preencher_os_formulario_da_aba_Vehicle_Data() throws IOException {

		form1.preencherFormVehicle("1200", "2000", "01/02/2020", "2", "250", "88000", "1234567890", "10000");

	}

	@Quando("^preencher os formulario da aba Insurant Data$")
	public void preencher_os_formulario_da_aba_Insurant_Data() throws Throwable {
		form2.preencherFormInsurant("Danilo", "Ruan", "09/04/2000", "Rua Delfino Antonio de Campos 29", "18220970",
				"São Paulo", "https://www.daniloruanjoselopes.com.br",
				"C:\\Users\\User\\framework\\Acc_Ui\\Evidencias");
	}

	@Quando("^preencher os formulario da aba Product Data$")
	public void preencher_os_formulario_da_aba_Product_Data() throws Throwable {
		form3.preencherFormInsurant("05/11/2021");
	}

	@Quando("^preencher os formulario da aba Price Option$")
	public void preencher_os_formulario_da_aba_Price_Option() throws Throwable {
		form4.preencherFormPriceOption();
	}

	@Quando("^preencher os formulario da aba Send Quote$")
	public void preencher_os_formulario_da_aba_Send_Quote() throws Throwable {
		form5.preencherFormSendQuode("daniloruanjoselopes_@tkk.com.br", "11983778773", "daniloruanjoselopes",
				"qDXMtta9lC", "qDXMtta9lC", "Todos os testes foram concluídos com sucesso");
	}

	@Entao("^valido a mensagem na tela$")
	public void valido_a_mensagem_na_tela() throws Throwable {

		form6.preemcherSendingEmailSuccess("Sending e-mail success!");

	}

}
