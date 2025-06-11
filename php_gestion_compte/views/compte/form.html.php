
 <main class="bg-light d-flex justify-content-center align-items-center" style="height: 90vh;">
        
               <div class="container w-50 shadow p-3 mb-5 bg-body rounded">
                  <h5>Formulaire de Creation d'un Compte</h5>
                          <form action="index.php" method="post">
                            <input type="hidden" name="controller" value="compte">
                            <input type="hidden" name="action" value="save-compte">
                              <div class="mb-3">
                                <label for="" class="form-label">Titulaire</label>
                                <select
                                    class="form-select form-select-md"
                                    name="titulaire"
                                    id=""
                                >
                                    <option  value="">Selectionnez un Titulaire</option>
                                    <?php foreach ($clients as  $client): ?>
                                        <option value="<?php echo $client->getId()?>"><?php echo $client->getNomComplet()?></option>
                                    <?php endforeach ?>
                                </select>
                                  <small id="password" class="form-text text-danger"><?php echo $_SESSION['errors']['titulaire']??''?></small>
                              </div>
                              
                            <div >
                            <label for="" class="form-label">Solde</label>
                            <input
                                type="number"
                                class="form-control form-control-sm"
                                name="solde"
                                id=""
                                aria-describedby="helpId"
                                placeholder=""
                            />
                               <small id="password" class="form-text text-danger"><?php echo $_SESSION['errors']['solde']??''?></small>
                                                        </div>
                            <div class="float-end">
                                            <button
                                                            type="submit"
                                                            class="btn btn-dark"
                                                        >
                                                            Creer Compte
                                                        </button>
                                </div>
                           
                            
                        </form>

      </div>
                   
                

        </main>
      