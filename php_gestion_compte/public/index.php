<?php






$controlleName=$_REQUEST["controller"]??'compte';//form-compte
switch ($controlleName) {
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
