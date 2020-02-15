package game;
import java.util.List;

public class Command{

	private String[] commandes;
	private Game game;

	public Command(String pCom, Game pGame){
		this.commandes = pCom.split(" ");
		this.game = pGame;
	}

	public void executeCommand(){;
		switch(commandes[0]){
			case "info":
				Print.print(this.game.joueur.getInfo());
				break;
			case "help":
				Print.print("go, info, list");
				break;
			default:
				Print.print("Veuillez entrer une commande valable.\nTapez help pour obtenir la liste des commandes valables.");
		}

	}
}