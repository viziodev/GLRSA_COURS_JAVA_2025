<?php
require_once "../src/repository/TransactionRepository.php";
require_once "../src/models/Transaction.php";

class TransactionService{
  private CompteRepository $compteRepository; 
  private TransactionRepository $transactionRepository; 

   public function __construct()
   {
    $this->compteRepository =new CompteRepository();
    $this->transactionRepository=new TransactionRepository();
   }

     public function addTransaction(Transaction $transaction):void
     {
          $this->transactionRepository->insert($transaction);
     }
     /**
      * Get the value of comptes
      */
     public function getTransactions(int $compteId): array
     {
          return  $this->transactionRepository->selectAll($compteId);
     }

     public function getStatistiques(int $compteId): array
     {
          return [
             "totalDepot" => $this->transactionRepository->totalTransactionByType($compteId,"DEPOT"),
             "totalRetrait" => $this->transactionRepository->totalTransactionByType($compteId,"RETRAIT"),
             "nbreTransaction" => $this->transactionRepository->countTransaction($compteId)
          ] ;
     }

}

