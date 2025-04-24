package poo.collections;

import java.util.ArrayList;



public class App {
     public static void main(String[] args) {
        ArrayList<String> listeChaine;
        listeChaine=new ArrayList<>();

        listeChaine.add("Bonjour");
        listeChaine.add(1,"Bonjour");
        listeChaine.get(0);
        listeChaine.remove(0);
        listeChaine.remove("Bonjour");
     } 
}
