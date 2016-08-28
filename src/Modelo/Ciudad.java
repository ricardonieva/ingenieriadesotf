package Modelo;

public class Ciudad {

    private Integer codigo;
    private String descripcion;

    public Ciudad(int codigo, String nombre) {
        this.codigo = codigo;
        this.descripcion = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String nombre) {
        this.descripcion = nombre;
    }

    
}
