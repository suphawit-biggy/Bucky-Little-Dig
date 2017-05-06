package farmapp.entity.impl;

import farmapp.entity.Plant;

import java.util.ArrayList;
import java.util.List;

public class GardenImpl {

    private List<Plant> plants = new ArrayList<Plant>();

	public List<Plant> getPlants() {
        return this.plants;
    }

    public void addPlant(Plant plant) {
            this.plants.add(plant);
    }

    public boolean removePlant(Plant plant) {
    	return this.plants.remove(plant);
    }

}
