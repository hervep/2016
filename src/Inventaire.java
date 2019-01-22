import java.util.ArrayList;

public class Inventaire {
    private int quantite;
    private ArrayList<Produit> produit = new ArrayList<>();
    private  ArrayList<Pack> packs = new ArrayList<>();

    public int getQuantite() {
        return quantite;
    }

    public ArrayList<Produit> getProduit() {
        return produit;
    }

    public ArrayList<Pack> getPacks() {
        return packs;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setProduit(ArrayList<Produit> produit) {
        this.produit = produit;
    }

    public void setPacks(ArrayList<Pack> packs) {
        this.packs = packs;
    }

    public void gestionStock(Produit p, int e){
        int a;
        for(Produit pp: produit){
            if (pp.getNom() == p.getNom()) {
                a = pp.getQuantite()-e;
                pp.setQuantite(a);

            }
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
