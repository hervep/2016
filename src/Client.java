import java.util.ArrayList;
import java.util.List;

public class Client implements Interfaceproduit {
    private double prix;
    private String nom;

    public Client(String nom) {
        this.nom = nom;
    }

    private ArrayList<Produit> Produits = new ArrayList<Produit>() ;
    private ArrayList<Pack> Packs = new ArrayList<Pack>() ;

    //private List<Interfaceproduit> panier = new ArrayList<Interfaceproduit>();

    public void addProduit(Produit Prod, Pack pack){
        Produits.add(Prod);
        Packs.add(pack);
    }

    public void CalculPrix(){
        prix = 0;
        for(Produit P : Produits){
            prix= prix + P.getPrice();
        }
        for(Pack Pa: Packs){
            prix= prix + Pa.getPrice();
        }
    }

    @Override
    public double getPrice() {

        return prix;
    }

    @Override
    public void setPrice() {

    }


}
