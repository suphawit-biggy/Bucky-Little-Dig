package farmapp.controller;

import java.util.ArrayList;
import java.util.List;

import farmapp.entity.Plant;
import farmapp.entity.impl.GardenImpl;
import farmapp.view.GardenView;

public class GardenController {
	private GardenView prompt;
	private GardenImpl gardenImpl;

	public GardenController() {
		prompt = new GardenView(this);
	}

	public List<Plant> getPlants() {
		return this.gardenImpl.getPlants();
	}

	public void startGame() {
		do {
			prompt.promptMenu();
		}
		while (true);
	}

	public void plantAPlant(Plant plant) {
		this.gardenImpl.addPlant(plant);
	}

	public void sleep() {
		for(Plant plants : this.gardenImpl.getPlants()) {
			plants.grow();
		}
	}
}