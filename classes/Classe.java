package classes;

public class Classe{

	public static String nom;
	public static int argent;
	public static int force;
	public static int constitution;
	public static int dexterite;
	public static int sagesse;
	public static int intelligence;
	public static int charisme;

	public Classe(String pNom, int pArgent, int pForce, int pConstit, int pDext, int pSag, int pIntel, int pChar){
		this.nom = pNom;
		this.argent = pArgent;
		this.force = pForce;
		this.constitution = pConstit;
		this.dexterite = pDext;
		this.sagesse = pSag;
		this.intelligence = pIntel;
		this.charisme = pChar;
	}

	public int getArgent(){
		return this.argent;
	}
}