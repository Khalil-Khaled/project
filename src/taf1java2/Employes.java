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
public abstract class Employes {
    
    private int identifiant;
    private String nom;
    private String adresse;
    private int nbrHeures;

    public Employes(int identifiant, String nom, String adresse) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNbrHeures() {
        return nbrHeures;
    }

    public void setNbrHeures(int nbr_heures) {
        this.nbrHeures = nbr_heures;
    }

    @Override
    public String toString() {
        return "Employe : " + "identifiant=" + identifiant + ", nom=" + nom + ", adresse=" + adresse + ", nbr_heures=" + nbrHeures ;
    }
    
    public abstract float calculerSalaire();
    
}
