package heritage;

import java.util.ArrayList;
import heritage.entity.Etudiant;
import heritage.entity.Grade;
import heritage.entity.Personne;
import heritage.entity.Professeur;

public class App {
    /*
     *  Gestion de Note dans une Ecole
     *     Professeur(id,nom,prenom,grade(Dr,Ing,Prof))
     *     Note(id,valeur,appreciation(P,AB,B,....), Professeur, Matiere)
     *     Etudiant(id,nom,prenom,Classe, List<Note> notes)
     *     Matiere (id,nom)
     * 
     *  Factorisation Attributs et methodes commumnes  ==> Principe d'heritage
     *      2x +2y  =2(x+y)
     *      2x + 3x=x(2+3)
     *      2y+ 3x ==>
     *     Regles : 
     *      1-Les Classes soient  du meme type
     *          a-Deux  Classes sont du meme type lorsqu'on peut trouver 
     *            une classe qui Generalise ces deux classes
     *             si Classe A est un cas particulier(est une vesion ou est une derive) d'une classe B 
     *             alors on dit que A herite de B.
     *             Moto est un Vehicule
     *             Voiture est un Vehicule
     *             Un Chien est un Animal 
     *             Un Chat est un Animal
     *             Un Carre est une Figure
     *             Un Rectangle est une Figure
     *        b. Exemple 
     *           Professeur(id,nom,prenom,grade(Dr,Ing,Prof))
     *           Etudiant (id,nom,prenom,Classe, List<Note> notes)
     *           Matiere (id,nom)
     *          Exemple 
     *           Un Professeur est une Personne  ==> Un Professeur Herite d'une Personne
     *           Un Etudiant est une Personne  ==> Un Etudiant Herite d'une Personne
     *           Une Matiere n'est  pas une Personne   ==> Un Matiere n'Herite pas  d'une Personne
     *         b. Heritage  
     *           Un Professeur est une Personne  ==> Un Professeur Herite d'une Personne
     *           Un Etudiant est une Personne  ==> Un Etudiant Herite d'une Personne
     *          Terminologie 
     *           -Professeur , Etudiant   sont  des sous classes  ou classes derivees ou des classes Filles 
     *            de Personne 
     *           -Personne est la classe Mere , super classe , classe de base
     *          La Classe Personne factorise les attributs et les methodes communs de Etudiant et Professeur
     *           Avant Heritage 
     *             Professeur(id,nom,prenom,grade(Dr,Ing,Prof))
     *             Etudiant (id,nom,prenom,Classe, List<Note> notes)
     *          Apres Heritage 
     *            Personne(id,nom,prenom, getters ,setters,toChaine)
     *            Professeur(grade(Dr,Ing,Prof))  herite  Personne
     *            Etudiant (Classe, List<Note> notes) herite  Personne
     *          -Polymorphisme methode  =
     *               1-Heritage de Methode 
     *               2-Redefinition de la Methode
     *            
     *            A (  m1(1), m2(2))  ==> A a =new A();           a.m2() ==>2     a.m1()==> 1 
     *              B herite de A 
     *                 B( m1(11), m2(2),m3(3))  ==> B b =new C();   b.m2() ==>2     b.m1()==> 11 
     *               C herite de A 
     *                  C( m1(12), m2(2),m4(4)) ==> C c =new C();    c.m2() ==>2     c.m1()==> 12 
     * 
     *          -Convertion Objet
     *             1- Objet Classe Mere vers Objet d'une classe Fille
     *                 Mere ObjetMeret=new Fille()
     *             2- Objet classe Fille vers Objet d'une classe Mere
     *                 //Acceder au methodes specifiques aux classes filles
     *                     (ClasseFille)objetMere
     */

     public static void main(String[] args) {
        Personne p=new Personne();
        p.setId(1);
        p.setNom("Wane");
        p.setPrenom("Birane Baila");
      //  System.out.println(p.toChaine());
        
        Personne personne=new Professeur();
        /*
         * Personne    <==  Professeur
         * id                id
         * nom               nom
         * prenom            prenom
         * --                grade
         * setNom()          setNom()
         * --                setGrade()
         */
        personne.setId(2);
        personne.setNom("Tall");
        personne.setPrenom("Aly");
      ((Professeur)personne).setGrade(Grade.ING);//

       // System.out.println(personne.toChaine());
        personne=new Etudiant();
        personne.setId(3);
        personne.setNom("Kane");
        personne.setPrenom("Aissatou");
      ((Etudiant)personne).setClasse("L2GLRSA");
       
         //Ajouter un etudiant dans une Liste
           /*  ArrayList<Etudiant> etudiants=new ArrayList<>();
           Etudiant etudiant=new Etudiant();
           etudiant.setId(3);
           etudiant.setNom("Kane");
           etudiant.setPrenom("Aissatou");
           etudiant.setClasse("L2GLRSA");
           etudiants.add(etudiant);
        for (Etudiant et : etudiants) {
           System.out.println(et);
        }

         //Ajouter un professeur dans une Liste
        ArrayList<Professeur> professeurs=new ArrayList<>();
          Professeur professeur=new Professeur();
          professeur.setId(2);
          professeur.setNom("Tall");
          professeur.setPrenom("Aly");
          professeur.setGrade(Grade.ING);
          professeurs.add(professeur);

          for (Professeur prof : professeurs) {
            System.out.println(prof);
         }
         //Ajouter une Personne dans une Liste
          ArrayList<Personne> personnes=new ArrayList<>();
          Personne p1=new Personne();
          p1.setId(1);
          p1.setNom("Wane");
          p1.setPrenom("Birane Baila");
          personnes.add(p1);

          for (Personne p2 : personnes) {
            System.out.println(p2);
          }
      */ 

           ArrayList<Personne> personnes=new ArrayList<>();

           Professeur professeur=new Professeur();
            professeur.setId(2);
            professeur.setNom("Tall");
            professeur.setPrenom("Aly");
            professeur.setGrade(Grade.ING);

            Etudiant etudiant=new Etudiant();
            etudiant.setId(3);
            etudiant.setNom("Kane");
            etudiant.setPrenom("Aissatou");
            etudiant.setClasse("L2GLRSA");

           Personne p1=new Personne();
           p1.setId(1);
           p1.setNom("Wane");
           p1.setPrenom("Birane Baila");

           personnes.add(professeur);
           personnes.add(etudiant);
           personnes.add(p1);

           for (Personne p2 : personnes) {
              System.out.println(p2.toChaine());
              if (p2 instanceof Professeur) {
                 System.out.println(((Professeur)p2).getGrade());
              }

              if (p2 instanceof Etudiant) {
                 System.out.println(((Etudiant)p2).getClasse());
              }
            
            }
           
     }
}
