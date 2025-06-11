<?php 
require_once "../config/Controller.php";
require_once "../src/services/UserService.php";
require_once "../src/models/User.php";
class UserController extends Controller{

    private UserService $userService;
    public function __construct()
    {
        parent::__construct();
        $this->userService=new UserService() ;
        $this->handleRequest();
    }
    protected function handleRequest(){
        $action=$_REQUEST["action"]??'form-login';//form-compte
         switch ($action) {
          case 'form-login':   
            $this->showForm();
          break;
          case 'logout': 
            $this->logout();          
          break;
          case 'login':
            $this->login();           
            break;
         
         default:
          # code...
          break;
      }
  
      }

      private function showForm(){
        require_once "../views/user/login.html.php";
      }
      private function login(){
        //1-Recuperation
         $login=$_REQUEST['login'];
         $password=$_REQUEST['password'];
         //2-Validation
         $this->validator->isEmpty("login",$login,"Login est Obligatoire ");
         $this->validator->isEmail("login",$login,"Login doit etre un email");
         $this->validator->isEmpty("password",$password,"Login est obligatoire");
           
        //3-Authentification
        
         if ($this->validator->isValid()) {
         
                $user=$this->userService->seConnecter($login, $password);
                if ($user==null) {
                    //Erreur de 
                      $this->validator->addError('connexion',"Login ou de password incorrect");
                      $_SESSION['errors']=$this->validator->getErrors();
                      header("location:index.php");
                      exit;
                }else {
                    $_SESSION['user']= $user->toArray();
                    header("location:index.php?controller=compte&action=list-compte");
                    exit;
                }
               
           }else{
               //Il y'a erreur
               $_SESSION['errors']=$this->validator->getErrors();
               header("location:index.php");
               exit;
           }
            

      }

      private function logout(){
        session_unset();      // Supprime toutes les variables
        session_destroy();    // Détruit la session
        header('Location: index.php');
      }


}