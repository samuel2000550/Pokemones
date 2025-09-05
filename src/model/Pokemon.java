package model; 

public class Pokemon {
    private String nombre;
    private String tipo;
    private String habilidad;

    public Pokemon(String nombre, String tipo, String habilidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.habilidad = habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getHabilidad() {
        return habilidad;
    }

    @Override
    public String toString() {
        return "Pokemon: " + nombre + " | Tipo: " + tipo + " | Habilidad: " + habilidad;
    }
}
