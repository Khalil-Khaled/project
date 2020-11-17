package taf1java2;

import java.util.Comparator;

public class TriParId implements Comparator<Etudiant> {

    @Override
    public int compare(Etudiant e1, Etudiant e2) {
        if (e1.getId() == e2.getId())
            return 0;
        else if(e1.getId() > e2.getId())
            return 1;
        else
            return -1;
    }
    

}