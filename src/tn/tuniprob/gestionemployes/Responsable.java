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
public class Responsable extends Employes {
    
    private float prime;

    public Responsable(int identifiant, String nom, String adresse) {
        super(identifiant, nom, adresse);
    }

    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return super.toString()+ " prime=" + prime ;
    }

    @Override
    public float calculerSalaire() {
        float salaire;
        int nbrHeure = super.getNbrHeures();
        salaire = (nbrHeure * 10)+ prime ;
        if (nbrHeure > 160) {
            salaire += (nbrHeure - 160) * 2;
        }
        return salaire ;
    }
    
}
