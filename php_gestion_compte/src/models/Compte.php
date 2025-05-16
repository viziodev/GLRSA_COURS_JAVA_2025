<?php 
class Compte{
    //  private static int $nbreCompte=0;
       private int $id;
       private string $numero;
       private DateTime $dateCreation;
       private string $solde;

      //PHP Constructeur par defaut ==>  __construct()
      public function __construct()
      {

        $this->numero=uniqid();
        $this->dateCreation=new DateTime();
      }

     //Java ==>this.nomAttribut
        //PHP ==>$this->nomAttribut  ==> Obligatoire sur les attributs
        //PHP ==>$this->nomMethode()  ==> Obligatoire sur les attributs
       /**
        * Get the value of id
        */
       public function getId(): int
       {
              return $this->id;
       }

       /**
        * Set the value of id
        */
       public function setId(int $id): void
       {
              $this->id = $id;
       }

       /**
        * Get the value of numero
        */
       public function getNumero(): string
       {
              return $this->numero;
       }

       /**
        * Set the value of numero
        */
       public function setNumero(string $numero): void
       {
              $this->numero = $numero;
       }

       /**
        * Get the value of dateCreation
        */
       public function getDateCreation(): DateTime
       {
              return $this->dateCreation;
       }

       /**
        * Set the value of dateCreation
        */
       public function setDateCreation(DateTime $dateCreation): void
       {
              $this->dateCreation = $dateCreation;

  
       }

       /**
        * Get the value of solde
        */
       public function getSolde(): string
       {
              return $this->solde;
       }

       /**
        * Set the value of solde
        */
       public function setSolde(string $solde):void
       {
              $this->solde = $solde;
       }

       public function __toString()
       {
           return "ID :".$this->id."\n Numero :".$this->numero."\n Numero :".$this->dateCreation->format("d-m-Y")."\n Solde :".$this->solde."\n";
       }

       public static function of($row):Compte
       {
              //Convertir une ligne du cursor  == en compte
              $compte=new Compte();
              $compte->setId($row['id']);
              $compte->setNumero($row['numero']);
              $compte->setSolde($row['solde']);
              $compte->setDateCreation(new DateTime($row['dateCreation']));
              return $compte; 
       }
}