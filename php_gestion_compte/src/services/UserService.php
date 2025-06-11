<?php 
require_once "../src/repository/UserRepository.php";
require_once "../src/models/User.php";
class UserService{
 private UserRepository $userRepository;
    public function __construct()
    {
     $this->userRepository =new UserRepository();
    }

    public function seConnecter(string  $login,string $password):User|null{
      return  $this->userRepository->selectByLoginAndPassword($login, $password);
    }

    public function getAllClients():array{
        return  $this->userRepository->selectUsersByRole();
    }
}