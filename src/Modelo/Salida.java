package Modelo;

import java.util.Date;

public class Salida {

    private Date fecha;
    private int cupos;
    private String estado;

    public Salida(Date fecha, int cupos, String estado) {
        this.fecha = fecha;
        this.cupos = cupos;
        this.estado = estado;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }



}
