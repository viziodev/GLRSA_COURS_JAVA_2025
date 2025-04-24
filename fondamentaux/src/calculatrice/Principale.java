package calculatrice;
import java.util.Scanner;
public class Principale {
    public static void main(String[] args) throws Exception {
        Scanner scanner; //Declaration de zone de reference
        scanner=new Scanner(System.in);//Reservation de zone de valeurs
        int choix;
      do {
        System.out.println("1-Addition");
        System.out.println("2-Soustraction");
        System.out.println("3-Division");
        System.out.println("4-Quitter");
      
        System.out.println("Entrer votre choix");
        choix= scanner.nextInt();
        int a;   double b;
         if (choix!=4) {
            System.out.println("Entrer la valeur de a"); 
            a= scanner.nextInt();
            System.out.println("Entrer la valeur de b");
            b= scanner.nextDouble();
         
          switch (choix) {
            case 1:
              System.out.println("La somme est "+(a+b));  
                break;
            case 2:
                System.out.println("La Difference est "+(a-b));  
                  break;
            case 3:
                 if (b!=0) {
                    System.out.println("La Difference est "+(a/b));  
                 }else{
                    System.out.println("Le denominateur est null");
                 }
                 
                    break;
            default:
                break;
        }
      }
       } while (choix!=4);
   
       scanner.close();

    }
}

//Notion de Bloc  ==> {}
//Variables  ont une visibilite de bloc
/*
  {   
     int x;
      {
       int y=2;
        x=12;
          System.out.println(x); 
          System.out.println(y); 
      }
      System.out.println(x);
       System.out.println(y); //Erreur car y n'a pas ete defini dans ce bloc 
  } 
       System.out.println(x); ==> Erreur
 */
