package org.ptech081.parking.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {

    // atributos intrissecos
    public LocalDate fechaInicio;
    public LocalTime horaInicio;
    public LocalDate fechaFin;
    public LocalTime horaFin;
    public Long valor;

    // atributos de relacion
    public Cupo cupo;
    public Carro carro;
    public Cliente cliente;

    
    


    public Registro() {
    }





    public Registro(LocalDate fechaInicio, LocalTime horaInicio, LocalDate fechaFin, LocalTime horaFin, Long valor,
            org.ptech081.parking.entities.Cupo cupo, org.ptech081.parking.entities.Carro carro,
            org.ptech081.parking.entities.Cliente cliente) {
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaFin = fechaFin;
        this.horaFin = horaFin;
        this.valor = valor;
        this.cupo = cupo;
        this.carro = carro;
        this.cliente = cliente;
    }

}
