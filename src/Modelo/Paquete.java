
package Modelo;

import java.util.ArrayList;


public class Paquete {

    private ArrayList<Salida> salidas;
    private String nombre;
    private String itinerario;
    private int dias;
    private int noches;

    public Paquete(String nombre, String itinerario, int dias, int noches) {
        this.nombre = nombre;
        this.itinerario = itinerario;
        this.dias = dias;
        this.noches = noches;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getItinerario() {
        return itinerario;
    }

    public void setItinerario(String itinerario) {
        this.itinerario = itinerario;
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Salida> getSalidas() {
        return salidas;
    }

    public void setSalidas(ArrayList<Salida> salidas) {
        this.salidas = salidas;
    }

    public void agregarSalida(Salida salida){
    salidas.add(salida);
    }

    public void mostrarSalidas(){
    for(int i=0;i<salidas.size();i++){
        System.out.println("fecha: "+salidas.get(i).getFecha());
        System.out.println("Cupos disponibles: "+salidas.get(i).getCupos());
        System.out.println("Estado: "+salidas.get(i).getEstado());
    }
    }

    
}
