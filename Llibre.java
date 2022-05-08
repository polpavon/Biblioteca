
public class Llibre {
    private String titol, autor;
    private int exemplar, prestec;
    
    public Llibre() {
    	
    }

    public Llibre(String titolRebut, String autorRebut, int numExemplars, int numPrestecs) {
    	
    	
    	titol = titolRebut;
        autor = autorRebut;
        if(exemplar < 0) {
        	numExemplars = 0;
        } else {
        	numExemplars = exemplar;
        }
        if(exemplar < 0) {
        	numPrestecs = 0;
        } else {
        	numPrestecs = prestec;
        }
    }
    
  //GETTER
    public String getTitol() {
        return this.titol;
    }
 
    public String getAutor() {
        return this.autor;
    }
    
    public int getExemplar() {
    	return this.exemplar;
    }
    
    public int getPrestec() {
    	return this.prestec;
    }

    //SETTER
    public void setTitol(String titolRebut) {
        this.titol = titolRebut;
    }
 
    public void setAutor(String autorRebut) {
        this.autor = autorRebut;
    }
    
    public void setExemplars(int numExemplars) {
        this.exemplar = numExemplars;
    }
    
    public void setPrestecs(int numPrestecs) {
        this.prestec = numPrestecs;
    }
    
    public void agafarEnPrestec(int quantitatPrestecs) {
    	if (this.prestec + 1 > this.exemplar) {
    		System.out.println("\n No hi ha m�s exemplars disponibles \n");
    	} else {
    		this.prestec += quantitatPrestecs;
    	}
    }
    
	public void retornarDePrestec(int quantitatPrestecs) {
		if (this.prestec - 1 < 0) {
    		System.out.println("\n L'exemplar a tornar no �s d'aquest llibre \n");
    	} else {
    		this.prestec -= quantitatPrestecs;
    	}	
	}

    @Override
    public String toString() {
        return "Llibre [autor=" + autor + ", exemplar=" + exemplar + ", prestec=" + prestec + ", titol=" + titol + "]";
    }
}
