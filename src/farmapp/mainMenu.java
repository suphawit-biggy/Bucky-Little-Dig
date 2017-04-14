package farmapp;


import farmapp.controller.PlantController;
import farmapp.model.Plant;
import farmapp.view.PlantView;

/**
 * Created by Biggy's Dell Laptop on 05-Apr-17.
 */
public class mainMenu {
    public static void main(String[] args) {
        Plant model = getPlantFromDB();
        PlantView view = new PlantView();
        PlantController controller = new PlantController(model, view);
    }

    public static Plant getPlantFromDB() {
        Plant plant = new Plant();
        return plant;
    }

    public void viewPlants() {

    }

    public void plantAPlant() {

    }

    public void waterPlant() {

    }

    public void harvestPlant() {

    }

    public void sleep() {

    }
}
