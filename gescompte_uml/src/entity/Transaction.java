package entity;

import java.time.LocalDate;

public class Transaction {
    
     private LocalDate date;
     private double montant;
     //ManyToOne
     private Compte compte;
     private TransactionType type;
     
     public TransactionType getType() {
        return type;
    }
     public void setType(TransactionType type) {
         this.type = type;
     }
     public Compte getCompte() {
        return compte;
     }
     public void setCompte(Compte compte) {
         this.compte = compte;
     }
     public LocalDate getDate() {
         return date;
     }
     public void setDate(LocalDate date) {
         this.date = date;
     }
     public double getMontant() {
         return montant;
     }
     public void setMontant(double montant) {
         this.montant = montant;
     }
     @Override
     public String toString() {
        return "Transaction [date=" + date + ", montant=" + montant + "]";
     }
}
