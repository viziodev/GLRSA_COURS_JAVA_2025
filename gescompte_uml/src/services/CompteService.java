package services;

import java.util.ArrayList;

import entity.Compte;

public class CompteService {
     private  ArrayList<Compte>  comptes =new ArrayList<>();
     public  CompteService(){

     }
    public  ArrayList<Compte> getComptes() {
        return comptes;
    }

    public  void addCompte(Compte compte){
        comptes.add(compte);
    }

    public  Compte getCompteByNum(String num){
        for (int index = 0; index < comptes.size(); index++) {
              if (comptes.get(index).getNumero().equals(num)) {
                return  comptes.get(index);
              }
        }
        return null;
    }
}
