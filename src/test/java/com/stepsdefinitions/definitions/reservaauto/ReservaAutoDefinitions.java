package com.stepsdefinitions.definitions.reservaauto;

import com.stepsdefinitions.steps.reservaauto.ReservaAutoSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import java.util.List;
import java.util.Map;

public class ReservaAutoDefinitions {

    @Steps
    ReservaAutoSteps reservaAutoSteps;

    @When("Seleccionara la opcion de reservar auto")
    public void seleccionaraLaOpcionDeReservarAuto() {
        reservaAutoSteps.seleccionaraLaOpcionDeReservarAuto();
    }

    @When("Realizara la reservacion por aeropuerto y fechas")
    public void realizaraLaReservacionPorAeropuertoYFechas(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            String NombreAeropuertoRecogida = row.get("NombreAeropuertoRecogida");
            String NombreAeropuertoDevolucion = row.get("NombreAeropuertoDevolucion");
            String MesRecogida = row.get("MesRecogida");
            String DiaRecogida = row.get("DiaRecogida");
            String MesDevolucion = row.get("MesDevolucion");
            String DiaDevolucion = row.get("DiaDevolucion");
            reservaAutoSteps.realizaraLaReservacionPorAeropuertoYFechas(NombreAeropuertoRecogida, NombreAeropuertoDevolucion, MesRecogida, DiaRecogida, MesDevolucion, DiaDevolucion);
        }
    }

    @Then("Validara la informacion de los autos disponibles")
    public void validaraLaInformacionDeLosAutosDisponibles() {
        reservaAutoSteps.validaraLaInformacionDeLosAutosDisponibles();
    }

    @Then("Diligenciar datos del medio de pago tarjeta de credito")
    public void diligenciarDatosDelMedioDePagoTarjetaDeCredito(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            String NombreUsuario = row.get("Nombre");
            String Email = row.get("Email");
            String Telefono = row.get("Telefono");
            String NumeroTarjeta = row.get("NumeroTarjeta");
            String TitularTarjeta = row.get("TitularTarjeta");
            String Fecha = row.get("Fecha");
            String CVV = row.get("CVV");
            reservaAutoSteps.diligenciarDatosDelMedioDePagoTarjetaDeCredito(NombreUsuario, Email, Telefono, NumeroTarjeta, TitularTarjeta, Fecha, CVV);
        }
    }
}
