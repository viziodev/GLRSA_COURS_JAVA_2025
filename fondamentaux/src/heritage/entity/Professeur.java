package heritage.entity;

public class Professeur extends Personne{
   
    private Grade grade;

    public Grade getGrade() {
        return grade;
    }
    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toChaine() {
        return "Professeur [id=" + getId() + ", nom=" + getNom() + ", prenom=" + getPrenom() + ", grade=" + grade + "]";
    }
    @Override
    public String toString() {
        return "Professeur [grade=" + grade + "]";
    }

}
