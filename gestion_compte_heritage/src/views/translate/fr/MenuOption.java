package views.translate.fr;

public enum MenuOption {
    ADD_COMPTE(1,"1-Ajouter  un  compte dans un Liste"),
    SHOW_ALL_COMPTE(2,"2-Afficher les comptes du Liste"),
    ADD_TRANSACTION_IN_COMPTE(3,"3-Lister les transactions d’un compte"),
    SHOW_TRANSACTION_IN_COMPTE(4,"4-Ajouter  une Transaction à un compte"),
    QUITTER(5,"5-QUITTER"),
    CHOIX(0,"Faites votre choix");

    private MenuOption(int value,String message) {
        this.message = message;
        this.value = value;
    }
    private String message;
    private int value;

    public int getValue() {
        return value;
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

    public static MenuOption getOptionByValue(int value){
        MenuOption[] options=MenuOption.values();
        for (int index = 0; index < options.length; index++) {
              if (options[index].getValue()==value) {
                  return  options[index];
              }
        }
           return null;
    }


}
