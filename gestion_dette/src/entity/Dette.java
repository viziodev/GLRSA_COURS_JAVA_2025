package entity;

public class Dette {
    private String date;
    private double montantDette,montantPaye,montantRestant;
   
    public Dette() {
    }
    
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public double getMontantDette() {
        return montantDette;
    }
    public void setMontantDette(double montantDette) {
        this.montantDette = montantDette;
        montantRestant=montantDette;
        montantPaye=0;
    }
    public double getMontantPaye() {
        return montantPaye;
    }
    public void setMontantPaye(double montantPaye) {
        this.montantPaye = montantPaye;
    }
    public double getMontantRestant() {
        return montantRestant;
    }
    public void setMontantRestant(double montantRestant) {
        this.montantRestant = montantRestant;
    }

    @Override
    public String toString() {
        return "Dette [date=" + date + ", montantDette=" + montantDette + ", montantPaye=" + montantPaye
                + ", montantRestant=" + montantRestant + "]";
    }



    
     
}
