package entity;

public  class Carre extends Figure  {
    private double cote;
    /*
     * Lorsqu'une classe herite d'une methode abstraites , elle a deux choix
     *   1-Redefinir la Methode abstraite pour devenir une classe concrete
     *   2-Laisser la methode a abstraite alors elle doit etre a abstact
     */

    public Carre(double diagonale, double cote) {
        super(diagonale);
        this.cote = cote;
        super.type=TypeFigure.CARRE;
       
    }

    public Carre() {
        super();//constructeur de Figure
        super.type=TypeFigure.CARRE;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public String toString() {
        return "Carre [diagonale=" + diagonale + ", cote=" + cote + "]";
    }



    @Override
    public double perimetre() {
        return cote*4;
    }



    @Override
    public double surface() {
        return cote*cote;
    }

   

    
}
