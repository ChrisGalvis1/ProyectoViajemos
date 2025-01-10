package com.pages.interactions.reservaauto;

import com.pages.ui.reservaauto.ReservaAutoUI;
import com.utils.SelectorElements;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.concurrent.ThreadLocalRandom;

public class ReservaAutoPage extends PageObject {

    ReservaAutoUI reservaAutoUI;
    private SelectorElements selectorElements;

    public ReservaAutoPage() {
        selectorElements = new SelectorElements(getDriver());
    }

    public void seleccionaraLaOpcionDeReservarAuto() {
        WebElement btnReservaAuto = reservaAutoUI.getBtnReservaAuto();
        try {
            btnReservaAuto.click();
            seleccionaraCheckDevolucion();
        } catch (NoSuchElementException e) {
            Assert.fail();
        }
    }

    public void seleccionaraCheckDevolucion() {
        WebElement checkOtraLocalidad = reservaAutoUI.getCheckOtraLocalidad();
        try {
            checkOtraLocalidad.click();
        } catch (NoSuchElementException e) {
            Assert.fail();
        }
    }

    public void ingresarNombreAeropuertoInicial(String nombreAeropuertoRecogida) {
        WebElement txtNombreAeropuertoRecogida = reservaAutoUI.getTxtNombreAeropuertoRecogida();
        WebElement listOpcionAeropuerto = reservaAutoUI.getListOpcionAeropuerto();
        try {
            txtNombreAeropuertoRecogida.click();
            txtNombreAeropuertoRecogida.sendKeys(nombreAeropuertoRecogida);
            waitFor(1).second();
            listOpcionAeropuerto.click();
        } catch (NoSuchElementException e) {
            Assert.fail();
        }
    }

    public void ingresarNombreAeropuertoFinal(String nombreAeropuertoDevolucion) {
        WebElement txtNombreAeropuertoDevolucion = reservaAutoUI.getTxtNombreAeropuertoDevolucion();
        WebElement listOpcionAeropuerto = reservaAutoUI.getListOpcionAeropuerto();
        try {
            txtNombreAeropuertoDevolucion.click();
            txtNombreAeropuertoDevolucion.sendKeys(nombreAeropuertoDevolucion);
            waitFor(1).second();
            listOpcionAeropuerto.click();
        } catch (NoSuchElementException e) {
            Assert.fail();
        }
    }

    public void seleccionarFechaInicio() {
        WebElement btnSeleccionarFecha = reservaAutoUI.getBtnSeleccionarFecha();
        try {
            btnSeleccionarFecha.click();
            waitFor(1).second();
        } catch (NoSuchElementException e) {
            Assert.fail();
        }
    }

    public void ingresarElMesInicial(String mesRecogida, String diaRecogida) {
        WebElement lblMesDisponibleCalendario1 = reservaAutoUI.getLblMesDisponibleCalendario1();
        WebElement lblMesDisponibleCalendario2 = reservaAutoUI.getLblMesDisponibleCalendario2();
        WebElement btnSiguienteMes = reservaAutoUI.getBtnSiguienteMes();
        String mesCapturado1 = lblMesDisponibleCalendario1.getText();
        String mesCapturado2 = lblMesDisponibleCalendario2.getText();
        String diaCapturado1 = "(//div[@class='container__days'])[1]//div[text()='";
        String diaCapturado2 = "(//div[@class='container__days'])[2]//div[text()='";
        try {
            if (mesCapturado1.contains(mesRecogida)) {
                selectorElements.bordearElemento((WebElementFacade) lblMesDisponibleCalendario1);
                selectorElements.bordearElemento(find(By.xpath(diaCapturado1 + diaRecogida + "']")));
                find(By.xpath(diaCapturado1 + diaRecogida + "']")).click();
            } else if (mesCapturado2.contains(mesRecogida)) {
                selectorElements.bordearElemento((WebElementFacade) lblMesDisponibleCalendario2);
                selectorElements.bordearElemento(find(By.xpath(diaCapturado2 + diaRecogida + "']")));
                find(By.xpath(diaCapturado2 + diaRecogida + "']")).click();
            } else {
                btnSiguienteMes.click();
                ingresarElMesInicial(mesRecogida, diaRecogida);
            }
        } catch (NoSuchElementException e) {
            Assert.fail();
        }
    }

