package poo.static_instance;

public class Commande {
    private String num;
    private String date;
    private static double tva;
    private int nbreCommande;

    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public static double getTva() {
        return tva;
    }
    //this represente une instance ou objet
    public static void setTva(double tva) {
        Commande.tva = tva;
    }
    public int getNbreCommande() {
        return nbreCommande;
    }
    public void setNbreCommande(int nbreCommande) {
        this.nbreCommande = nbreCommande;
    }

}
