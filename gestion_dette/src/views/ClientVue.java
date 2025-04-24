package views;

import java.util.Scanner;

import entity.Client;
import services.ClientService;

public class ClientVue {
  private Scanner scanner;
  private ClientService clientService;
  public ClientVue(ClientService cs){
     scanner=new  Scanner(System.in);
     clientService=cs;
  }

  public String saisieChamp(String message){
    String ch;
   do {
       System.out.println(message);
       ch=scanner.nextLine();
   } while (ch.compareTo("")==0);
     return ch;
  }
  public Client saisieClient(){
      Client client=new Client();
       client.setNom(saisieChamp("Entrer le nom et prenom"));
       String tel;
       boolean clientExist;
       do {
            tel=saisieChamp("Entrer le telephone ");
            clientExist=clientService.searchClientByTel(tel)!=null;
            if (clientExist) {
                System.out.println("Ce numero telephone existe deja"); 
            }
       } while (clientExist);
       client.setTelephone(tel);
       client.setAdresse(saisieChamp("Entrer l'adresse "));
      return client;
   }

   public void afficheTabClient(Client[] clients,int nbreClient){
      for (int index = 0; index < nbreClient; index++) {
           System.out.println(clients[index].toChaine());
      }
   }

}
