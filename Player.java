import classes.Classe;
import races.Race;

public class Player{
	private int argent;
	private int pv;
	private String nom;
	private Classe classe;
	private Race race;
	private int force;
	private int constitution;
	private int dexterite;
	private int sagesse;
	private int intelligence;
	private int charisme;
	private ItemList inventaire;

	public Player(int pArgent, int pPv, String pNom, Classe pClasse, Race pRace, int pForce, int pConstit, int pDext, int pSag, int pIntel, int pChar){
		this.classe = pClasse;
		this.race = pRace;
		this.argent = pArgent + this.classe.getArgent();
		this.pv = pPv;
		this.nom = pNom;
		this.force = pForce;
		this.constitution = pConstit;
		this.dexterite = pDext;
		this.sagesse = pSag;
		this.intelligence = pIntel;
		this.charisme = pChar;
		this.inventaire = new ItemList();
		this.setBonus();
	}

	public void setBonus(){
		if(this.constitution > 15) this.pv += this.constitution - 15;
	}

	public int getPoidsMax(){ return (this.force * 100);}

	public String getName(){ return (this.nom); }

	public int getPv(){ return this.pv; }

	public int getArgent(){ return this.argent; }

	public Race getRace(){ return this.race; }

	public Classe getClasse(){ return this.classe; }

	public int[] getStats(){ return new int[] {this.force, this.constitution, this.dexterite, this.sagesse, this.intelligence, this.charisme}; }

	public ItemList getInventory(){ return this.inventaire; }

	public String getInfo(){
		String tempString = "";
		int[] stats = this.getStats();
		tempString += "\n" + this.getName() + "  (" + this.getClasse().nom + "," + this.getRace().nom + ")\n";
		tempString += ("\nStats :\n");
		tempString += ("Force: 		  " + stats[0] + "\n");
		tempString += ("Constitution: 	  " + stats[1] + "\n");
		tempString += ("Dexterite:	  " + stats[2] + "\n");
		tempString += ("Sagesse:	  " + stats[3] + "\n");
		tempString += ("Intelligence: 	  " + stats[4] + "\n");
		tempString += ("Charisme: 	  " + stats[5] +"\n");
		tempString += ("\nArgent: " + this.getArgent() + " po\n");
		tempString += "\n" + this.inventaire.getItemsString();
		return tempString;
	}

}