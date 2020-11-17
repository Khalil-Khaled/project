import java.io.IOException;

class TempsException extends IOException {
	public TempsException(String msg) {
		super(msg);
	}
}
class Temps{

    private int heures, minutes, secondes ;

    Temps(int h, int m, int s) throws TempsException  {
     if(h>23 || h<0)
    	 throw new TempsException("Invalide hours value");
     else
	     heures=h ;
     if(m>59 || m<0)
    	 throw new TempsException("Invalide minutes value");
     else
	     minutes=m ;
     if(s>59 || s<0)
    	 throw new TempsException("Invalide seconds value");
     else
        secondes=s ;
  }

public static void main (String [] args) {
	try {
		Temps t=new Temps (24, -1, 67) ;
	    }
	catch(Exception e){
		System.out.println("Temps invalide: "+ e.getMessage());
		}
    }
  }

