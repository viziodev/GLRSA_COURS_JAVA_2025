package entity;

public class Client {
   private String nom,telephone, adresse;
   private final int N=10;
   
 
   private Dette[] dettes=new Dette[N];
   private int nbreDette=0;

   public int getNbreDette() {
    return nbreDette;
   }
  public Dette[] getDettes() {
    return dettes;
  }

  public boolean addDette(Dette dette){
    if (nbreDette<N) {
        dettes[nbreDette] = dette;
        nbreDette++;
        return true;
     }
     return false;
  }


   public Client(){

   }

   public String getNom(){
    return nom;
   }
   public String getTelephone(){
    return telephone;
   }

   public String getAdresse(){
    return adresse;
   }

   public void setNom(String nom){
      this.nom=nom;
   }

   public void setTelephone(String telephoneP){
      telephone=telephoneP;
   }

   public void setAdresse(String adresseP){
      adresse=adresseP;
    }

 public boolean egal(Client client){ 
     // return telephone.equals(client.getTelephone());
      return telephone.compareTo(client.getTelephone())==0;
 }

 public void copy(Client client){
    nom=client.getNom();
    telephone=client.getTelephone();
    adresse=client.getAdresse();
 }

 public String toChaine(){
    return "Nom :"+nom+" Telephone: "+telephone+" Adresse: "+adresse;
 }

}
