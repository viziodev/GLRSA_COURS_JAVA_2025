package views;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Transaction;
import entity.TypeTransaction;


public class TransactionView {
    private static Scanner scanner=new Scanner(System.in);
       private TransactionView(){

       }
      public static  Transaction saisieTransaction() {
        Transaction transaction =new Transaction();
        double montant;
        do {
              System.out.println("Entrer le Monatnt de la transaction");
              montant=scanner.nextDouble();
        } while (montant<=0);
        //Type de la Transaction 
            int type;
            do {
                System.out.println("1-Retrait");
                System.out.println("2-Depot");
                type=scanner.nextInt();
            } while (type!=1 && type!=2);
        transaction.setType(TypeTransaction.getOptionByValue(type));
        transaction.setMontant(montant);
        return transaction;

    } 

    public static void afficheTransaction(ArrayList<Transaction> transactions ){
        for (int index = 0; index < transactions.size(); index++) {
            System.out.println(transactions.get(index).toChaine());
        }
    }
}
