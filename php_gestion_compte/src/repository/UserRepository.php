<?php 
require_once "../config/Database.php";
require_once "../src/models/User.php";
 class UserRepository{

    public function __construct()
    {
          Database::connexion();
    }

    public function selectByLoginAndPassword(string  $login,string $password):User|null{
        try {
          $sql="SELECT * FROM `user` WHERE `login`='$login' and password='$password'; ";//Plusieurs Comptes
            $cursor= Database::getPdo()->query( $sql);
               if($row=$cursor->fetch()){
                 return User::of($row);
               }
          } catch (\PDOException $ex) {
             print $ex->getMessage()."\n";
          }  
             return null;
      }

      public function selectUsersByRole(string $role="CLIENT"):array{
        try {
          $sql="SELECT * FROM `user` WHERE role='$role' ";//Plusieurs Comptes
            $cursor= Database::getPdo()->query( $sql);
            $users=[];
               while($row=$cursor->fetch()){
                $users[]= User::of($row);
               }
               return   $users;

          } catch (\PDOException $ex) {
             print $ex->getMessage()."\n";
          }  
             return [];
      }
 }