package entity;

public enum TypeCompte {
     EPARGNE(1),CHEQUE(2) ;
     private int value;
     private TypeCompte(int value){
       this.value=value;
    }
      public int getValue(){
      return value;
     }
}
