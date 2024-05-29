package vista;

import java.util.ArrayList;

import modelo.Juguetes;

public class ObjectView {
    public void imprimir(ArrayList<Juguetes> toys){
        String salida = "";
        int i = 1;
        for (Juguetes toy : toys) {
            salida+="Su juguete No"+(i++)+": \nContiene un codigo "+toy.getCodigo()+"\nEl nombre del juguete es: "+toy.getNombre()+"\nLa categoria del juguete es: "+toy.getCategoria();
        }
        System.out.println(salida);
    }
}
