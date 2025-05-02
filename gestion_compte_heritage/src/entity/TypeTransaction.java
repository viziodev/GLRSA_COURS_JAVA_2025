package entity;

public enum TypeTransaction {
    RETRAIT(1),DEPOT(2);
    private int value;
     private TypeTransaction(int value){
       this.value=value;
    }
      public int getValue(){
      return value;
     }

     public static TypeTransaction getOptionByValue(int value){
        TypeTransaction[] options=TypeTransaction.values();
        for (int index = 0; index < options.length; index++) {
              if (options[index].getValue()==value) {
                  return  options[index];
              }
        }
           return null;
    }


}
