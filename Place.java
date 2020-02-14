import java.util.List;
import java.util.ArrayList;

public class Place{
	private String nom;
	private String description;
	private List<String> direction;
	private ItemList inventaire;

	public Place(String pNom, String pDescription){
		this.nom = pNom;
		this.description = pDescription;
		this.direction = new ArrayList<String>();
	}

	public void addDirection(String direction){	this.direction.add(direction); }

	public String getDirections(){ return this.direction.toString(); }

	public ItemList getInventaire(){ return this.inventaire; }
}