<?php
require_once "../src/repository/CompteRepository.php";
require_once "../src/models/Compte.php";

class CompteService{
  private CompteRepository $compteRepository; 

   public function __construct()
   {
    $this->compteRepository =new CompteRepository();
   }

     public function addCompte(Compte $compte):void
     {
          $this->compteRepository->insert($compte);
     }
     /**
      * Get the value of comptes
      */
     public function getComptes(string $titulaire): array
     {
          return  $this->compteRepository->selectAll($titulaire);
     }

     public function searchCompteById(int $id): Compte|null
     {
          return  $this->compteRepository->selectById($id);
     }
}

