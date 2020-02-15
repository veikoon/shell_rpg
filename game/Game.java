package game;
import classes.*;
import races.*;
import contenu.*;
import java.util.Scanner;
import java.util.HashMap;

public class Game{

	public HashMap<String, Place> places;
	public Player joueur;

	public void createPlace(){
		this.places = new HashMap<String, Place>();

		Place donjon = new Place("Le donjon de Zaraalbak");
		Place grotte = new Place("L'entrée du donjon de Zarallba est en fait une grotte");

		donjon.addDirection("Rentrer dans le donjon", grotte);
		donjon.addDirection("Faire demi-tour", grotte);

		places.put("Donjon", donjon);
		places.put("Grotte", grotte);

		this.joueur = new Player(20, 10, "Vincent", new Voleur(), new Orque(), 15, 15, 15, 15, 15, 15, donjon);
		this.joueur.getInventory().addItem("clé", new Item("ceci est une clé"));	

	}

	public void promptEnter(){
		Print.print("Appuie sur \"ENTER\" pour continuer...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}

	public Game() {

		this.createPlace();

		boolean done = true;
		Command cmd;
		while (done){
			Print.print("###################################################################");
			Print.print(joueur.getPlace().getDirections());
			Print.print("Veuillez entrer une commande :");
			Scanner input = new Scanner(System.in);
			String place = input.nextLine();
			cmd = new Command(place, this);
			cmd.executeCommand();

			this.promptEnter();


		}
		
	}

}