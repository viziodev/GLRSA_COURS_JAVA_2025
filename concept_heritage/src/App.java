import java.util.Scanner;

import entity.Figure;
import entity.TypeFigure;
import service.FigureService;
import views.FigureView;




public class App {
      private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int choix;
        FigureService figureService=new FigureService();
        do {
            choix=menu();

            switch (choix) {
                case 1:
                Figure figure=FigureView.saisie();
                figureService.add(figure); 
                break;

                case 2:
                     FigureView.affiche(figureService.showAll());
                break;

                case 3:
                int type;
                 do {
                    System.out.println("0-Carre");
                    System.out.println("1-Rectangle");
                    type =scanner.nextInt();
                  } while (type!=0 && type!=1);
                   TypeFigure typeFigure=type==0?TypeFigure.CARRE:TypeFigure.RECTANGLE;
                     FigureView.affiche(figureService.showAll(typeFigure));
                break;
            
                default:
                    break;
            }
        } while (choix!=4);
    }

    public static int  menu(){
            System.out.println("1-Add Figure");
            System.out.println("2-List Figure");
            System.out.println("3-List Figure Par Type");
            System.out.println("4-Quitter");
            return  scanner.nextInt();
       
    }
}
