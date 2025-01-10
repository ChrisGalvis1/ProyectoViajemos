package com.stepsdefinitions.steps;

import com.pages.interactions.LoginPage;
import com.utils.LoginConfig;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class LoginSteps extends LoginPage{

    LoginPage loginPage;
    LoginConfig loginConfig;

    @Step
    public void elUsuarioIngresaALaPaginaDeViajemos() {
        String baseUrl = loginConfig.getBaseUrl();
        loginPage.openAt(baseUrl);
    }

    @Step
    public void deseaRealizarLogin() {
        loginPage.darClicEnIniciarSesion();
        loginPage.ingresarUsuarioYContraseña();
        loginPage.iniciarSesion();
    }
}
