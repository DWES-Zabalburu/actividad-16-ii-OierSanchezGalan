/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestioneventos.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DAW1
 */
public class Evento {
    private static int numid = 1;
    private int id;
    private String descripcion;
    private String lugar;
    private Date fechaEvento;
    private double coste;
    private boolean mayorEdad;
    private List<Persona> eventosParticipe = new ArrayList<>();

    public Evento(int id, String descripcion, String lugar, Date fechaEvento, double coste, boolean mayorEdad) {
        this.id = numid;
        this.descripcion = descripcion;
        this.lugar = lugar;
        this.fechaEvento = fechaEvento;
        this.coste = coste;
        this.mayorEdad = mayorEdad;
        numid++;
    }
}
