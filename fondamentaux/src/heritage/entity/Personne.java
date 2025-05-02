package heritage.entity;
// Personne extend Object
public class Personne {
   
    protected int id;
    protected String nom,prenom;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
   
    public String toChaine() {
        return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
    }
    @Override
    public String toString() {
        return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
    }

    
}
