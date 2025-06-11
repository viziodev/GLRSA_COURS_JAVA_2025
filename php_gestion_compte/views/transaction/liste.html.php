
<main>
   <style>
    .card-title small {
      font-size: 0.8rem;
    }
    .btn-supprimer {
      background-color: #dc3545;
      color: white;
    }
    .btn-modifier {
      background-color: #ffc107;
      color: black;
    }
    .text-green {
      color: green;
    }
    .text-red {
      color: red;
    }
    .badge-orange {
      background-color: orange;
      color: white;
    }
  </style>

<div class="container my-4">
  <div class="d-flex justify-content-between align-items-center mb-3">
    <h2>Détails du compte</h2>
    <?php if ($_SESSION['user']['role']=="ADMIN"):?> 
      <div>
        <a href="index.php?controller=transaction&action=form-transaction&id=<?php echo $compte->getId()?>" class="btn btn-dark">+ Nouvelle transaction</a>
      </div>
    <?php endif ?>
  </div>

  <div class="row mb-4">
      <div class="col-md-4">
        <div class="card shadow-sm p-3">
          <h6>Total des dépôts</h6>
          <h4 class="text-success">+<?php echo $statistiques['totalDepot']?>FCFA</h4>
        </div>
      </div>
      <div class="col-md-4">
        <div class="card shadow-sm p-3">
          <h6>Total des retraits</h6>
          <h4 class="text-danger">-<?php echo $statistiques['totalRetrait']?>FCFA</h4>
        </div>
      </div>
      <div class="col-md-4">
        <div class="card shadow-sm p-3">
          <h6>Nombre de transactions:</h6>
          <h4 class=""><?php echo $statistiques['nbreTransaction']?></h4>
        </div>
      </div>
    </div>

  <div class="row g-3">
    <!-- Informations du compte -->
    <?php    require_once "../views/transaction/partial/infos.compte.html.php";?>

    <!-- Historique des transactions -->
    <div class="col-md-8">
      <div class="card" style="height: 380px;">
        <div class="card-body">
          <h5 class="card-title">Historique des transactions</h5>
          <table class="table table-bordered table-hover">
            <thead class="table-light">
              <tr>
                <th>ID</th>
                <th>Date</th>
                <th>Type</th>
                <th>Montant</th>
                <th>Solde après</th>
       
              </tr>
            </thead>
            <tbody> 
            <?php foreach ($transactions as  $transaction):?>
                    <tr>
                        <td><?php echo $transaction->getId()?> </td>
                        <td><?php echo $transaction->getDateToString()?> </td>
                        <td><span class="badge <?php echo $transaction->bgTypeTransaction?>"><?php echo $transaction->getType()?> </span></td>
                        <td class="<?php echo $transaction->colorTextMontant?>"><?php echo $transaction->sensTransation?> <?php echo $transaction->getMontant()?> FCFA</td>
                        <td><?php echo $transaction->getSoldeAppres()?> FCFA</td>
                
                    </tr>
                <?php endforeach?>
            </tbody>
          </table>
          <nav >
            <ul class="pagination d-flex justify-content-center">
              <li class="page-item disabled"><a class="page-link" href="#">Précédent</a></li>
              <li class="page-item active"><a class="page-link" href="#">1</a></li>
              <li class="page-item"><a class="page-link" href="#">2</a></li>
              <li class="page-item"><a class="page-link" href="#">Suivant</a></li>
            </ul>
          </nav>
        </div>
      </div>
    </div>

    <!-- Statistiques -->
    
  </div>
</div>

</main>