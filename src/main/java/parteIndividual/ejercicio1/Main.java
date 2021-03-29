package parteIndividual.ejercicio1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Prenda> prendas = new ArrayList<>();
        prendas.add(new Prenda("Marca1", "Modelo1"));
        ArrayList<Prenda> prendas2 = new ArrayList<>();
        prendas2.add(new Prenda("Marca1", "Modelo2"));
        prendas2.add(new Prenda("Marca3", "Modelo3"));

        GuardaRopa guardaRopa = new GuardaRopa();
        Integer codigo1 = guardaRopa.guardarPrendas(prendas);
        Integer codigo2 = guardaRopa.guardarPrendas(prendas2);
        guardaRopa.mostrarPrendas();

        guardaRopa.devolverPrendas(codigo2);
        guardaRopa.mostrarPrendas();

    }

}
