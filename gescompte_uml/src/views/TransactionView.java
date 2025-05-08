package views;

import java.util.ArrayList;

import entity.Transaction;
import entity.TransactionType;

public class TransactionView  extends View {
    public TransactionView(){

       }
      public   Transaction saisieTransaction() {
        Transaction transaction =new Transaction();
        //Type de la Transaction 
            int type;
            do {
                System.out.println("1-Retrait");
                System.out.println("2-Depot");
                type=scanner.nextInt();
            } while (type!=1 && type!=2);
        transaction.setType(TransactionType.getOptionByValue(type));
        transaction.setMontant(sasieDouble("Entrer le Montant de la transaction"));
        return transaction;

    } 

    public  void afficheTransaction(ArrayList<Transaction> transactions ){
        for (int index = 0; index < transactions.size(); index++) {
            System.out.println(transactions.get(index).toString());
        }
    }
}
