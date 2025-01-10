package com.pages.ui.reservaauto;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

public class ReservaAutoUI extends PageObject {

    @FindBy(xpath = "//div[@data-tabs='quicksearch']//a[3]")
    WebElementFacade btnReservaAuto;

    public WebElement getBtnReservaAuto(){
        return btnReservaAuto;
    }

    @FindBy(xpath = "//div[@class='quicksearch__switch justify-self-start mr-auto']//span[1]")
    WebElementFacade checkOtraLocalidad;

    public WebElement getCheckOtraLocalidad(){
        return checkOtraLocalidad;
    }

    @FindBy(xpath = "//div[@class='quicksearch__location d-grid d-md-flex']//label[1]//input[@data-link='pickupLocation']")
    WebElementFacade txtNombreAeropuertoRecogida;

    public WebElement getTxtNombreAeropuertoRecogida(){
        return txtNombreAeropuertoRecogida;
    }

    @FindBy(xpath = "//div[@class='quicksearch__location d-grid d-md-flex']//label[2]//input[@data-link='returnLocation']")
    WebElementFacade txtNombreAeropuertoDevolucion;

    public WebElement getTxtNombreAeropuertoDevolucion(){
        return txtNombreAeropuertoDevolucion;
    }

    @FindBy(xpath = "//div[@class='modal__dialog modal-lg--fullscreen-down']//ul//li[@data-modal='.datepicker-car'][1]")
    WebElementFacade listOpcionAeropuerto;

    public WebElement getListOpcionAeropuerto(){
        return listOpcionAeropuerto;
    }

    @FindBy(xpath = "//div[@class='quicksearch__date']//label[1]//input[@data-modal='.datepicker-car']")
    WebElementFacade btnSeleccionarFecha;

    public WebElement getBtnSeleccionarFecha(){
        return btnSeleccionarFecha;
    }

    @FindBy(xpath = "(//div[@class='month-item-header']//div//strong)[1]")
    WebElementFacade lblMesDisponibleCalendario1;

    public WebElement getLblMesDisponibleCalendario1(){
        return lblMesDisponibleCalendario1;
    }

    @FindBy(xpath = "(//div[@class='month-item-header']//div//strong)[2]")
    WebElementFacade lblMesDisponibleCalendario2;

    public WebElement getLblMesDisponibleCalendario2(){
        return lblMesDisponibleCalendario2;
    }

    @FindBy(xpath = "(//div[@class='month-item-header'])[2]//button[@class='button-next-month']")
    WebElementFacade btnSiguienteMes;

    public WebElement getBtnSiguienteMes(){
        return btnSiguienteMes;
    }

    @FindBy(xpath = "//div[@class='quicksearch__date']//span[@data-class='quicksearch_car_pickup_time']//div")
    WebElementFacade lblSeleccionarHorario;

    public WebElement getLblSeleccionarHorario(){
        return lblSeleccionarHorario;
    }

    @FindBy(xpath = "((//div[@data-tabs='quicksearch'])[3]//a)[1]")
    WebElementFacade btnBuscar;

    public WebElement getBtnBuscar(){
        return btnBuscar;
    }

    @FindBy(xpath = "//div[@class='d-grid y gap-L']//input[@id='inpName']")
    WebElementFacade txtNombreUsuario;

    public WebElement getTxtNombreUsuario(){
        return txtNombreUsuario;
    }

    @FindBy(xpath = "//div[@class='d-grid y gap-L']//input[@id='inpEmail']")
    WebElementFacade txtEmail;

    public WebElement getTxtEmail(){
        return txtEmail;
    }

    @FindBy(xpath = "//div[@class='d-grid y gap-L']//input[@id='phoneCustom']")
    WebElementFacade txtTelefono;

    public WebElement getTxtTelefono(){
        return txtTelefono;
    }

    @FindBy(xpath = "//*[@id='credit-card-number']")
    WebElementFacade txtNumeroTarjeta;

    public WebElement getTxtNumeroTarjeta(){
        return txtNumeroTarjeta;
    }

    @FindBy(xpath = "//div[@data-payment='CreditCard']//div[@class='grid-credit']//div[@id='expireDate']")
    WebElementFacade txtMesTarjeta;

    public WebElement getTxtMesTarjeta(){
        return txtMesTarjeta;
    }

    @FindBy(xpath = "//div[@data-payment='CreditCard']//div[@class='grid-credit']//div[@id='cardholder-name']")
    WebElementFacade txtTitularTarjeta;

    public WebElement getTitularTarjeta(){
        return txtTitularTarjeta;
    }

    @FindBy(xpath = "//div[@data-payment='CreditCard']//div[@class='grid-credit']//div[@id='cvv']")
    WebElementFacade txtCvvTarjeta;

    public WebElement getTxtCvvTarjeta(){
        return txtCvvTarjeta;
    }

    @FindBy(xpath = "//div[@data-payment='CreditCard']//div//*[text()='PAGAR AHORA']")
    WebElementFacade btnPagarAhora;

    public WebElement getBtnPagarAhora(){
        return btnPagarAhora;
    }
}
