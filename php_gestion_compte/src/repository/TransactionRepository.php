<?php
require_once "../src/models/Transaction.php";
require_once "../config/Database.php";
class TransactionRepository {
 
     public function __construct()
     {
           Database::connexion();
     }
    public function insert(Transaction $transaction):int{
      try{
         $type=$transaction->getType();
         $date=$transaction->getDate()->format("Y-m-d");
         $montant=$transaction->getMontant();
         $compteId=$transaction->getCompteId();
         $sql="INSERT INTO `transaction` (`type`,`date`, `montant`, `compte_id`) VALUES ('$type', '$date', $montant,$compteId)";
          return Database::getPdo()->exec($sql);
        } catch (\PDOException $ex) {
           print $ex->getMessage()."\n";
        }       
       return 0;
    }

    public function selectAll(int $compteId):array{
     try {
      $sql="SELECT t.*,c.solde FROM `transaction` t, compte c WHERE t.compte_id=c.id and compte_id=$compteId";//Plusieurs Comptes
      $cursor=Database::getPdo()->query( $sql);
      $transactions=[];
      while ($row=$cursor->fetch()) {
          //Convertir une ligne du cursor  == en compte
           $transactions[]=Transaction::of($row);
      }
      return $transactions;
     } catch (\PDOException $ex) {
         print $ex->getMessage()."\n";
    }  
         return [];
    }

    public function totalTransactionByType(int $compteId,string $type):int{
      try {
        $sql=" SELECT sum(`montant`) as total FROM `transaction` WHERE `type`='$type' and compte_id=$compteId";
          $cursor= Database::getPdo()->query( $sql);
             if($row=$cursor->fetch()){
               return $row['total']??0;
             }
        } catch (\PDOException $ex) {
           print $ex->getMessage()."\n";
        }  
           return 0;
    }

    public function countTransaction(int $compteId):int{
      try {
        $sql=" SELECT count(`id`) as count FROM `transaction` WHERE  compte_id=$compteId";
          $cursor= Database::getPdo()->query( $sql);
             if($row=$cursor->fetch()){
               return $row['count']??0;
             }
        } catch (\PDOException $ex) {
           print $ex->getMessage()."\n";
        }  
           return 0;
    }

}
