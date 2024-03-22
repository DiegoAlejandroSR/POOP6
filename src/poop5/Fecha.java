/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Diego
 */
public class Fecha {
      private int dia, anio;
    private String mes;

    public Fecha() {
    }

    public Fecha(int dia, String mes, int anio) {
        this.dia = dia;
        this.anio = anio;
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", anio=" + anio + ", mes=" + mes + '}';
    }
    
}
