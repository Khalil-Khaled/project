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
public class Caissier extends Employes {
    
    private int numeroDeCaisse;

    public Caissier(int identifiant, String nom, String adresse, int numeroDeCaisse) {
        super(identifiant, nom, adresse);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public String toString() {
        return (super.toString()+ " numeroDeCaisse=" + numeroDeCaisse );
    }

    @Override
    public float calculerSalaire() {
        float salaire;
        float nbrHeure = super.getNbrHeures();
        salaire = nbrHeure*5;
        if (nbrHeure>180)
        {
            salaire += (nbrHeure-180)*0.75;
        }
        return salaire;
    }
    
    
    
}
