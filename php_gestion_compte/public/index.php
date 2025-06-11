<?php
if (session_status()==PHP_SESSION_NONE) {
       session_start();
}






$controlleName=$_REQUEST["controller"]??'user';//form-compte
switch ($controlleName) {
    case 'user':
        require_once "../src/controllers/UserController.php";
        $controller=new UserController();
     break;
 case 'compte':
    require_once "../src/controllers/CompteController.php";
    $controller=new CompteController();
 break;
case 'transaction':
    require_once "../src/controllers/TransactionController.php";
    $controller=new TransactionController();

default:
 # code...
 break;
}

?>
