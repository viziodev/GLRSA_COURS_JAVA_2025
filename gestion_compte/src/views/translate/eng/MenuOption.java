package views.translate.eng;

public enum MenuOption {
    ADD_COMPTE("1-ADD compte To List"),
    SHOW_ALL_COMPTE("2-Show in List"),
    ADD_TRANSACTION_IN_COMPTE("3-Show   transactions In compte"),
    SHOW_TRANSACTION_IN_COMPTE("Add   Transaction To compte"),
    QUITTER("5-QUIT"),
    CHOIX("Do choice");

    private MenuOption(String message) {
        this.message = message;
    }

    private String message;

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
