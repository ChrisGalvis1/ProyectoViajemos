package com.stepsdefinitions.steps.reservaauto;

import com.pages.interactions.reservaauto.ReservaAutoPage;
import net.thucydides.core.annotations.Step;

public class ReservaAutoSteps extends ReservaAutoPage {

    ReservaAutoPage reservaAutoPage;

    @Step
    public void seleccionaraLaOpcionDeReservarAuto() {
        reservaAutoPage.seleccionaraLaOpcionDeReservarAuto();
    }

    @Step
    public void realizaraLaReservacionPorAeropuertoYFechas(String nombreAeropuertoRecogida, String nombreAeropuertoDevolucion, String mesRecogida, String diaRecogida, String mesDevolucion, String diaDevolucion) {
        reservaAutoPage.ingresarNombreAeropuertoInicial(nombreAeropuertoRecogida);
        reservaAutoPage.ingresarNombreAeropuertoFinal(nombreAeropuertoDevolucion);
        reservaAutoPage.seleccionarFechaInicio();
        reservaAutoPage.ingresarElMesInicial(mesRecogida, diaRecogida);
        reservaAutoPage.ingresarElMesFinal(mesDevolucion, diaDevolucion);
        reservaAutoPage.darClickBuscarAutos();
    }

    @Step
    public void validaraLaInformacionDeLosAutosDisponibles() {
        reservaAutoPage.validaraLaInformacionDeLosAutosDisponibles();
    }

    @Step
    public void diligenciarDatosDelMedioDePagoTarjetaDeCredito(String nombreUsuario, String email, String telefono, String numeroTarjeta, String titularTarjeta, String fecha, String cvv) {
        reservaAutoPage.seleccionarAutoReservar();
        reservaAutoPage.ingresarNombreUsuarioTarjeta(nombreUsuario);
        reservaAutoPage.ingresarEmailUsuarioTarjeta(email);
        reservaAutoPage.ingresarTelefonoUsuarioTarjeta(telefono);
        reservaAutoPage.ingresarNumeroTarjeta(numeroTarjeta);
        reservaAutoPage.ingresarTitularTarjeta(titularTarjeta);
        reservaAutoPage.ingresarFechaTarjeta(fecha);
        reservaAutoPage.ingresarCvvTarjeta(cvv);
        reservaAutoPage.darClickPagarAhora();
    }
}
