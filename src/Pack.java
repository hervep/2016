import java.util.ArrayList;

public class Pack implements Interfaceproduit {

    private double prix;
    private double pourcentage;
    private ArrayList<Produit> Produits = new ArrayList<Produit>() ;

    public Pack(double pourcentage) {
        this.pourcentage = pourcentage;
    }


    public ArrayList<Produit> getProduits() {
        return Produits;
    }

    public void setProduits(ArrayList<Produit> produits) {
        this.Produits = produits;
    }

    public void addProduit(Produit Prod){
        Produits.add(Prod);
    }
    public void  calculprix(Produit p){
        prix = 0;
        for(Produit P : Produits){
            prix= prix + P.getPrice();
        }
        prix = prix - prix*pourcentage;
    }
    @Override
    public double getPrice() {

        return prix;
    }

    @Override
    public void setPrice() {
        this.prix= prix;

    }
    @Override
    public String toString() {

        return "\n\tpack{\n" + "Stock=" + Produits + "\n}";
    }


}
