/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop6;

/**
 *
 * @author Diego
 */
public class Persona {
      private String nombre;
    private int edad;
    private String colorOjos;
   
    /**
     * Constructor vacio que inicializa en cero o null
     */

    public Persona() {
    }
   
    /**
     * Cosntructor lleno
     * @param nombre
     * @param edad
     * @param colorOjos
     */

    public Persona(String nombre, int edad, String colorOjos) {
        this.nombre = nombre;
        this.edad = edad;
        this.colorOjos = colorOjos;
    }

    /**
     * Regresa el nombre de una persona
     * @return la variable nombre
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
   
    /**
     * Metodo que imprime lo que la persona esta comiendo
     * @param comida la comida que la persona esta comiendo
     * @return la cadena con la comida que la persona come
     */
   
    public String comer(String comida){
        return "Estoy comiendo" + comida;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", colorOjos=" + colorOjos + '}';
    }
}
