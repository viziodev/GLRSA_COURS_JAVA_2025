package heritage.entity;

public class Matiere {
    private int id;
    private String nom;
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
   
    public String toChaine() {
        return "Matiere [id=" + id + ", nom=" + nom + "]";
    }
}
