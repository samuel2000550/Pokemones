package ui;
import java.util.Scanner;
import model.Controller;

public class Main {

 private Controller controller; 

 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller();

        System.out.print("¿Cuántos pokemones quieres registrar? ");
        int cantidad = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- Registro del Pokémon #" + (i + 1) + " ---");
            
            System.out.print("Nombre del Pokémon: ");
            String nombre = sc.nextLine();

            System.out.print("Tipo del Pokémon (agua, planta, hielo, hierro o personalizado): ");
            String tipo = sc.nextLine();

            System.out.print("Habilidad del Pokémon: ");
            String habilidad = sc.nextLine();

            controller.agregarPokemon(nombre, tipo, habilidad);
        }

        System.out.println(" Pokemones registrados con éxito.");
        System.out.println(controller.mostrarPokemones());

        sc.close();
    }
}

