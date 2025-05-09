package views;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Carre;
import entity.Figure;
import entity.Rectangle;

public class FigureView {
    private static Scanner scanner=new Scanner(System.in);

    private  FigureView(){
        
    }

    public static Figure saisie(){
          Figure figure;
          int choix;
          System.out.println("Entrer la diagonale");
          double diagonale =scanner.nextDouble();
          do {
            System.out.println("0-Carre");
            System.out.println("1-Rectangle");
            choix =scanner.nextInt();
          } while (choix!=0 && choix!=1);
          if (choix==0) {
             System.out.println("Entrer le cote");
             double cote=scanner.nextDouble();
             figure=new Carre(diagonale,cote);
          }else{
            System.out.println("Entrer la largeur");
            double largeur=scanner.nextDouble();
            System.out.println("Entrer la longueur");
            double longueur=scanner.nextDouble();
              figure=new Rectangle(diagonale,longueur,largeur);
          } 
          return  figure;
    }

    public static  void  affiche(ArrayList<Figure> figures){
      for (int index = 0; index < figures.size(); index++) {
           System.out.println(figures.get(index).toString());
      }
    }
}
