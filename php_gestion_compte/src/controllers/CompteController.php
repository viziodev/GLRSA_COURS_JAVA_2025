<?php
require_once "../src/services/CompteService.php";
require_once "../src/models/Compte.php";
class CompteController{
    private CompteService $compteService;
    public function __construct()
    {
        $this->compteService=new CompteService() ;
        $this->handleRequest();
    }


    private function handleRequest(){
       $action=$_REQUEST["action"]??'list-compte';//form-compte
       switch ($action) {
        case 'form-compte':
             $this->showFormCompte();
        break;
       case 'list-compte':
            $this->showListCompte();
            break;
       case 'save-compte':
             $this->saveCompte();
                break;
       default:
        # code...
        break;
}

    }
    public function showListCompte(){

      $titulaire =$_REQUEST["titulaire"]??"";
      //2-Recuperer/envoyer des donnees du Service(facultatif)
      $comptes=$this->compteService->getComptes($titulaire);
      //3-Produire une Response Http(vues en html , css,js)
      require_once "../views/layout/header.html.php";
      require_once "../views/compte/liste.html.php";
      require_once "../views/layout/footer.html.php";
    }

    public function showFormCompte(){
          require_once "../views/layout/header.html.php";
          require_once "../views/compte/form.html.php";
        require_once "../views/layout/footer.html.php";
      }

      public function saveCompte(){
             //1-Recevoir la Request Http (Donne provenant de vue) 
              $solde =$_REQUEST["solde"];
              $titulaire =$_REQUEST["titulaire"];
             //2-Validation de Donnees 
                /* $compte =new Compte();
                   $compte->setSolde($solde);
                   $compte->setTitulaire($titulaire);
                */

              $compte =new Compte($titulaire ,$solde);
            //3-envoyer des donnees du Service(facultatif)
               $this->compteService->addCompte($compte);
             //4-Faire une redirection vers une action du controller
              header("location:index.php?controller=compte&action=list-compte");
      }
}