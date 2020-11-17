/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;
import tn.tuniprob.gestionemployes.Employes;
import tn.tuniprob.gestionproduit.Produit;
/**
 *
 * @author Khalil
 */
public class Magasin {
    private String id ;
    private String adresse ;
    private int capacite ;
    private Produit[] tabProduits = new Produit[50];
    private int nbProduit = 0;
    private Employes [] listeEmployes = new Employes [20];
    private int nbEmployes;

    public Magasin() {
    }

    public Magasin(String id, String adresse, int capacite) {
        this.id = id;
        this.adresse = adresse;
        this.capacite = capacite;
    }
    
    public void ajouterProduit(Produit p){
        if (trouverProduit(p)== false) {
            tabProduits[nbProduit] = p ;
            nbProduit++;
        }
        else System.out.println("Le produit existe deja");
    }
    
    public void afficherDetails(){
        System.out.println("Les caractéristiques du magasin : ");
        System.out.println(id+", "+", "+adresse+", "+capacite+", ");
        System.out.println("La liste des produits dans ce magasin :");
        for (int i=0; i<nbProduit; i++) {
            System.out.println(tabProduits[i]);
        }
        System.out.println("La liste des employes dans ce magasin :");
        for (int j=0; j<nbEmployes;j++) {
            System.out.println(listeEmployes[j]);
        }
    }

    public int getNbproduit() {
        return nbProduit;
    }
    
    public boolean trouverProduit (Produit p) {
        for (int i = 0; i < nbProduit; i++) {
            if (p.comparer(tabProduits[i])) {
                return true;
            }
        }
        return false;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNbEmployes() {
        return nbEmployes;
    }
    
    
    
    public void comparerNbProduits (Magasin m1, Magasin m2) {
        if (m1.nbProduit > m2.nbProduit) {
            System.out.println("Le Magasin"+m1.getAdresse()+" a plus de produits que "+m2.getAdresse());
        }
        else 
            System.out.println("Le Magasin"+m2.getAdresse()+" a plus de produits que "+m1.getAdresse());
    }
    
    public void ajouterEmploye(Employes e) {
        listeEmployes[nbEmployes]= e;
        nbEmployes++;
    }
    
    
}

