package n1exercici1;

import java.util.ArrayList;

public class Venda {
    private ArrayList<Producte> productes;
    private int preuTotal;

    /*
        public Venda(ArrayList<Producte> productes, int preuTotal) {
            this.productes = productes;
            this.preuTotal = preuTotal;
        }
    */
    public Venda() {
        this.productes = new ArrayList<>();
        this.preuTotal = 0;
    }

    public ArrayList<Producte> getProductes() {
        return this.productes;
    }

    public int getPreuTotal() {
        return this.preuTotal;
    }

    public void setProductes(ArrayList<Producte> productes) {
        this.productes = productes;
    }

    public void setPreuTotal(int preuTotal) {
        this.preuTotal = preuTotal;
    }

    public void calcularTotal() throws VendaBuidaException {
        if (productes.isEmpty()) {
            throw new VendaBuidaException();
        }

        for (Producte p : productes) {
            preuTotal += p.getPreu();
        }
    }

    public void addProducte(Producte producte1) {
    }
}
