import java.util.ArrayList;
import java.util.List;

public class ProduitComposite implements Interfaceproduit {
    private double prix;

    public ProduitComposite(double prix) {
        this.prix = prix;
    }

    private ArrayList<Produit> Produits = new ArrayList<Produit>() ;

    //private List<Interfaceproduit> panier = new ArrayList<Interfaceproduit>();

    public void addProduit(Produit Prod){
        Produits.add(Prod);
    }
    @Override
    public double getPrice() {
        prix = 0;
        for(Produit P : Produits){
            prix= prix + P.getPrice();
        }
        return prix;
    }

    @Override
    public void setPrice() {

    }


}
