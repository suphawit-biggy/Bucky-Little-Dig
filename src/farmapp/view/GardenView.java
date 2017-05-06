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
		System.out.println("\n-- Select an action --");
		System.out.println("1> View Plants in Garden");
		System.out.println("2> Plant a plant");
		System.out.println("3> Sleep One day");
		System.out.print("Please select an action (1-3) >> ");
		int selected = scan.nextInt();
		switch (selected) {
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

	public void viewPlants() {
		List<Plant> plants = this.gardenController.getPlants();
		System.out.println("\n-- Your Garden Bed --");
		int index = 0;
		for(Plant plant : plants) {
			System.out.println(++index + "> " + plant.getName());
			System.out.println("\tAge> " + plant.getAge() + " days");
			System.out.println("\tStatus> " + plant.getState());
			System.out.println("\tDay until next status: " + plant.getDaysNextState());
		}
	}

	public void plantAPlant() {
		Plant plant = new PlantImpl(null, 0);
		System.out.println("\n-- Pick a plant --");
		int selected;
		do{
			System.out.println("Please select a seed (1-3) >> ");
			System.out.println("1.)Magenta Berry");
			System.out.println("2.)Chilli");
			System.out.println("3.)Alabaster Mushroom");
			selected = scan.nextInt();
			switch (selected) {
				case 1:
					plant = new PlantImpl("Magenta Berry", 0);
					break;
				case 2:
					plant = new PlantImpl("Chilli", 0);
					break;
				case 3:
					plant = new PlantImpl("Alabaster Mushroom", 0);
					break;
			}
		} while (selected <= 0 || selected > 3);
		gardenController.plantAPlant(plant);
	}

	public void sleep() {
		this.gardenController.sleep();
		System.out.println("\nA long hardworking day have past !!");
	}

}