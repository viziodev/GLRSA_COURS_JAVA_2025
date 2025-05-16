<?php
require_once "./src/models/Compte.php";
class CompteService{
     private array $comptes=[];

     public function addCompte(Compte $compte):void
     {
        $this->comptes[]=$compte;
     }
     /**
      * Get the value of comptes
      */
     public function getComptes(): array
     {
          return $this->comptes;
     }
}

