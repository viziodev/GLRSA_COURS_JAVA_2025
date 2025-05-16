<?php
require_once "./src/models/Compte.php";
require_once "./src/repository/CompteRepository.php";
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
     public function getComptes(): array
     {
          return  $this->compteRepository->selectAll();
     }

     public function searchCompteById(int $id): array|null
     {
          return  $this->compteRepository->selectById($id);
     }
}

