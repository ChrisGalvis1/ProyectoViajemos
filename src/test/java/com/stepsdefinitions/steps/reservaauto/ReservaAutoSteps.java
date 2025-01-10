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
}
