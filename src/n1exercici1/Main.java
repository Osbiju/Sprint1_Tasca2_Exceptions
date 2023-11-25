package n1exercici1;

public class Main {
    public static void main(String[] args) {

        Venda venda = new Venda();
        Producte producte1 = new Producte("pilas", 10);
        Producte producte2 = new Producte("canicas", 20);
        Producte producte3 = new Producte("boli", 30);

        venda.addProducte(producte1);
        venda.addProducte(producte2);
        venda.addProducte(producte3);


        try {
            venda.calcularTotal();
        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        }

//        try {
//            int[] array = new int[5];
//            array[10] = 1;
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("S'ha produit una excepció: " + e);
//        }
    }
}
