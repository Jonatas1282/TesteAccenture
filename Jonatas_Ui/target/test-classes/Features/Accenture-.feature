#language: pt
#Author: jonata.rosa@hotmail.com
@Executa
Funcionalidade: Preencher formularios
 	 Eu como usuario quero acessar site para preencher os formularios e enviar um email

@Executa1
Cenario: Preencher os formularios e enviar um email
   Dado que esteja no site do teste
   Quando preencher os formulario da aba Vehicle Data		
	 E preencher os formulario da aba Insurant Data
	 E preencher os formulario da aba Product Data
	 E preencher os formulario da aba Price Option
	 E preencher os formulario da aba Send Quote
	 Entao valido a mensagem na tela