    public void ingresarElMesFinal(String mesDevolucion, String diaDevolucion) {
        WebElement lblMesDisponibleCalendario1 = reservaAutoUI.getLblMesDisponibleCalendario1();
        WebElement lblMesDisponibleCalendario2 = reservaAutoUI.getLblMesDisponibleCalendario2();
        WebElement btnSiguienteMes = reservaAutoUI.getBtnSiguienteMes();
        String mesCapturado1 = lblMesDisponibleCalendario1.getText();
        String mesCapturado2 = lblMesDisponibleCalendario2.getText();
        String diaCapturado1 = "(//div[@class='container__days'])[1]//div[text()='";
        String diaCapturado2 = "(//div[@class='container__days'])[2]//div[text()='";
        try {
            if (mesCapturado1.contains(mesDevolucion)) {
                selectorElements.bordearElemento((WebElementFacade) lblMesDisponibleCalendario1);
                selectorElements.bordearElemento(find(By.xpath(diaCapturado1 + diaDevolucion + "']")));
                find(By.xpath(diaCapturado1 + diaDevolucion + "']")).click();
                //waitFor(1).second();
                //seleccionarHorarioAleatorio();
            } else if (mesCapturado2.contains(mesDevolucion)) {
                selectorElements.bordearElemento((WebElementFacade) lblMesDisponibleCalendario2);
                selectorElements.bordearElemento(find(By.xpath(diaCapturado2 + diaDevolucion + "']")));
                find(By.xpath(diaCapturado2 + diaDevolucion + "']")).click();
                //waitFor(1).second();
                //seleccionarHorarioAleatorio();
            } else {
                btnSiguienteMes.click();
                ingresarElMesFinal(mesDevolucion, diaDevolucion);
            }
        } catch (NoSuchElementException e) {
            Assert.fail();
        }
    }

    public void seleccionarHorarioAleatorio() {
        WebElement lblSeleccionarHorario = reservaAutoUI.getLblSeleccionarHorario();
        String horarioAleatorio1 = selectorElements.generarNumeroAleatorio();
        String horarioAleatorio2 = selectorElements.generarNumeroAleatorio();
        String horarioInicial = "//div[@class='timepicker-car__columns grid-pickers__hour qs-hours grid-pickers__hour--fadein']//div[@class='timepicker-car__column qs-hours__col-pickup d-grid scroll-ghost']//button[" + horarioAleatorio1 + "]";
        String horarioFInal = "//div[@class='timepicker-car__columns grid-pickers__hour qs-hours grid-pickers__hour--fadein']//div[@class='timepicker-car__column qs-hours__col-return d-grid scroll-ghost']//button[" + horarioAleatorio2 + "]";
        try {
            lblSeleccionarHorario.click();
            waitFor(1).second();
            find(By.xpath(horarioInicial)).click();
            find(By.xpath(horarioFInal)).click();
        } catch (NoSuchElementException e) {
            Assert.fail();
        }
    }

    public void darClickBuscarAutos() {
        WebElement btnBuscar = reservaAutoUI.getBtnBuscar();
        try {
            btnBuscar.click();
            waitFor(7).seconds();
        } catch (NoSuchElementException e) {
            Assert.fail();
        }
    }

    public void validaraLaInformacionDeLosAutosDisponibles() {
        try {
            for (int i = 1; i <= 10; i++) {
                String nombreAuto = "((//div[@class='layout-availability__items']//div//article)[" + i + "]//div[@class='card-vehicle__car']//a//div//span[1])[1]";
                String precioAuto = "((//div[@class='layout-availability__items']//div//article)[" + i + "]//div[@class='card-vehicle__footer role-list align-items-center']//div//div[@class='price | d-inline-block | undefined ']//p//span)[2]";
                Assert.assertTrue(find(By.xpath(nombreAuto)).isDisplayed());
                selectorElements.bordearElemento(find(By.xpath(nombreAuto)));
                Assert.assertTrue(find(By.xpath(precioAuto)).isDisplayed());
                selectorElements.scrollToElement(find(By.xpath(precioAuto)));
                selectorElements.bordearElemento(find(By.xpath(precioAuto)));
                waitFor(1).second();
            }
        } catch (NoSuchElementException e) {
            Assert.fail();
        }
    }

