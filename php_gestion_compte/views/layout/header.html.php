<!doctype html>
<html lang="en">
    <head>
        <title>Title</title>
        <!-- Required meta tags -->
        <meta charset="utf-8" />
        <meta
            name="viewport"
            content="width=device-width, initial-scale=1, shrink-to-fit=no"
        />

        <!-- Bootstrap CSS v5.2.1 -->
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
            crossorigin="anonymous"
        />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    </head>

    <body>
        <header>
                  <nav class="navbar navbar-expand-sm navbar-light bg-dark">
                      <div class="container-fluid">
                          <a class="navbar-brand text-white" href="#">Gestion Compte</a>
                          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarID"
                              aria-controls="navbarID" aria-expanded="false" aria-label="Toggle navigation">
                              <span class="navbar-toggler-icon"></span>
                          </button>
                          <div class="collapse navbar-collapse" id="navbarID">
                              <div class="navbar-nav">
                                  <a class="nav-link active text-white" aria-current="page" href="index.php?controller=compte&action=list-compte">Comptes</a>
                                  
                              </div>
                          </div>
                          <ul class="navbar-nav ms-auto">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle text-white" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown">
                            <i class="fas fa-user-circle"></i> <?php echo   $_SESSION['user']['nomComplet'];?>
                        </a>
                        <ul class="dropdown-menu dropdown-menu-end">
                            <li><a class="dropdown-item" href="#"><?php echo $_SESSION['user']['role'];?></a></li>
                            <li><a class="dropdown-item" href="#">Paramètres</a></li>
                            <li><hr class="dropdown-divider"></li>
                            <li><a class="dropdown-item" href="index.php?controller=user&action=logout">Déconnexion</a></li>
                        </ul>
                
               
                      </div>
                  </nav>
</header>