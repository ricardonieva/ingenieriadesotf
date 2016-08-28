package Modelo;

public class NochedeHotel {

    private String nombre;
    private int estrella;

    public NochedeHotel(String nombre, int estrella) {
        this.nombre = nombre;
        this.estrella = estrella;
    }

    public int getEstrella() {
        return estrella;
    }

    public void setEstrella(int estrella) {
        this.estrella = estrella;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

}
