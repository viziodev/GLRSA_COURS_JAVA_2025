package entity;

import java.time.LocalDate;

import services.FormatDate;
import views.translate.fr.MessageTransaction;

public class CompteEpargne  extends Compte{
    private LocalDate dateDebutBlocage;
    private int dureeBlocage;//annee
    private LocalDate dateFinBlocage;
    private final double taux=0.05;

    private void  calculDateFinBlocage(){
        dateFinBlocage= dateDebutBlocage.plusYears(dureeBlocage);
    }
    
    public double getTaux() {
        return taux;
    }
    public LocalDate getDateFinBlocage() {
        return dateFinBlocage;
    }
    public LocalDate getDateDebutBlocage() {
        return dateDebutBlocage;
    }
    public void setDateDebutBlocage(LocalDate dateDebutBlocage) {
        this.dateDebutBlocage = dateDebutBlocage;
    }
    public int getDureeBlocage() {
        return dureeBlocage;
    }
    public void setDureeBlocage(int dureeBlocage) {
        this.dureeBlocage = dureeBlocage;
        calculDateFinBlocage();
    }
    
    public boolean isBloqued(){
        return LocalDate.now().isBefore(dateFinBlocage);

    }

     @Override
     public  MessageTransaction retrait(Transaction transaction){
        if (isBloqued()) {
            return MessageTransaction.RETRAIT_BLOQUED;  
        }
        if (transaction.getMontant()> solde) {
              return MessageTransaction.RETRAIT_FAILED;  //Solde Insuffisant
        }
             solde-=transaction.getMontant();
             transactions.add(transaction);
             return MessageTransaction.RETRAIT_SUCCES;
    }

     @Override
     public  MessageTransaction depot(Transaction transaction){
          double mntTaux=0;
             if (isBloqued()) {
                 mntTaux=transaction.getMontant()*taux;
             }
              solde+=transaction.getMontant() + mntTaux; 
            transactions.add(transaction); 
            return MessageTransaction.DEPOT_SUCCESS; 
    }

     @Override
     public String toString() {
        return "CompteEpargne ["+super.toString()+" Date Debut Blocage=" + FormatDate.toFr(dateDebutBlocage) + ", Duree Blocage=" + dureeBlocage
                + ", Date Fin Blocage=" + FormatDate.toFr(dateFinBlocage) + ", taux=" + taux + "]";
     }
}
