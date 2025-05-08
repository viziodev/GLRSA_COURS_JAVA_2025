package services;

import java.util.ArrayList;

import entity.Transaction;
import entity.TransactionType;

public class TransactionService {
   private ArrayList<Transaction> transactions=new ArrayList<>();
     
      public ArrayList<Transaction> getTransactions() {
        return transactions;
      }

      public ArrayList<Transaction> getTransactions(String numCompte) {
        ArrayList<Transaction> transactionsUnCompte=new ArrayList<>();
        for (int index = 0; index <transactions.size(); index++) {
              if (transactions.get(index).getCompte().getNumero().equals(numCompte)) {
                transactionsUnCompte.add(transactions.get(index));
              }
          }
          return transactionsUnCompte;
      }
      public String addTransaction(Transaction transaction){
        double solde =transaction.getCompte().getSolde();
        if (transaction.getType()==TransactionType.RETRAIT && transaction.getMontant()> solde) {
            return "Erreur";  //Solde Insuffisant
      }
        String result;
       if ( transaction.getType()==TransactionType.RETRAIT ) {
        transactions.add(transaction);
        solde-=transaction.getMontant();
          result="Succes Retrait";
        }else{
            solde+=transaction.getMontant(); 
            result="Succes Depot";
        }
         
          transaction.getCompte().setSolde(solde);
          transactions.add(transaction);
        return result;
      } 
}
