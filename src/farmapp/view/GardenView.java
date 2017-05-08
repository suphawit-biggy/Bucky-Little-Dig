package farmapp.view;

import java.util.List;
import java.util.Scanner;

import farmapp.controller.GardenController;
import farmapp.entity.Plant;
import farmapp.entity.impl.PlantImpl;

public class GardenView {

	private GardenController gardenController;
	private Scanner scan = new Scanner(System.in);

	public GardenView(GardenController gardenController) {
		this.gardenController = gardenController;
	}

	public void promptMenu() {
		System.out.println("\nPlease choose an action");
		System.out.println("(1)\tView Plants");
		System.out.println("(2)\tPlant seed");
		System.out.println("(3)\tWater Plant");
		System.out.println("(4)\tSleep 1 day");
		System.out.print(": ");
		int selected = scan.nextInt();
		switch (selected) {
			case 1:
				viewPlants();
				break;
			case 2:
				plantAPlant();
				break;
			case 3:
				waterPlant();
				break;
			case 4:
				sleep();
				break;
		}
	}

	public void viewPlants() {
		List<Plant> plants = this.gardenController.getPlants();
		System.out.println("\nViewing Plants");
		int index = 0;
		for(Plant plant : plants) {
			System.out.println(++index + ": " + plant.getName());
			System.out.println("\tAge: [seed | seedling | mature | dead] (" + plant.getAge() + "/" + plant.getDaysNextState()*5 + " Days)");
			System.out.println("\tStatus: " + plant.getState()); 
			System.out.println("\tHealth: " + plant.getHealth() + "/" + plant.getHealthMax());
			System.out.println("\tWater: " + plant.getWater() + "/" +plant.getWaterMax());
		}
	}

	public void plantAPlant() {
		Plant plant = new PlantImpl(null, 0, 0, 0);
		System.out.println("\nSelect a seed to plant");
		int selected;
		do{
			System.out.println("1: Magenta Berry");
			System.out.println("2: Chilli");
			System.out.println("3: Alabaster Mushroom");
			System.out.print(": ");
			selected = scan.nextInt();
			switch (selected) {
				case 1:
					plant = new PlantImpl("Magenta Berry", 3, 9, 5);
					break;
				case 2:
					plant = new PlantImpl("Chilli", 4, 12, 6);
					break;
				case 3:
					plant = new PlantImpl("Alabaster Mushroom", 5, 15, 9);
					break;
			}
		} while (selected <= 0 || selected > 3);
		gardenController.plantAPlant(plant);
	}
	
	public void waterPlant() {
		List<Plant> plants = this.gardenController.getPlants();
		System.out.println("Select a plant to water: ");
		int index = 0;
		for(Plant plant : plants) {
			System.out.print(++index + ". " + plant.getName() + ": ");
			System.out.print("\tWater> ");
			for(int i=0;i<plant.getWater();i++){
				System.out.print("<3 ");
			}
			System.out.println("(" + plant.getWater() + "/" + plant.getWaterMax() + ")");
		}
	}

	public void sleep() {
		System.out.println("Goodnight.");
		this.gardenController.sleep();
	}

}