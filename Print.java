import classes.Classe;
import races.Race;

public abstract class Print{

	public static void print(String text){
		System.out.println(text);
	}

	public static void playerInfo(Player player){
		print(player.getInfo());
	}

	public static void directionInfo(Place place){
		print(place.getDirections());
	}
}