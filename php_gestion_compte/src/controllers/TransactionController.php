<?php 
require_once "../src/services/CompteService.php";
require_once "../src/services/TransactionService.php";
require_once "../src/models/Compte.php";
require_once "../src/models/Transaction.php";
class TransactionController{

    private CompteService $compteService;
    private TransactionService $transactionService;
    public function __construct()
    {
        $this->compteService=new CompteService() ;
        $this->transactionService=new TransactionService() ;
        $this->handleRequest();
    }


    private function handleRequest(){
      $action=$_REQUEST["action"]??'list-transaction';//form-compte
       switch ($action) {
        case 'list-transaction':
            if (!isset($_REQUEST['id'])) {
                header("location:index.php?controller=compte&action=list-compte");
                exit;
            }
             $this->showListTransaction();
        
        break;
        case 'form-transaction':
             if (!isset($_REQUEST['id'])) {
                header("location:index.php?controller=compte&action=list-compte");
                exit;
             }
              $this->showFormTransaction();
       break;

       case 'save-transaction':
        $this->saveTransaction();
           break;
       
       default:
        # code...
        break;
    }

    }
    public function showListTransaction(){
         $compteId=$_REQUEST['id'];
          $compte= $this->compteService->searchCompteById($compteId);
        if ($compte==null) {
            header("location:index.php?controller=compte&action=list-compte");
            exit;
        }
        $transactions=$this->transactionService->getTransactions($compteId);
        $statistiques=$this->transactionService->getStatistiques($compteId);
        require_once "../views/layout/header.html.php";
        require_once "../views/transaction/liste.html.php";
        require_once "../views/layout/footer.html.php";
      }
  

      public function showFormTransaction(){
        $compteId=$_REQUEST['id'];
        $compte= $this->compteService->searchCompteById($compteId);
        if ($compte==null) {
          header("location:index.php?controller=compte&action=list-compte");
          exit;
        }
        require_once "../views/layout/header.html.php";
        require_once "../views/transaction/form.html.php";
        require_once "../views/layout/footer.html.php";
    }

    public function saveTransaction(){
        //1-Recevoir la Request Http (Donne provenant de vue) 
         $montant =$_REQUEST["montant"];
         $type =$_REQUEST["type"];
         $compteId =$_REQUEST["compteId"];
         $transaction=new Transaction( $compteId, $montant , $type);
         $this->transactionService->addTransaction($transaction);
        //4-Faire une redirection vers une action du controller
         header("location:index.php?controller=transaction&action=list-transaction&id=$compteId");
 }
}

