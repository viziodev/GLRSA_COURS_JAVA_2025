package entity;

public  class Rectangle  extends Figure{
    private double longeur;
    private double largeur;

    
    public Rectangle(double diagonale, double longeur, double largeur) {
        super(diagonale);
        this.longeur = longeur;
        this.largeur = largeur;
        super.type=TypeFigure.RECTANGLE;
    }


    public Rectangle() {
        super.type=TypeFigure.RECTANGLE;
    }

    
    public double getLongeur() {
        return longeur;
    }
    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }
    public double getLargeur() {
        return largeur;
    }
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
    @Override
    public String toString() {
        return "Rectangle [diagonale=" + diagonale + ", longeur=" + longeur + ", largeur=" + largeur + "]";
    }




    @Override
    public double perimetre() {
        return (largeur+longeur)*2;
    }


    @Override
    public double surface() {
        return largeur*longeur;
    }
}
