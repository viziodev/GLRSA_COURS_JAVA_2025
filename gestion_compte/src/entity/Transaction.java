package entity;

import java.time.LocalDate;

public class Transaction {
     //Attributs d'instances
      private int id; //0
      private  LocalDate date=LocalDate.now();//today
      private double  montant;//0.0
      private TypeTransaction type;

    public TypeTransaction getType() {
        return type;
    }

      public void setType(TypeTransaction type) {
          this.type = type;
      }

    //Attributs 
    private static int nbreTransaction;//0

    //Constructeur
    public Transaction() {
        nbreTransaction++;
        id=nbreTransaction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public static int getNbreTransaction() {
        return nbreTransaction;
    }

    public static void setNbreTransaction(int nbreTransaction) {
        Transaction.nbreTransaction = nbreTransaction;
    }

    
    public String toChaine() {
        return "Transaction [id=" + id + ", date=" + date + ", montant=" + montant + ", type=" + type + "]";
    }

    
   
    
}
