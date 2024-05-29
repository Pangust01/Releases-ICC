package controlador;
import java.util.ArrayList;
import modelo.Juguetes;
public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Juguetes> toys = new ArrayList<>();
        System.out.println("Hello, World!");
        toys.add(new Juguetes(1, "Osito Bimbo", "Peluche"));
        toys.add(new Juguetes(2, "Terreneitor", "Carro a control remoto"));
        toys.add(new Juguetes(3, "Max Steel", "Juguete de plastico"));
        toys.add(new Juguetes(4, "Hello Kitty", "Peluche"));
        toys.add(new Juguetes(5, "Rompecabezas", "Puzzles"));
        
    }
}
