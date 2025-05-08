package entity;

public enum TransactionType {
    RETRAIT(1),DEPOT(2);

    private int value;
    public int getValue() {
        return value;
    }

    private TransactionType(int value){
     this.value=value;
    }

    public static TransactionType getOptionByValue(int value){
        TransactionType[] options=TransactionType.values();
        for (int index = 0; index < options.length; index++) {
              if (options[index].getValue()==value) {
                  return  options[index];
              }
        }
           return null;
    }

}
