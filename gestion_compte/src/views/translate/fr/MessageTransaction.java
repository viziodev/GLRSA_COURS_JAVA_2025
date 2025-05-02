package views.translate.fr;

public enum MessageTransaction {
      RETRAIT_FAILED("Solde Insuffisant") ,
      DEPOT_SUCCESS("Transaction de Depot  Reussie"),
      RETRAIT_SUCCES("Transaction de Retrait  Reussie");


      private String message;

      private MessageTransaction(String message){
        this.message=message;
      }
      public String getMessage() {
          return message;
      }
  
      public static void showOptionEnum(){
          MenuOption[] options=MenuOption.values();
          for (int index = 0; index < options.length; index++) {
              System.out.println(options[index].getMessage());
          }
      }
}
