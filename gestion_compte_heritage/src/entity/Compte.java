package entity;

import java.time.LocalDate;
import java.util.ArrayList;

import services.FormatDate;
import views.translate.fr.MessageTransaction;

public class Compte {
    //Attributs d'instances
    protected int id; //0
    protected String numero;//null
    protected  LocalDate dateCreation=LocalDate.now();//null
    protected double  solde;//0.0
    protected  ArrayList<Transaction> transactions=new ArrayList<>();
    protected TypeCompte type;

  

    public  ArrayList<Transaction> getTransactions() {
        return transactions;
    }


    public TypeCompte getType() {
        return type;
    }
    public  MessageTransaction retrait(Transaction transaction){
        return null;
    }

    public  MessageTransaction depot(Transaction transaction){
        return null;
    }


    //Attributs 
    private static int nbreCompte;//0

    //Constructeur
    public Compte() {
        nbreCompte++;
        id=nbreCompte;
    }

    public static int getNbreCompte() {
        return nbreCompte;
    }

    public static void setNbreCompte(int nbreCompte) {
        Compte.nbreCompte = nbreCompte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return " [id=" + id + ", numero=" + numero + ", dateCreation=" + FormatDate.toFr(dateCreation) + ", solde=" + solde + "]";
    }


 
}
