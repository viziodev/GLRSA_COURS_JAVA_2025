package heritage.entity;

import java.util.ArrayList;

public class Etudiant extends Personne {
    private String classe;
    private ArrayList<Note> notes=new ArrayList<>();
    
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public ArrayList<Note> getNotes() {
        return notes;
    }
    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }

    public String toChaine() {
        return "Etudiant [id=" + super.id + ", nom=" + super.nom + ", prenom=" + super.prenom+ "classe=" + this.classe + "]";
    }

}
