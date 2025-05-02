package heritage.entity;
//public class Note extends Object
public class Note {
    private int id;
    private double valeur;
    private Professeur professeur;
    private Appreciation appreciation;
    private Matiere matiere;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getValeur() {
        return valeur;
    }
    public void setValeur(double valeur) {
        this.valeur = valeur;
    }
    public Professeur getProfesseur() {
        return professeur;
    }
    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
    public Appreciation getAppreciation() {
        return appreciation;
    }
    public void setAppreciation(Appreciation appreciation) {
        this.appreciation = appreciation;
    }
    public Matiere getMatiere() {
        return matiere;
    }
    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public String toChaine() {
        return "Note [id=" + id + ", valeur=" + valeur + ", professeur=" + professeur + ", appreciation=" + appreciation
                + ", matiere=" + matiere + "]";
    }
  
   

    


}
