$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Accenture-.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#Author: jonata.rosa@hotmail.com"
    }
  ],
  "line": 4,
  "name": "Preencher formularios",
  "description": " Eu como usuario quero acessar site para preencher os formularios e enviar um email",
  "id": "preencher-formularios",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@Executa"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "Preencher os formularios e enviar um email",
  "description": "",
  "id": "preencher-formularios;preencher-os-formularios-e-enviar-um-email",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@Executa1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que esteja no site do teste",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "preencher os formulario da aba Vehicle Data",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "preencher os formulario da aba Insurant Data",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "preencher os formulario da aba Product Data",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "preencher os formulario da aba Price Option",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "preencher os formulario da aba Send Quote",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "valido a mensagem na tela",
  "keyword": "Entao "
});
formatter.match({
  "location": "Steps.que_esteja_no_site_do_teste()"
});
formatter.result({
  "duration": 5817890000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.preencher_os_formulario_da_aba_Vehicle_Data()"
});
formatter.result({
  "duration": 1455639300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.preencher_os_formulario_da_aba_Insurant_Data()"
});
formatter.result({
  "duration": 1639999200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.preencher_os_formulario_da_aba_Product_Data()"
});
formatter.result({
  "duration": 772405700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.preencher_os_formulario_da_aba_Price_Option()"
});
formatter.result({
  "duration": 3508032000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.preencher_os_formulario_da_aba_Send_Quote()"
});
formatter.result({
  "duration": 1009534000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.valido_a_mensagem_na_tela()"
});
formatter.result({
  "duration": 12413164000,
  "status": "passed"
});
});