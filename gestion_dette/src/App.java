import java.util.Scanner;

import entity.Client;
import entity.Dette;
import services.ClientService;
import views.ClientVue;
import views.DetteVue;

public class App {
    private static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int choix;
        ClientService clientService = new ClientService();
        ClientVue clientVue=new ClientVue(clientService);
        DetteVue detteVue = new DetteVue();
        do {
          choix=menu();
          switch (choix) {
            case 1: 
               Client client =clientVue.saisieClient();
               if(clientService.addClient(client)){
                  System.out.println("Client ajoute avec succees");
               }else{
                 System.out.println("Le Tableau est plein");
               }
                break;
            case 2: 
                clientVue.afficheTabClient(clientService.getAllClients(), clientService.getNbreClient());
                break;
            case 3: 
              String tel=clientVue.saisieChamp("Entrer le telephone ");
              client =clientService.searchClientByTel(tel);
              if (client==null) {
                   System.out.println("Aucun Client ne correspond a ce numero"); 
               }else{
                 Dette dette =detteVue.saisieDette();
                 if(client.addDette(dette)){
                     System.out.println("Dette ajoute avec succees");
                 }else{
                     System.out.println("Le Tableau est plein");
                 }
               } 
                break;
            case 4: 
               tel=clientVue.saisieChamp("Entrer le telephone ");
               client =clientService.searchClientByTel(tel);
               if (client==null) {
                 System.out.println("Aucun Client ne correspond a ce numero"); 
               }else{
                   detteVue.afficheTabDette(client.getDettes(), client.getNbreDette());
                } 
                break;
            default:
                break;
          }
            
        } while (choix!=5);
    }

    public static int menu(){
        System.out.println("1-Ajouter  un client  dans un Tableau");
        System.out.println("2-Lister les clients  du Tableau");
        System.out.println("3-Ajouter Dette a un client");
        System.out.println("4-Lister les Dettes d'un client");
        System.out.println("5-Quitter");
        int choix=scanner.nextInt();
        return choix;
    }
}
