package service;

import java.util.ArrayList;

import entity.Figure;
import entity.TypeFigure;

public class FigureService {
    ArrayList<Figure>  figures=new ArrayList<>();

    public ArrayList<Figure> showAll() {
        return figures;
    }
    public void add(Figure figure){
        figures.add(figure);
    }
    public ArrayList<Figure> showAll(TypeFigure type) {
        ArrayList<Figure>  figuresWithType=new ArrayList<>();
          for (int index = 0; index < figures.size(); index++) {
              if (figures.get(index).getType()==type) {
                figuresWithType.add(figures.get(index));
              }
          }

        return figuresWithType;
    }


}
