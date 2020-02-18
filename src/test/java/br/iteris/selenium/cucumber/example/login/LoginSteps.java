package br.iteris.selenium.cucumber.example.login;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
    private LoginRobot robot = new LoginRobot();

    @Dado("^Que eu abri o Firefox no credenciamento em UAT$")
    public void i_opened_the_uat_page() {
        robot.openLoginPage();
    }

    @Quando("^Eu clico no hiperlink \"([^\"]*)\"$")
    public void i_click_on_the_hyperlink(String button) {
        robot.clickOnHyperlink(button);
    }

    @E("^Eu clicar no botão \"([^\"]*)\"$")
    public void i_click_on(String button) {
        robot.clickOnButton(button);
    }

    @E("^Eu digitar um CPF válido$")
    public void i_type_a_valid_cpf() {
        robot.typeAValidCpf();
    }

    @E("^Eu digitar um CPF inválido")
    public void i_type_a_invalid_cpf() {
        robot.typeAnInvalidCpf();
    }

    @Entao("^Eu devo ver o campo \"([^\"]*)\"$")
    public void i_should_see_the_field(String field) {
        robot.checkFieldIsVisible(field);
    }

    @E("^Eu devo ver o botão \"([^\"]*)\"$")
    public void i_should_see_the_button(String button) {
        robot.checkButtonIsVisible(button);
    }

    @E("^Eu devo esperar o carregamento$")
    public void i_have_to_wait_the_loading() {
        robot.waitForLoading();
    }

    @E("^Eu devo ver o paragrafo \"([^\"]*)\"$")
    public void i_should_see_the_paragraph(String text) {
        robot.checkParagraphIsVisible(text);
    }
}
