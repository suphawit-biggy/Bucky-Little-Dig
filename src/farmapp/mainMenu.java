package farmapp;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import farmapp.controller.PlantController;
import farmapp.model.Plant;
import farmapp.view.PlantView;

/**
 * Created by Biggy's Dell Laptop on 05-Apr-17.
 */
public class mainMenu {
    public static void main(String[] args) {
        Plant model = getPlants();
        PlantView view = new PlantView();
        PlantController controller = new PlantController(model, view);
        int menuState = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("--Select an action--");
        System.out.println("1.View Plants in Garden");
        System.out.println("2.Plant a plant");
        System.out.println("3.Sleep One day");
        menuState = scan.nextInt();
        switch (menuState) {
            case 1:
            	viewPlants();
                break;
            case 2:
            	plantAPlant();
                break;
            case 3:
            	sleep();
                break;

        }
    }
    
    public static Plant getPlants() {
        List<Plant> plants = new ArrayList<Plant>();
        return (Plant) plants;
    }

    public static void viewPlants() {

    }

    public static void plantAPlant() {

    }

    public static void waterPlant() {

    }

    public static void harvestPlant() {

    }

    public static void sleep() {
    	
    }
}
