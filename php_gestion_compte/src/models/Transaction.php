<?php 
class Transaction{

       private int $id;
       private DateTime $date;
       private string $montant;
       private string $type;

       private string $soldeAppres;
       private int $compteId;

       //Attributs de Style
       public string $sensTransation="";
       public string $colorTextMontant="";
       public string $bgTypeTransaction="";

      //PHP Constructeur par defaut ==>  __construct()
      public function __construct(int $compteId=0,string $montant="0",string $type="")
      {
        $this->date=new DateTime();
        $this->montant=$montant;
        $this->type=$type;
        $this->compteId=$compteId;

      }
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
      

       public static function of($row):Transaction
       {
              //Convertir une ligne du cursor  == en compte
              $transaction=new Transaction();
              $transaction->setId($row['id']);
              $transaction->setMontant($row['montant']);
              $transaction->setDate(new DateTime($row['date']));
              $transaction->setType($row['type']);
              $transaction->setSoldeAppres($row['solde']);

              $transaction->sensTransation=$row['type']=="DEPOT"?'+':'-';
              $transaction->colorTextMontant=$row['type']=="DEPOT"?'text-success':'text-danger';
              $transaction->bgTypeTransaction=$row['type']=="DEPOT"?'bg-success':'bg-danger';
              return $transaction; 

       }

      

       /**
        * Get the value of date
        */
       public function getDate(): DateTime
       {
              return $this->date;
       }

       /**
        * Set the value of date
        */
       public function setDate(DateTime $date): self
       {
              $this->date = $date;

              return $this;
       }

       /**
        * Get the value of montant
        */
       public function getMontant(): string
       {
              return $this->montant;
       }

       /**
        * Set the value of montant
        */
       public function setMontant(string $montant): self
       {
              $this->montant = $montant;

              return $this;
       }

       /**
        * Get the value of type
        */
       public function getType(): string
       {
              return $this->type;
       }

       /**
        * Set the value of type
        */
       public function setType(string $type): self
       {
              $this->type = $type;

              return $this;
       }

       public function getDateToString():string{
              return  $this->date->format("d-m-Y");
           }
     

       /**
        * Get the value of soldeAppres
        */
       public function getSoldeAppres(): string
       {
              return $this->soldeAppres;
       }

       /**
        * Set the value of soldeAppres
        */
       public function setSoldeAppres(string $soldeAppres): self
       {
              $this->soldeAppres = $soldeAppres;

              return $this;
       }

       /**
        * Get the value of compteId
        */
       public function getCompteId(): int
       {
              return $this->compteId;
       }

       /**
        * Set the value of compteId
        */
       public function setCompteId(int $compteId): self
       {
              $this->compteId = $compteId;

              return $this;
       }
}