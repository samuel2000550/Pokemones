import java.util.ArrayList;

public class Controller {
    private ArrayList<Pokemon> pokemones;

    public Controller() {
        pokemones = new ArrayList<>();
    }

    public void agregarPokemon(String nombre, String tipo, String habilidad) {
        Pokemon p = new Pokemon(nombre, tipo, habilidad);
        pokemones.add(p);
    }

    public ArrayList<Pokemon> getPokemones() {
        return pokemones;
    }

    public String mostrarPokemones() {
        if (pokemones.isEmpty()) {
            return "No hay pokemones registrados.";
        }
        StringBuilder sb = new StringBuilder();
        for (Pokemon p : pokemones) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}