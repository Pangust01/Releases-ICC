package controlador;
import java.util.ArrayList;



import modelo.Juguetes;
import vista.ObjectView;
public class Main {
    public static void main(String[] args) throws Exception {
        ObjectController objc = new ObjectController();
        ObjectView objv = new ObjectView();
        ArrayList<Juguetes> toys = new ArrayList<>();
        System.out.println("Hello, World!");
        toys.add(new Juguetes(1, "Osito Bimbo", "Peluche"));
        toys.add(new Juguetes(2, "Terreneitor", "Carro a control remoto"));
        toys.add(new Juguetes(3, "Max Steel", "Juguete de plastico"));
        toys.add(new Juguetes(4, "Hello Kitty", "Peluche"));
        toys.add(new Juguetes(5, "Rompecabezas", "Puzzles"));
        System.out.println(objc.busquedaSecuencial(toys, 2));
        objv.imprimir(toys);
    }

}
