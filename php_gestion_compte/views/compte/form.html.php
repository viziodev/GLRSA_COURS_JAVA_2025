
 <main class="bg-light d-flex justify-content-center align-items-center" style="height: 90vh;">
        
               <div class="container w-50 shadow p-3 mb-5 bg-body rounded">
                  <h5>Formulaire de Creation d'un Compte</h5>
                          <form action="index.php" method="post">
                            <input type="hidden" name="controller" value="compte">
                            <input type="hidden" name="action" value="save-compte">
                            <div >
                            <label for="" class="form-label">Titulaire</label>
                            <input
                                type="text"
                                class="form-control form-control-sm"
                                name="titulaire"
                                id=""
                                aria-describedby="helpId"
                                placeholder=""
                            />
                            <small id="helpId" class="form-text text-muted">Help text</small>
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
                            <small id="helpId" class="form-text text-muted">Help text</small>
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
      