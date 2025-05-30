package entity;

import java.time.LocalDate;
import java.util.ArrayList;

import services.FormatDate;
import views.translate.fr.MessageTransaction;

public class Compte {
    //Attributs d'instances
    private int id; //0
    private String numero;//null
    private  LocalDate dateCreation=LocalDate.now();//null
    private double  solde;//0.0
    private  ArrayList<Transaction> transactions=new ArrayList<>();

    public  ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public MessageTransaction addTransaction(Transaction transaction){
        if (transaction.getType()==TypeTransaction.RETRAIT && transaction.getMontant()> solde) {
              return MessageTransaction.RETRAIT_FAILED;  //Solde Insuffisant
        }
          transactions.add(transaction);
         if ( transaction.getType()==TypeTransaction.RETRAIT ) {
             solde-=transaction.getMontant();
             return MessageTransaction.RETRAIT_SUCCES;
         }
            solde+=transaction.getMontant();  
        return MessageTransaction.DEPOT_SUCCESS; 
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
        return "Compte [id=" + id + ", numero=" + numero + ", dateCreation=" + FormatDate.toFr(dateCreation) + ", solde=" + solde + "]";
    }


 
}
