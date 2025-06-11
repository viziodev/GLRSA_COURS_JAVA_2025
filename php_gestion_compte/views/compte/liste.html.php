
        <main class="bg-light mt-1" style="height: 90vh;">
          <div class="container shadow p-3 mb-2 bg-body rounded mt-2">
                    <form action="index.php" method="get" >
                            <input type="hidden" name="page" value="list-compte">
                                <div class="d-flex gap-2">
                                <label for="" class="form-label col-1">Titulaire</label>
                                <input
                                    type="text"
                                    class=" form-control form-control-sm w-50"
                                    name="titulaire"
                                    id=""
                                    aria-describedby="helpId"
                                    placeholder=""
                                />
                                <button
                                type="submit"
                                class="btn btn-dark"
                                >
                                  Rechercher
                               </button>
                                </div>
                   </form> 
           </div>
             <div class="container shadow p-3 mb-5 bg-body rounded">
                    <?php if ($_SESSION['user']['role']=="ADMIN"):?> 
                           <div class="d-flex  justify-content-end  my-2">
                            <a
                                name=""
                                id=""
                                class="btn btn-outline-dark"
                                href=" index.php?controller=compte&action=form-compte"
                                role="button"
                                >Nouveau</a
                            >
                           </div>
                      <?php endif ?>
                           
                          <div
                            class="table-responsive"
                          >
                            <table
                                class="table table-light table-striped table-hover table-bordered"
                            >
                                <thead>
                                    <tr>
                                        <th scope="col">Numero</th>
                                        <th scope="col">Titulaire</th>
                                        <th scope="col">DateCreation</th>
                                        <th scope="col">Solde</th>
                                        <th scope="col">Actions</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <?php foreach ($comptes as  $value):?>
                                            <tr class="">
                                                <td scope="row"><?=$value->getNumero()?></td>
                                                <td><?=$value->getTitulaire()?></td>
                                                <td><?=$value->getDateToString()?></td>
                                                <td><?=$value->getSolde()?></td>
                                                <td>
                                                    <a
                                                        name=""
                                                        id=""
                                                        class="btn btn-outline-dark"
                                                        href="index.php?controller=transaction&action=list-transaction&id=<?=$value->getId()?>"
                                                        role="button"
                                                        >
                                                        <i class="fa fa-eye"> </i>
                                                        Transactions</a
                                                    >
                                                    
                                                </td>
                                            </tr>
                                  <?php endforeach?>
                                    
                                </tbody>
                            </table>
                          </div>
                          
                    </div>
                   
            
                

        </main>
       