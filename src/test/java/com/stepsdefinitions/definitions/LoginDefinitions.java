package com.stepsdefinitions.definitions;

import com.stepsdefinitions.steps.LoginSteps;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class LoginDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Given("El usuario ingresa a la pagina de Viajemos")
    public void elUsuarioIngresaALaPaginaDeViajemos() {
        loginSteps.elUsuarioIngresaALaPaginaDeViajemos();
    }

    @Given("Desea realizar login")
    public void deseaRealizarLogin() {
        loginSteps.deseaRealizarLogin();
    }
}
