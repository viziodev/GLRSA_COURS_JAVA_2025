package views;

import java.util.Scanner;

public class View {
    protected  Scanner scanner=new Scanner(System.in);
       protected  double sasieDouble(String sms){
        double montant;
        do {
              System.out.println(sms);
              montant=scanner.nextDouble();
        } while (montant<=0);
        return montant;
      }
}
