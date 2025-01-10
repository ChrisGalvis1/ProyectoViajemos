package com.pages.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

public class LoginUI extends PageObject {

    @FindBy(xpath = "//div[@class='d-flex']//a[@id='btnOpenLogin']")
    WebElementFacade btnIniciarSesion;

    public WebElement getBtnIniciarSesion(){
        return btnIniciarSesion;
    }

    @FindBy(xpath = "//div[@class='d-grid gap-S']//input[@id='inpEmail']")
    WebElementFacade txtUsuario;

    public WebElement getTxtUsuario(){
        return txtUsuario;
    }

    @FindBy(xpath = "//div[@class='d-grid gap-S']//input[@id='inpPassword']")
    WebElementFacade txtContrasena;

    public WebElement getTxtContrasena(){
        return txtContrasena;
    }

    @FindBy(xpath = "//div[@class='d-grid gap-S']//a[@id='btnLogin']")
    WebElementFacade btnLogin;

    public WebElement getBtnLogin(){
        return btnLogin;
    }
}
