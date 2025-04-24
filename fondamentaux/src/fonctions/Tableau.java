package fonctions;

import java.util.Scanner;

public class Tableau {
        private static Scanner scanner=new Scanner(System.in);
        private static final int N=10;
        private static int[] tabEntier=new int[N];
        private static  int nbreValeurs=0;
       public static void main(String[] args) {
        int choix;
        do {
          System.out.println("1-Ajouter une valeur dans le tableau");
          System.out.println("2-Afficher les valeurs du Tableaux");
          System.out.println("3-Rechercher une valeur dans le tableau");
          System.out.println("4-Quitter");
      
        System.out.println("Entrer votre choix");
        choix= scanner.nextInt();
        
          switch (choix) {
            case 1:
                 int nbre= scanValuePositif("Entrer une valeur");
                 addValueInTab(nbre);
                break;
            case 2:
                showValueInTab();
                 System.out.println("");
                  break;
            case 3:
                  nbre= scanValuePositif("Entrer une valeur");
                  if(shearchValueInTab(nbre)){
                    System.out.println(nbre+" est  present dans le tableau");
                    }else{
                    System.out.println(nbre+"n'est pas present dans le tableau");
                  }
                    break;
            default:
                break;
        }
      
       } while (choix!=4);
   
       scanner.close();

     }

     public static void addValueInTab(int nbre){
      if (nbreValeurs<N) {
          tabEntier[nbreValeurs]=nbre;
         nbreValeurs++;
     }else{
        System.out.println("Le tableau est rempli");
     }
     }

     public static int scanValuePositif(String message){
      int nbre;
       do {
         System.out.println(message);
         nbre= scanner.nextInt();
       } while (nbre<=0);
        return nbre; 
     }

     public static void showValueInTab(){
      for (int index = 0; index < nbreValeurs; index++) {
        System.out.print(tabEntier[index]+"|"); 
       }
     }

     public static boolean shearchValueInTab(int nbre){
        for (int index = 0; index < nbreValeurs; index++) {
          if (tabEntier[index]==nbre) {
            return true; 
          }
       }
         return false;
     }



}
