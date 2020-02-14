import classes.*;
import races.*;

public class Main{

	public static void main(String[] args) {

		Player joueur = new Player(20, 10, "Vincent", new Voleur(), new Orque(), 15, 15, 15, 15, 15, 15);
		joueur.getInventory().addItem("clé", new Item("ceci est une clé"));	
		Print.playerInfo(joueur);
		Place donjon = new Place("Donjon", "Le donjon de Zaraalbak");
		donjon.addDirection("Rentrer dans le donjon");
		donjon.addDirection("Faire demi-tour");
		Print.directionInfo(donjon);
		}
}