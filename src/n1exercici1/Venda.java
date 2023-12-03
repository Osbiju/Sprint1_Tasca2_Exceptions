package n1exercici1;

import java.util.ArrayList;

public class Venda {
    private ArrayList<Producte> productes;
    private int preuTotal;


    public Venda(ArrayList<Producte> productes, int preuTotal) {
            this.productes = new ArrayList<Producte>();
            this.preuTotal = preuTotal;
    }

    public int getPreuTotal() {
        return this.preuTotal;
    }

    public ArrayList<Producte> getProductes() {
        return this.productes;
    }

    public void agregarProducte(Producte producte) {
        this.productes.add(producte);
    }


    public void calcularTotal() throws VendaBuidaException {

        if (productes.isEmpty()) {
            throw new VendaBuidaException("Per fer una venda primer has d'afegir productes");
        } else {
            preuTotal = 0;

            for (Producte p : productes) {
                preuTotal += p.getPreu();
            }
            System.out.println(preuTotal);
        }

    }

    public void addProducte(Producte producte) {
        this.productes.add(producte);
    }
}
