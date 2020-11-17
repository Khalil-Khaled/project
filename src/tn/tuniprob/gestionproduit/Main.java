/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionproduit;

import tn.tuniprob.gestionemployes.Caissier;
import tn.tuniprob.gestionemployes.Employes;
import tn.tuniprob.gestionemployes.Responsable;
import tn.tuniprob.gestionemployes.Vendeur;

import tn.tuniprob.gestionmagasin.Magasin;

/**
 *
 * @author Khalil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produit p1 = new Produit ();
        Produit p2 = new Produit (1021,"Lait","Delice");
        Produit p3 = new Produit (2510,"Yaourt","Vitalait");
        Produit p4 = new Produit (3250,"Tomate","Sicam",1.200f);
        Produit p5 = new Produit (3250,"Tomate","Sicam",1.200f);
        
        p1.afficher();
        p2.afficher();
        p3.afficher();
        p4.afficher();
        
        
        p2.setPrixProduit(0.700f);
        p2.afficher();
        
        p1.setIdProduit(1000);
        p1.setLibelleProduit("Eau");
        p1.setMarqueProduit("Safia");
        p1.setPrixProduit(0.500f);
        
        p3.setPrixProduit(0.550f);
        
        p1.afficher();
        p2.afficher();
        p3.afficher();
        p4.afficher();
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        p1.setDateExipration("2022-09-05");
        p2.setDateExipration("2020-11-25");
        p3.setDateExipration("2020-12-17");
        p4.setDateExipration("2023-01-31");
        
        p1.afficher();
        p2.afficher();
        p3.afficher();
        p4.afficher();
        
        System.out.println("----------------------------");
        
//        Question 1
        
        Magasin m1= new Magasin("Carrefour","Centre-Ville",20);
        Magasin m2= new Magasin("Monoprix","Menzah 6",20);
        
//        Question 2
        
        Employes cm11 = new Caissier (1,"Mohamed","Mourouj",1);
        Employes cm12 = new Caissier (2,"Salah","Mourouj",2);
        Employes rm1 = new Responsable (3,"Khaled","Bardo");
        Employes vm1 = new Vendeur (4,"Ahmed","Bardo");
        
        Employes cm2 = new Caissier (1,"Firas","Manzah 1",1);
        Employes vm21 = new Vendeur (2,"Mohamed","Manzah 9");
        Employes vm22 = new Vendeur (3,"Ahmed","Manzah 6");
        Employes vm23 = new Vendeur (4,"Khalil","Manar 2");
        Employes rm2 = new Responsable (5,"Mostfa","Ariana");
        
//        Question 3
        
        System.out.println(cm11.toString());
        System.out.println(cm12.toString());
        System.out.println(rm1.toString());
        System.out.println(vm1.toString());
        
        System.out.println(cm2.toString());
        System.out.println(vm21.toString());
        System.out.println(vm22.toString());
        System.out.println(vm23.toString());
        System.out.println(rm2.toString());
        
//        Question 4
        
        m1.ajouterProduit(p1);
        m1.ajouterProduit(p2);
        m1.ajouterProduit(p3);
        m1.ajouterProduit(p4);
        
        m2.ajouterProduit(p1);
        m2.ajouterProduit(p2);
        m2.ajouterProduit(p3);
        m2.ajouterProduit(p4);

//        Question 5
        
        m1.ajouterEmploye(cm11);
        m1.ajouterEmploye(cm12);
        m1.ajouterEmploye(rm1);
        m1.ajouterEmploye(vm1);
        
        m2.ajouterEmploye(cm2);
        m2.ajouterEmploye(vm21);
        m2.ajouterEmploye(vm22);
        m2.ajouterEmploye(vm23);
        m2.ajouterEmploye(rm2);
        
        
        
        m1.afficherDetails();
        m2.afficherDetails();
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
}
