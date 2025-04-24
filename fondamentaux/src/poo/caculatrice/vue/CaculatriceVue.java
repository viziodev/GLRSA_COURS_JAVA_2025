package poo.caculatrice.vue;

import java.util.Scanner;

public class CaculatriceVue {
    private Scanner scanner;

    public CaculatriceVue(){
        scanner=new Scanner(System.in);
    }
    public int saisieEntier(){
            System.out.println("Entrer la valeur de a"); 
            int  a= scanner.nextInt();
            return a;
    }

    public double saisieDouble(){
        System.out.println("Entrer la valeur de b"); 
        double  a= scanner.nextDouble();
        return a;
     }

     public void afficheResutat(String message){
        System.out.println(message); 
       
     }

      public  int menu(){
        System.out.println("1-Addition");
        System.out.println("2-Soustraction");
        System.out.println("3-Division");
        System.out.println("4-Quitter");
        System.out.println("Entrer votre choix");
         return scanner.nextInt();
      }

   
}
