@ReservaAuto
Feature: Reservas de Autos
  Yo como usuario de la plataforma Viajemos.com
  Quiero realizar reservas de autos
  Para tenerlo disponible segun la localidad y fechas seleccionadas

  @CrearReserva_Login
  Scenario Outline: Crear una reserva de auto con Login
    Given El usuario ingresa a la pagina de Viajemos
    And Desea realizar login
    When Seleccionara la opcion de reservar auto
    And Realizara la reservacion por aeropuerto y fechas
      | NombreAeropuertoRecogida   | NombreAeropuertoDevolucion   | MesRecogida   | DiaRecogida   | MesDevolucion   | DiaDevolucion   |
      | <NombreAeropuertoRecogida> | <NombreAeropuertoDevolucion> | <MesRecogida> | <DiaRecogida> | <MesDevolucion> | <DiaDevolucion> |
    Then Validara la informacion de los autos disponibles

    Examples:
      | NombreAeropuertoRecogida | NombreAeropuertoDevolucion | MesRecogida | DiaRecogida | MesDevolucion | DiaDevolucion |
      | Aeropuerto de Barcelona  | Aeropuerto de Madrid       | Julio       | 20          | Julio         | 22            |

  @CrearReserva_SinLogin
  Scenario Outline: Crear una reserva de auto sin Login
    Given El usuario ingresa a la pagina de Viajemos
    When Seleccionara la opcion de reservar auto
    And Realizara la reservacion por aeropuerto y fechas
      | NombreAeropuertoRecogida   | NombreAeropuertoDevolucion   | MesRecogida   | DiaRecogida   | MesDevolucion   | DiaDevolucion   |
      | <NombreAeropuertoRecogida> | <NombreAeropuertoDevolucion> | <MesRecogida> | <DiaRecogida> | <MesDevolucion> | <DiaDevolucion> |
    Then Validara la informacion de los autos disponibles

    Examples:
      | NombreAeropuertoRecogida | NombreAeropuertoDevolucion | MesRecogida | DiaRecogida | MesDevolucion | DiaDevolucion |
      | Aeropuerto de Barcelona  | Aeropuerto de Madrid       | Julio       | 20          | Julio         | 22            |

  @CrearReservaMedioPagoTarjetaCredito
  Scenario Outline: Crear una reserva de auto con medio de pago Tarjeta de credito
    Given El usuario ingresa a la pagina de Viajemos
    And Desea realizar login
    When Seleccionara la opcion de reservar auto
    And Realizara la reservacion por aeropuerto y fechas
      | NombreAeropuertoRecogida   | NombreAeropuertoDevolucion   | MesRecogida   | DiaRecogida   | MesDevolucion   | DiaDevolucion   |
      | <NombreAeropuertoRecogida> | <NombreAeropuertoDevolucion> | <MesRecogida> | <DiaRecogida> | <MesDevolucion> | <DiaDevolucion> |
    Then Validara la informacion de los autos disponibles

    Examples:
      | NombreAeropuertoRecogida | NombreAeropuertoDevolucion | MesRecogida | DiaRecogida | MesDevolucion | DiaDevolucion |
      | Aeropuerto de Barcelona  | Aeropuerto de Madrid       | Julio       | 20          | Julio         | 22            |