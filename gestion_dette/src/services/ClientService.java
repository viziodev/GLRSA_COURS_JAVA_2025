package services;

import entity.Client;

public class ClientService {
    private final int N=10;
    private  Client[] clients;
    private int nbreClient;
  

   public ClientService(){
     clients=new Client[N];
     nbreClient=0;
   }

   public Client[] getAllClients(){ return clients; }
   public int getNbreClient(){ return nbreClient; }
   public boolean addClient(Client client){
     if (nbreClient<N) {
        clients[nbreClient] = client;
        nbreClient++;
        return true;
     }
     return false;
   }

   public Client searchClientByTel(String tel){
    for (int index = 0; index < nbreClient; index++) {
        if (clients[index].getTelephone().equals(tel)) {
              return clients[index];
        }
     }
       return null;
   }
}
