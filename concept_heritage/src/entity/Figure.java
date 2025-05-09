package entity;

public abstract class Figure {
      protected double diagonale;

      protected TypeFigure type;

      //Methodes abstraites 
      public abstract double perimetre();
      public abstract  double surface();

      

      /*
       * Regle :
       *   1.Une Methode abstraite se trouve toujours dans une classe abstraite 
       *   2.Une Classe abstraite est non instanciable c'est son constructeur est  a protected
       * 
       */
    
      protected Figure() {
      }
      protected Figure(double diagonale) {
        this.diagonale = diagonale;
      }

      public final  double getDiagonale() {
          return diagonale;
      }

      public final void setDiagonale(double diagonale) {
          this.diagonale = diagonale;
      }

      @Override
      public String toString() {
        return "Figure [diagonale=" + diagonale + "]";
      }
      public TypeFigure getType() {
          return type;
      }
      public void setType(TypeFigure type) {
          this.type = type;
      }
}
