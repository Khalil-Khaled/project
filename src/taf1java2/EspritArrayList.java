package taf1java2;

import java.util.*;

public class EspritArrayList implements University {
    private ArrayList<Etudiant> List_Etudiant = new ArrayList<>();
    @Override
    public void ajouterEtudiant(Etudiant e) {
        List_Etudiant.add(e);
        System.out.println("[CONSOLE] Etudiant has been added to the ArrayList.");

    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return List_Etudiant.contains(e);

    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for(Etudiant e : List_Etudiant){
            if (e.getNom().equals(nom))
            return true;
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
       List_Etudiant.remove(e);
    }

    @Override
    public void displayEtudiants() {
        for(Etudiant e : List_Etudiant){
            System.out.println(e.toString());
        }
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(List_Etudiant, new TriParId());

    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(List_Etudiant, new TriParNom());
    }
    
}
