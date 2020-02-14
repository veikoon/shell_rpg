import java.util.HashMap;
import java.util.Set;

public class ItemList{
	private HashMap<String, Item> itemList;

	public ItemList(){
		itemList = new HashMap<String, Item>();
	}


    public Item getItem(final String pName){
        return this.itemList.get(pName);
    }

    public String getItemsString(){
        String vList = "Inventaire :\n";
        Set<String> keys = this.itemList.keySet();
        for(String vItem : keys){
            vList += vItem+" ";
        }
        return vList;
    }

    public void addItem(final String pName, final Item pItem){
        this.itemList.put(pName, pItem);
    }

    public void removeItem(final String pName){
        this.itemList.remove(pName);
    }

    public int getTotalWeight(){
        int vWeight = 0;
        Set<String> keys = this.itemList.keySet();
        for(String item : keys){
            vWeight = vWeight+this.itemList.get(item).getPoids();
        }
        return vWeight;
    }

    public boolean containsKey(final String pName){
        return this.itemList.containsKey(pName);
    }
    
    public boolean containsValue(final Item pName){
        return this.itemList.containsValue(pName);
    }


    public boolean isEmpty(){
      return this.itemList.isEmpty();
    }

    public HashMap<String, Item> getItemList(){
        return this.itemList;
    }
}