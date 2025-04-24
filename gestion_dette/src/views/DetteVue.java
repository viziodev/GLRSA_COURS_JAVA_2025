package views;

import java.util.Scanner;


import entity.Dette;

public class DetteVue {
      private Scanner scanner=new Scanner(System.in);

      private String saisieChamp(String message){
        String ch;
       do {
           System.out.println(message);
           ch=scanner.nextLine();
       } while (ch.compareTo("")==0);
         return ch;
      }
      private double saisieValPositif(String message){
        double val;
       do {
           System.out.println(message);
           val=scanner.nextDouble();
       } while (val<=0);
         return val;
      }

      public Dette saisieDette(){
        Dette dette=new Dette();
        dette.setDate(saisieChamp("Entrer la Date "));
        dette.setMontantDette(saisieValPositif("Entrer le montant "));
         return dette;
   }

   public void afficheTabDette(Dette[] clients,int nbreDette){
      for (int index = 0; index < nbreDette; index++) {
         System.out.println(clients[index].toString());
      }
 }
}