    public void seleccionarAutoReservar() {
        int numeroAleatorio = ThreadLocalRandom.current().nextInt(2, 11);
        int numeroAleatorio1 = numeroAleatorio-1;
        String seleccionarAutoAleatorio = "(//div[@class='layout-availability__items']//div//article)[" + numeroAleatorio + "]//div[@class='card-vehicle__footer role-list align-items-center']//*[text()='RESERVAR']";
        String nombreAuto = "((//div[@class='layout-availability__items']//div//article)[" + numeroAleatorio1 + "]//div[@class='card-vehicle__car']//a//div//span[1])[1]";
        try {
            selectorElements.scrollToElement(find(By.xpath(nombreAuto)));
            selectorElements.bordearElemento(find(By.xpath(seleccionarAutoAleatorio)));
            waitFor(1).second();
            find(By.xpath(seleccionarAutoAleatorio)).click();
            waitFor(5).seconds();
        } catch (NoSuchElementException e) {
            Assert.fail();
        }
    }

    public void ingresarNombreUsuarioTarjeta(String nombreUsuario) {
        WebElement txtNombreUsuario = reservaAutoUI.getTxtNombreUsuario();
        try {
            selectorElements.scrollToElement((WebElementFacade) txtNombreUsuario);
            txtNombreUsuario.sendKeys(nombreUsuario);
        } catch (NoSuchElementException e) {
            Assert.fail();
        }
    }

    public void ingresarEmailUsuarioTarjeta(String email) {
        WebElement txtEmail = reservaAutoUI.getTxtEmail();
        try {
            txtEmail.sendKeys(email);
        } catch (NoSuchElementException e) {
            Assert.fail();
        }
    }

    public void ingresarTelefonoUsuarioTarjeta(String telefono) {
        WebElement txtTelefono = reservaAutoUI.getTxtTelefono();
        try {
            txtTelefono.sendKeys(telefono);
        } catch (NoSuchElementException e) {
            Assert.fail();
        }
    }

    public void ingresarNumeroTarjeta(String numeroTarjeta) {
        WebElement txtNumeroTarjeta = reservaAutoUI.getTxtNumeroTarjeta();
        try {
            //selectorElements.scrollToElement((WebElementFacade) txtNumeroTarjeta);
            txtNumeroTarjeta.sendKeys(numeroTarjeta);
        } catch (NoSuchElementException e) {
            Assert.fail();
        }
    }

    public void ingresarTitularTarjeta(String titularTarjeta) {
        WebElement txtMesTarjeta = reservaAutoUI.getTxtMesTarjeta();
        try {
            txtMesTarjeta.sendKeys(titularTarjeta);
        } catch (NoSuchElementException e) {
            Assert.fail();
        }
    }

    public void ingresarFechaTarjeta(String fecha) {
        WebElement txtTitularTarjeta = reservaAutoUI.getTitularTarjeta();
        try {
            txtTitularTarjeta.sendKeys(fecha);
        } catch (NoSuchElementException e) {
            Assert.fail();
        }
    }

    public void ingresarCvvTarjeta(String cvv) {
        WebElement txtCvvTarjeta = reservaAutoUI.getTxtCvvTarjeta();
        try {
            txtCvvTarjeta.sendKeys(cvv);
        } catch (NoSuchElementException e) {
            Assert.fail();
        }
    }

    public void darClickPagarAhora() {
        WebElement btnPagarAhora = reservaAutoUI.getBtnPagarAhora();
        try {
            Assert.assertTrue(btnPagarAhora.isDisplayed());
            selectorElements.bordearElemento((WebElementFacade) btnPagarAhora);
            waitFor(1).second();
        } catch (NoSuchElementException e) {
            Assert.fail();
        }
    }

}
