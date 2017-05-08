package farmapp.main;

import farmapp.controller.GardenController;

public class Game {

    public static void main(String[] args) {
    	System.out.print("Welcome to the gardening game! ");
        new GardenController().startGame();
    }

}
