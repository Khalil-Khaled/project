/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionemployes;

/**
 *
 * @author Khalil
 */
public class Vendeur extends Employes {
    
    private float tauxDeVente;

    public Vendeur(int identifiant, String nom, String adresse) {
        super(identifiant, nom, adresse);
    }

    public float getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(float tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return super.toString() + " tauxDeVente=" + tauxDeVente;
    }

    @Override
    public float calculerSalaire() {
        return 450*tauxDeVente;
    }
    
}
