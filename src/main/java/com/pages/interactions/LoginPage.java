package com.pages.interactions;

import com.pages.ui.LoginUI;
import com.utils.LoginConfig;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageObject {

    LoginUI loginUI;
    LoginConfig loginConfig;

    public void darClicEnIniciarSesion() {
        WebElement btnIniciarSesion = loginUI.getBtnIniciarSesion();
        try {
            btnIniciarSesion.click();
        }catch (NoSuchElementException e){
            Assert.fail();
        }
    }

    public void ingresarUsuarioYContraseña() {
        WebElement txtUsuario = loginUI.getTxtUsuario();
        WebElement txtContrasena = loginUI.getTxtContrasena();
        String username = loginConfig.getUsername();
        String password = loginConfig.getPassword();
        try {
            txtUsuario.sendKeys(username);
            txtContrasena.sendKeys(password);
        }catch (NoSuchElementException e){
            Assert.fail();
        }
    }

    public void iniciarSesion() {
        WebElement btnLogin = loginUI.getBtnLogin();
        try {
            btnLogin.click();
            waitFor(2).seconds();
        }catch (NoSuchElementException e){
            Assert.fail();
        }
    }
}
