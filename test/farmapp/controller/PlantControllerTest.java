package farmapp.controller;

import farmapp.model.Plant;
import farmapp.view.PlantView;

/**
 * @author Suphawit Kasemsirisopha [572115056]
 *         on Apr 5, 2017
 */
public class PlantController {
    Plant plantModel;
    PlantView plantView;

    public PlantController(Plant plantModel, PlantView plantView) {
        this.plantModel = plantModel;
        this.plantView = plantView;
    }

    public void addPlant(Plant plant) {

    }

    public void updatePlant(Plant plant) {

    }

    public void deletePlant(int no) {

    }

    public void upAge(int no) {
    	
    }

    public void upHealth(int no) {

    }

    public void downHealth(int no) {

    }

    public void upWaterAll() {

    }

    public void upWaterById(int no) {

    }

    public void downWater(int no) {

    }
}
