package entity;

import views.translate.fr.MessageTransaction;

public class CompteCheque extends Compte{
    private final double frais=0.08;

    public double getFrais() {
        return frais;
    }
     @Override
     public  MessageTransaction retrait(Transaction transaction){
        double mntRetrait=(1+frais)*transaction.getMontant();
          if (mntRetrait> solde) {
              return MessageTransaction.RETRAIT_FAILED;  //Solde Insuffisant
         }
             solde-=mntRetrait;
             transactions.add(transaction);
             return MessageTransaction.RETRAIT_SUCCES;
      }

      @Override
       public  MessageTransaction depot(Transaction transaction){
            double mntDepot=(1-frais)*transaction.getMontant();
              solde+=transaction.getMontant() + mntDepot; 
            transactions.add(transaction); 
            return MessageTransaction.DEPOT_SUCCESS; 
    }
      @Override
      public String toString() {
        
        return "CompteCheque ["+ super.toString() +  "frais=" + frais + "]";
      }




}
