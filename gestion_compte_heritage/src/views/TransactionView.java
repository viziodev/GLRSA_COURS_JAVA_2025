package views;

import java.util.ArrayList;
import entity.Transaction;
import entity.TypeTransaction;

public class TransactionView extends View{
       private TransactionView(){

       }
      public static  Transaction saisieTransaction() {
        Transaction transaction =Transaction.of();
        //Type de la Transaction 
            int type;
            do {
                System.out.println("1-Retrait");
                System.out.println("2-Depot");
                type=scanner.nextInt();
            } while (type!=1 && type!=2);
        transaction.setType(TypeTransaction.getOptionByValue(type));
        transaction.setMontant(sasieDouble("Entrer le Montant de la transaction"));
        return transaction;

    } 

   

    public static void afficheTransaction(ArrayList<Transaction> transactions ){
        for (int index = 0; index < transactions.size(); index++) {
            System.out.println(transactions.get(index).toChaine());
        }
    }
}
