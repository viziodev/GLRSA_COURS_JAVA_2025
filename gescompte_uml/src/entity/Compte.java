package entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compte {
     private static int nbreCompte;
     private int  id;
     private LocalDate dateCreation;
     private double solde;
     private String  numero;

     //Propriete Navigable, issu d'une Relation
       //OneToMany
      private ArrayList<Transaction> transactions=new ArrayList<>();
     
      public ArrayList<Transaction> getTransactions() {
        return transactions;
      }
      public String addTransaction(Transaction transaction){
        if (transaction.getType()==TransactionType.RETRAIT && transaction.getMontant()> solde) {
            return "Erreur";  //Solde Insuffisant
      }
        transactions.add(transaction);
       if ( transaction.getType()==TransactionType.RETRAIT ) {
           solde-=transaction.getMontant();
           return "Succes Retrait";
       }
          solde+=transaction.getMontant();  
            return "Succes Depot";
      }

     public Compte() {
        id=++nbreCompte;
        numero="NUM_"+nbreCompte;
    }

     public static int getNbreCompte() {
         return nbreCompte;
     }
    
     public int getId() {
         return id;
     }
     public void setId(int id) {
         this.id = id;
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
     public String getNumero() {
         return numero;
     }

     @Override
     public String toString() {
        return "Compte [id=" + id + ", dateCreation=" + dateCreation + ", solde=" + solde + ", numero=" + numero + "]";
     }
     
}
