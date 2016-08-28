package Modelo;

public class Unidad {

    private int numero;
    private String dominio;
    private int cantdeasientos;
    private int ascientosdisponibles;

    public Unidad(int numero, String dominio, int cantdeasientos, int ascientosdisponibles) {
        this.numero = numero;
        this.dominio = dominio;
        this.cantdeasientos = cantdeasientos;
        this.ascientosdisponibles = ascientosdisponibles;
    }

    public int getAscientosdisponibles() {
        return ascientosdisponibles;
    }

    public void setAscientosdisponibles(int ascientosdisponibles) {
        this.ascientosdisponibles = ascientosdisponibles;
    }

    public int getCantdeasientos() {
        return cantdeasientos;
    }

    public void setCantdeasientos(int cantdeasientos) {
        this.cantdeasientos = cantdeasientos;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    


}
