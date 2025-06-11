<?php 
require_once "../config/Validator.php";
  abstract class  Controller{
    protected Validator $validator;
    public function __construct()
     {
        $this->validator=new Validator();
     }
    protected abstract function handleRequest();
    protected function  render(string $path,array $data=[]){
        extract($data);
        require_once "../views/layout/header.html.php";
        require_once "../views/$path";
        require_once "../views/layout/footer.html.php";
    }
  }