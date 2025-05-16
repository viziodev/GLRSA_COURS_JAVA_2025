<?php 
require_once "./src/models/Compte.php";
class CompteView{
      public static function saisieCompte():Compte{
         $compte=new Compte();
         do {
            $solde =(float)readline("Veuillez entrer le solde");
         } while ($solde <= 0);
         $compte->setSolde( $solde);
         return  $compte;
      }

      public static function afficheCompte(array $comptes):void{
        foreach ($comptes as $value) {
               print $value;
        }
      }
}
