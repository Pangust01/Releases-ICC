package controlador;

import java.util.ArrayList;

import modelo.Juguetes;

public class ObjectController {
    public String busquedaSecuencial(ArrayList<Juguetes> toys, int codigo){
        int tamanio = toys.size();
        for (int i = 0; i < tamanio; i++) {
            if (toys.get(i).getCodigo()==codigo) {
                return "Su codigo a encontrar es: "+toys.get(i).getCodigo();
            }
        }
        return "No se encontro el codigo";
    }

}
