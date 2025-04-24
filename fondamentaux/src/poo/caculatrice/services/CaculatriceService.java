package poo.caculatrice.services;

public class CaculatriceService {
       public double addition(int a,double b) {
        return a + b;
       }
  
       public double soustraction(int a,double b) {
           return a - b;
       }
   
       public boolean division(int a,double b) {
           if (b!=0) {
               return true; 
           }
           return false;
       } 
}
