public class App {
    public static void main(String[] args) {
        Etudiant e = new Etudiant();
            e.setId(0);
            e.setNom("R");
            e.setPrenom("R");

        Etudiant e1 = new Etudiant(0, "A", "A");

        System.out.println(e.toString()+" = "+e1.toString()+" : "+e.equals(e1));
        e1.setId(1);
        System.out.println(e.toString()+" = "+e1.toString()+" : "+e.equals(e1));
  
    }
}
