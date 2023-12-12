package n1exercici1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws VendaBuidaException {
        ArrayList<Producte> productes = new ArrayList<Producte>();


        Producte pilas = new Producte("Duracel", 10);
        Producte pantalo = new Producte("Levis", 50);
        Producte boli = new Producte("Bic", 1);

        productes.add(pilas);
        productes.add(pantalo);
        productes.add(boli);

        Venda venda = new Venda(productes, 0);

        venda.agregarProducte(pilas);
        venda.agregarProducte(pantalo);
        venda.agregarProducte(boli);

        //excepcio personalitzada

        try {

            System.out.println("Lista de productes a la venda:");

            for (Producte producte : productes) {
                System.out.println(producte.ToString());
            }

            System.out.print("El preu total de la venda es de ");

            venda.calcularTotal();

        } catch (VendaBuidaException e) {
            System.err.println(e.getMessage());
        }

        // ArrayIndexOutOfBoundsException.
        System.out.println("Busquem article que no esta a la llista, forçem el ArrayIndexOutOfBoundsException");

        try {

            //System.out.println(productes.get(2).ToString()); //aquet si que esta a la llista
            System.out.println(productes.get(7).ToString()); //aquest no esta, saltara l'error

        } catch (IndexOutOfBoundsException e) {
            System.out.println("El producte que buscas no esta a la llista");

        }

    }
}
