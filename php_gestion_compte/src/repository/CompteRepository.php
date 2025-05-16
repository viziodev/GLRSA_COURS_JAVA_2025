<?php
require_once "./src/models/Compte.php";
require_once "./config/Database.php";
class CompteRepository {
    /*
         Methodes acces aux donnees ==> qui execute des Requetes Sql
           Methode de Mis a jour: (insert ,update ,delete) return un int comme resultat 
                    qui represente le nombre de lignes modifiees dans la base
           Methode de selection: (select) return un array comme resultat 
                    qui represente les donnees retournees par  la base donnee
                      -
     */

     public function __construct()
     {
           Database::connexion();
     }
    public function insert(Compte $compte):int{
      try{
         $numero=$compte->getNumero();
         $dateCreation=$compte->getDateCreation()->format("Y-m-d");
         $solde=$compte->getSolde();
         $sql="INSERT INTO `compte` (`numero`,`dateCreation`, `solde`) VALUES ('$numero', '$dateCreation', $solde)";
          return Database::getPdo()->exec($sql);
        } catch (\PDOException $ex) {
           print $ex->getMessage()."\n";
        }  
          
       return 0;
    }

    public function selectAll():array{
     try {
      $sql="select * from compte ";//Plusieurs Comptes
      $cursor=Database::getPdo()->query( $sql);
      $comptes=[];
      while ($row=$cursor->fetch()) {
          //Convertir une ligne du cursor  == en compte
           $comptes[]=Compte::of($row);
      }
      return $comptes;
     } catch (\PDOException $ex) {
         print $ex->getMessage()."\n";
    }  
         return [];
    }

    public function selectById(int $id):Compte|null{
      try {
        $sql="select * from compte where id=$id ";//Plusieurs Comptes
          $cursor= Database::getPdo()->query( $sql);
             $row=$cursor->fetch();
             return Compte::of($row);
        } catch (\PDOException $ex) {
           print $ex->getMessage()."\n";
        }  
           return null;
    }

}
