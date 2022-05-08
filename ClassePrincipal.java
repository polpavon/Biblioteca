import java.util.*;
public class ClassePrincipal {

	public static Scanner teclatText = new Scanner(System.in);
	public static Scanner teclatNum = new Scanner(System.in);
	
	public static void altaLlibre(String titolObj, Llibre objLlibre, String titolLlibre, String autorLlibre, int exemplarsLlibre) {
		
		System.out.println("DADES PER L'" + titolObj.toUpperCase());
		
		System.out.println("Entra el titol del llibre que vols donar d'alta");
		titolLlibre = teclatText.nextLine(); 
		
		System.out.println("Entra l'autor del llibre que vols donar d'alta");
		autorLlibre = teclatText.nextLine(); 
		
		System.out.println("Entra el numero d'exemplars del llibre que vols donar d'alta");
		exemplarsLlibre = teclatNum.nextInt();
		
		objLlibre.setTitol(titolLlibre);
		objLlibre.setAutor(autorLlibre);
		objLlibre.setExemplars(exemplarsLlibre);
	}
	
	public static void agafarEnPrestec(Llibre[] objArrLlibre, String nom) {
		for (int i = 0; i < objArrLlibre.length; i++) {
			if (objArrLlibre[i].getTitol().equals(nom) ) {
				objArrLlibre[i].agafarEnPrestec(1);
			}
		}
	}
	
	public static void retornarDePrestec(Llibre[] objArrLlibre, String nom) {
		for (int i = 0; i < objArrLlibre.length; i++) {
			if (objArrLlibre[i].getTitol().equals(nom) ) {
				objArrLlibre[i].retornarDePrestec(1);
			}
		}	
	}
	
	public static void mostrarObjecte(Llibre[] objArrLlibre) {
		for (int i = 0; i < objArrLlibre.length; i++) {
			System.out.println("Titol llibre: " + objArrLlibre[i].getTitol() + "\n Autor llibre: " + objArrLlibre[i].getAutor() + 
					"\n Num exemplars: " + objArrLlibre[i].getExemplar() + "\n Llibres en prestec: " + objArrLlibre[i].getPrestec());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean sortir = false;
		int numLlibres;
		String titolLlibre = "", autorLlibre = "";
		int exemplarsLlibre = 0;
		
		System.out.println("Introdueix el número de llibres que vols crear");
		numLlibres = teclatNum.nextInt();
		
		Llibre[] objArrLlibre = new Llibre[numLlibres];
		for (int i = 0; i < objArrLlibre.length; i++) {
			objArrLlibre[i] = new Llibre(titolLlibre, autorLlibre, exemplarsLlibre, 0);
			altaLlibre("OBJECTE " + (i+1), objArrLlibre[i], titolLlibre, autorLlibre, exemplarsLlibre);
		}
		
		while (sortir == false ) {
			String accio;
			String nomLlibre;
			do {
				mostrarObjecte(objArrLlibre);
				
				System.out.println("Vols agafar un llibre en prestec (prestec), retornar-lo (tornar) o acabar el programa(fi)?");
				accio = teclatText.nextLine();
				
			} while(!(accio.equals("prestec")) && !(accio.equals("tornar")) && !(accio.equals("fi")));
			
			if (accio.equals("fi")) {
				break;
			} else if (accio.equals("prestec")) {
				System.out.println("Quin es el nom del llibre el qual vols agafar en prestec?");
				nomLlibre = teclatText.nextLine();
				agafarEnPrestec(objArrLlibre, nomLlibre);
			} else {
				System.out.println("Quin es el nom del llibre el qual vols retornar?");
				nomLlibre = teclatText.nextLine();
				retornarDePrestec(objArrLlibre, nomLlibre);
			}
			
		}
		
		
	}

}
