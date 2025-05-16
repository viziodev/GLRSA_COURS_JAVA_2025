<?php
require_once "./src/views/CompteView.php";
require_once "./src/services/CompteService.php";
class App{

   public  static function main():void{
    $compteService=new CompteService();
    do {
       //App ==>self
       //$choix=App::menu();
       $choix=self::menu();
       switch ($choix) {
        case '1':
          $compte=CompteView::saisieCompte();
          $compteService->addCompte($compte);
            break;
        case '2':
               CompteView::afficheCompte($compteService->getComptes());
         break;
        default:
            # code...
            break;
       }
    } while ($choix!="3");

   }

   public static function menu():string
   {
      print"1-Ajouter un Compte\n";
      print"2-Lister un Compte\n";
      print"3-Quiiter\n";
      return readline("Veuillez saisir votre choix?\n");
   }
}


//Appel d'une methode static  ==> Classe::methode()
App::main();