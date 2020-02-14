package races;

public class Race{

	public static String nom;
	public static int force;
	public static int constitution;
	public static int dexterite;
	public static int sagesse;
	public static int intelligence;
	public static int charisme;

	public Race(String pNom, int pForce, int pConstit, int pDext, int pSag, int pIntel, int pChar){
		this.nom = pNom;
		this.force = pForce;
		this.constitution = pConstit;
		this.dexterite = pDext;
		this.sagesse = pSag;
		this.intelligence = pIntel;
		this.charisme = pChar;
	}

	public String getName(){
		return (this.nom);
	}
}
