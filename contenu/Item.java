package contenu;
public class Item{
	private int poids;
	private int prix;
	private String description;

	public Item(int pPoids, int pPrix, String pDes){
		this.poids = pPoids;
		this.prix = pPrix;
		this.description = pDes;
	}

	public Item(int pPoids, String pDes){
		this(pPoids, 0, pDes);
	}

	public Item(String pDes){
		this(0,0,pDes);
	}

	public String getDescription(){ return this.description; }
	public int getPoids(){ return this.poids; }
	public int getPrix(){ return this.prix; }
}