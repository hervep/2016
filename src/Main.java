public class Main {





        public static void main(String[] args) {

            Produit produit1 = new Produit("banane",0.5, 2);
            Produit produit2 = new Produit("pomme",0.4, 3);
            Produit produit3 = new Produit("pain",0.85, 5);
            Produit produit4 = new Produit("eau",0.95, 6);
            Produit produit5 = new Produit("jus",3.5, 6);

            Pack pack1 = new Pack(0.1);
            pack1.addProduit(produit1);
            pack1.addProduit(produit2);
            pack1.addProduit(produit4);

            System.out.println(produit1.toString());


        }

}
