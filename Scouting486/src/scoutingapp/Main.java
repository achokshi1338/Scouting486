package scoutingapp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainMenu mainMenu = new MainMenu();
		Game game = new Game();
		game.createNewPointType("high goal", 5, "autonomous");
		System.out.println(game.pointTypes);
	}
}