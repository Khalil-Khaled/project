/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionproduit;
import java.time.LocalDate;

/**
 *
 * @author Khalil
 */
public class Produit {
    
    private int idProduit;
    private String libelleProduit;
    private String marqueProduit;
    private float prixProduit;
    private LocalDate dateExipration;

    public Produit() {
    }

    public Produit(int idProduit, String libelleProduit, String marqueProduit) {
        this.idProduit = idProduit;
        this.libelleProduit = libelleProduit;
        this.marqueProduit = marqueProduit;
    }
    
    public Produit(int idProduit, String libelleProduit, String marqueProduit, float prixProduit) {
        this.idProduit = idProduit;
        this.libelleProduit = libelleProduit;
        this.marqueProduit = marqueProduit;
        this.prixProduit = prixProduit;
    }
    
    public void afficher() {
        System.out.println("Détails du produit :");
        System.out.println("ID : "+idProduit);
        System.out.println("Libéllé : "+libelleProduit);
        System.out.println("Marque : "+marqueProduit);
        System.out.println("Prix : "+prixProduit);
        System.out.println("Date d'expriration : "+dateExipration);
        System.out.println("-------------------------------------");
    }

    @Override
    public String toString() {
        return "Produit{" + "idProduit=" + idProduit + ", libelleProduit=" + libelleProduit + ", marqueProduit=" + marqueProduit + ", prixProduit=" + prixProduit + ", dateExipration=" + dateExipration + '}';
    }

    

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public void setLibelleProduit(String libelleProduit) {
        this.libelleProduit = libelleProduit;
    }

    public void setMarqueProduit(String marqueProduit) {
        this.marqueProduit = marqueProduit;
    }

    public void setPrixProduit(float prixProduit) {
        if (prixProduit<0)
            System.out.println("Prix du produit doit etre positif. Réessayez.");
        else this.prixProduit=prixProduit;
    }

    public void setDateExipration(String dateExipration) {
        this.dateExipration = LocalDate.parse(dateExipration);
    }

    public int getIdProduit() {
        return idProduit;
    }

    public String getLibelleProduit() {
        return libelleProduit;
    }

    public String getMarqueProduit() {
        return marqueProduit;
    }

    public float getPrixProduit() {
        return prixProduit;
    }

    public LocalDate getDateExipration() {
        return dateExipration;
    }
    
    public boolean comparer(Produit p){
        return p.getIdProduit() == this.idProduit && this.libelleProduit.equalsIgnoreCase(p.getLibelleProduit()) && p.getPrixProduit()== this.prixProduit;
    }
    
    public static boolean comparer(Produit p1,Produit p2){
        return p1.getIdProduit()== p2.getIdProduit()&& p1.getLibelleProduit().equalsIgnoreCase(p2.getLibelleProduit())&& p1.getPrixProduit()== p2.getPrixProduit();
    }
    
    
}
