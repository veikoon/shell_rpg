package contenu;
import java.util.HashMap;
import java.util.Set;

public class Place{
	private String description;
	private HashMap<String, Place> direction;
	private ItemList inventaire;

	public Place(String pDescription){
		this.description = pDescription;
		this.direction = new HashMap<String, Place>();
	}

	public void addDirection(String direction, Place lieu){	this.direction.put(direction, lieu); }

	public void removeDirection(String direction){	this.direction.remove(direction); }

	public boolean containsKey(String direction){ return this.direction.containsKey(direction); }
    
    public boolean containsValue(Place lieu){ return this.direction.containsValue(lieu); }

	public String getDirections(){
        String vList = "Directions possibles:\n";
        Set<String> keys = this.direction.keySet();
        for(String vItem : keys){
            vList += vItem+" ";
        }
        return vList;
    }

    public Place getDirectionPlace(String place){
    	return this.direction.get(place);
    }

	public ItemList getInventory(){ return this.inventaire; }
}