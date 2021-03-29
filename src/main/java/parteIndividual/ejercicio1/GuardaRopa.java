package parteIndividual.ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GuardaRopa {

    private Map<Integer, ArrayList<Prenda>> prendas;
    private Integer id = 0;

    public GuardaRopa() {
        prendas = new HashMap<>();
    }

    public Integer guardarPrendas(ArrayList<Prenda> listaPrendas) {
        prendas.put(id, listaPrendas);
        id++;
        return id;
    }

    public void mostrarPrendas() {
        for (Map.Entry<Integer, ArrayList<Prenda>> entry : prendas.entrySet()) {
            System.out.println("Clave= " + entry.getKey() + ", Valor= " + entry.toString());
        }
    }

    public ArrayList<Prenda> devolverPrendas(Integer idPrenda){
        ArrayList<Prenda> listaDePrenda = prendas.get(idPrenda);
        prendas.remove(idPrenda);
        return listaDePrenda;
    }

    @Override
    public String toString() {
        return "Prendas= " + prendas +
                "id= " + id;
    }
}
