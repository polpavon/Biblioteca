# Biblioteca

Creem la nostra clase llibre, definim els atributs i definim 2 constructors, 1 buid i el altre amb tots els atributs
```java
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
```
Creem tots els setters i getters

```java
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
```
Creem les nostres funcions amb el que volem fer, en aquest cas sera per agafar prestecs i tornarlos
```java
    public void agafarEnPrestec(int quantitatPrestecs) {
    	if (this.prestec + 1 > this.exemplar) {
    		System.out.println("\n No hi ha mes exemplars disponibles \n");
    	} else {
    		this.prestec += quantitatPrestecs;
    	}
    }
    
	public void retornarDePrestec(int quantitatPrestecs) {
		if (this.prestec - 1 < 0) {
    		System.out.println("\n L'exemplar a tornar no es d'aquest llibre \n");
    	} else {
    		this.prestec -= quantitatPrestecs;
    	}	
	}
```
Creem el toString amb la informacio que volem retornar
```java
public String toString() {
        return "Llibre [autor=" + autor + ", exemplar=" + exemplar + ", prestec=" + prestec + ", titol=" + titol + "]";
    }
```
