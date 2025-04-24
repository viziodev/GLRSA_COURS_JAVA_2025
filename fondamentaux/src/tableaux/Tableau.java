package tableaux;

import java.util.Scanner;

public class Tableau {
     public static void main(String[] args) {
        //Tableau sont des classes
        //Variable tableau  est un objet
        //1-Declaration type[] nomTab; ou  type nomTab[] 
        //type ==> peut etre un type primitif(int,double,float) ou type peut etre une classe 
        //2-Instanciation nomTab=new Type[NbreCellule]
        /*
         * int tabEntier[];
         * tabEntier=new int[5];
         * 
         * Client[] tabClient;
         * tabClient=new Client[5];
         */

          Scanner scanner; //Declaration de zone de reference
          scanner=new Scanner(System.in);//Reservation de zone de valeurs
          int choix;
          final int N=10;
          int[] tabEntier;
          tabEntier=new int[N];
          int nbreValeurs=0;
        do {
          System.out.println("1-Ajouter une valeur dans le tableau");
          System.out.println("2-Afficher les valeurs du Tableaux");
          System.out.println("3-Rechercher une valeur dans le tableau");
          System.out.println("4-Quitter");
      
        System.out.println("Entrer votre choix");
        choix= scanner.nextInt();
        
         
          switch (choix) {
            case 1:
                 System.out.println("Entrer une valeur");
                 int nbre= scanner.nextInt();
                 if (nbreValeurs<N) {
                    tabEntier[nbreValeurs]=nbre;
                     nbreValeurs++;
                 }else{
                    System.out.println("Le tableau est rempli");
                 }
                break;
            case 2:
                 for (int index = 0; index < nbreValeurs; index++) {
                    System.out.print(tabEntier[index]+"|"); 
                 }
                 System.out.println("");
                  break;
            case 3:
                  System.out.println("Entrer une valeur");
                   nbre= scanner.nextInt();
                  for (int index = 0; index < nbreValeurs; index++) {
                    if (tabEntier[index]==nbre) {
                           System.out.println(nbre+" est present dans le tableau");
                    } else{
                        System.out.println(nbre+"n'est pas present dans le tableau");
                    }
                  }
                    break;
            default:
                break;
        }
      
       } while (choix!=4);
   
       scanner.close();

     }
}
