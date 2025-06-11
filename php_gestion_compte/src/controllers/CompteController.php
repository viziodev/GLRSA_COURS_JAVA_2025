<?php
require_once "../config/Controller.php";
require_once "../src/services/CompteService.php";
require_once "../src/services/UserService.php";
require_once "../src/models/Compte.php";
class CompteController extends Controller{
    private CompteService $compteService;
    private UserService $userService;
    public function __construct()
    {
        parent::__construct();
        $this->compteService=new CompteService() ;
        $this->userService=new UserService() ;
        $this->handleRequest();
    }

    protected function handleRequest(){
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
      $clientId=$_SESSION['user']['role']=="CLIENT"?$_SESSION['user']['id']:null;
      //2-Recuperer/envoyer des donnees du Service(facultatif)
       $comptes=$this->compteService->getComptes($clientId,$titulaire);
      //3-Produire une Response Http(vues en html , css,js)
        $this->render("compte/liste.html.php",[
          'comptes'=>$comptes
        ]);
    }

      public function showFormCompte(){
           $clients= $this->userService->getAllClients();
           $this->render("compte/form.html.php",[
            "clients"=>$clients
           ]);
      }

      public function saveCompte(){
             //1-Recevoir la Request Http (Donne provenant de vue) 
                 //Methode 1 
                   //$solde =$_REQUEST["solde"];
                  // $titulaire =$_REQUEST["titulaire"];
                //Methode 2 ==>Extract
                   extract($_REQUEST);
             //2-Validation de Donnees 
               $this->validator->isEmpty("solde",$solde,"Solde est obligatoire ");
               $this->validator->isEmail("titulaire",$titulaire,"Titulaire est obligatoire ");
              if($this->validator->isValid()){
                 $compte =new Compte($titulaire ,$solde);
                  //3-envoyer des donnees du Service(facultatif)
                  $this->compteService->addCompte($compte);
                   //4-Faire une redirection vers une action du controller
                  header("location:index.php?controller=compte&action=list-compte");
             }else{
                 $_SESSION['errors']=$this->validator->getErrors();
                 header("location:index.php?controller=compte&action=form-compte");
             }
            
           
      }
}