package org.ptech081.parking;

import org.ptech081.parking.entities.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.ptech081.parking.entities.Registro;

public class Main {
    public static void main(String[] args) {
        // crear carros con los constructores
        Carro carrito1 = new Carro("ABC 456", TipoVehiculo.Moto);
        Carro carrito2 = new Carro();
        carrito2.placa = "ADF 123";
        carrito2.tipoVehiculo = TipoVehiculo.Camioneta;

        // cliente
        Cliente cliente1 = new Cliente("danner", "arias", 1290129L);
        Cliente cliente2 = new Cliente("dann", "arias", 1210129L);

        cliente1.addCar(carrito1);
        cliente1.addCar("GHS 123", TipoVehiculo.Bus);

        cliente2.addCar(carrito2);
        cliente2.addCar("GRS 123", TipoVehiculo.Moto);

        Cupo cupo1 = new Cupo('A');
        Cupo cupo2 = new Cupo('B');

        // Crear dos regitros
        LocalDate fechaInicio = LocalDate.now();
        LocalTime horaInicio = LocalTime.now();
        LocalDate fechaFin = LocalDate.of(2024, Month.MARCH, 21);
        LocalTime horaFin = LocalTime.of(11, 30, 00);

        LocalDate fechaInicio2 = LocalDate.now();
        LocalTime horaInicio2 = LocalTime.now();
        LocalDate fechaFin2 = LocalDate.of(2024, Month.MARCH, 21);
        LocalTime horaFin2 = LocalTime.of(11, 30, 00);


        List<Registro> misRegistros = new ArrayList<Registro>();

        // crear registro

        Registro registro1 = new Registro(fechaInicio, horaInicio, fechaFin, horaFin, 2000L, cupo1, cliente1.misCarros.get(0),cliente1);
        Registro registro2 = new Registro(fechaInicio2, horaInicio2, fechaFin2, horaFin2, 3000L, cupo2, cliente2.misCarros.get(1),cliente2);


        // añadir registro a la lista
        misRegistros.add(registro1);
        misRegistros.add(registro2);


        for( Registro r : misRegistros){

            System.out.println("Cliente: " + r.cliente.nombre + " " + r.cliente.apellidos + " | " + r.carro.placa + " | " + r.cupo.cupo + " | " + r.fechaInicio + "  " + r.horaInicio + " | " + r.fechaFin + " "+ r.horaFin + " | " + r.valor );


        }
        
    }
}