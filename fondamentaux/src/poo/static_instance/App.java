package poo.static_instance;

import java.util.Scanner;

public class App {
    private static Scanner scanner=new Scanner(System.in);
  public static void main(String[] args) {

     Commande.setTva(0.18);
     Commande.getTva();
  
    
  }  
}
