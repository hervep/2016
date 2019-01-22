public class Produit implements Interfaceproduit {

    private String nom;
    private double prix;
    private int quantite;

    public Produit(String nom, double prix, int quantite) {
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    @Override
    public double getPrice() {
        return prix;
    }

    @Override
    public void setPrice() {

    }

    public String getNom() {
        return nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    @Override
    public String toString() {
        return "\nProduit{" + "nom=" + nom + ", prix=" + prix + ", quantite=" + quantite + "}\n";
    }
}
