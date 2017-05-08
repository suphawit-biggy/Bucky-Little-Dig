package farmapp.entity.impl;

import farmapp.entity.Plant;

public class PlantImpl implements Plant {

    private String name;
    private int age = 0;
    private String[] state = {"Seed", "Seedling", "Mature", "Dead"};
    private int daysNextState;
    private int water = 0;
    private int waterMax = 0;
    private int health = 0;
    private int healthMax = 0;

    public PlantImpl(String name, int daysNextState, int waterMax, int healthMax) {
        this.name = name;
        this.daysNextState = daysNextState;
        this.waterMax = waterMax;
        this.water = waterMax/2;
        this.healthMax = healthMax;
        this.health = healthMax/2;
    }

    public void sleep() {
        this.age++;
        this.water--;
        if (this.water/3 > 1 && this.health < this.healthMax) {
        	this.health++;
        } else {
        	this.health--;
        }
    }
    
    public void water() {
    	this.water = this.waterMax;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public String getState() {
        int calc = this.age / this.daysNextState;
        if(calc > state.length) {
            calc = state.length - 1;
        }
        return this.state[calc];
    }

    public int getDaysNextState() {
        int calc = this.daysNextState - (this.age % this.daysNextState);
        if(age > (this.daysNextState* this.state.length)) {
            daysNextState = 0;
        }
        return daysNextState;
    }
    
    public int getWater() {
    	return water;
    }
    
    public int getWaterMax() {
    	return waterMax;
    }
    
    public int getHealth() {
    	return health;
    }
    
    public int getHealthMax() {
    	return healthMax;
    }
}
