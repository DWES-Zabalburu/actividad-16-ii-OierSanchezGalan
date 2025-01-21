/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestioneventos.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author DAW1
 */
public class Persona {
    private static int numid = 1;
    private int id;
    private String dni;
    private String nombre;
    private Date fechaNacimiento;
    private List<Evento> eventosParticipe = new ArrayList<>();

    public Persona(String dni, String nombre, Date fechaNacimiento) {
        this.id=numid;
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        numid++;
    }
    
    
    public boolean isMayorEdad(){
        GregorianCalendar gcFAc = new GregorianCalendar();
        GregorianCalendar gc = new GregorianCalendar();
        gcFAc.add(GregorianCalendar.YEAR, -18);
        gc.setTime(fechaNacimiento);
        if (gc.compareTo(gcFAc) > 0){
            return false;
        }else{
            return true;
        }
    }
}
