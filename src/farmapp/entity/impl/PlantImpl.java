package farmapp.entity.impl;

import farmapp.entity.Plant;

public class PlantImpl implements Plant {

    private String name;
    private int age = 0;
    private String[] state = {"Seed", "Seedling", "Mature", "Sprouting", "HarvestReady"};
    private int daysNextState;

    public PlantImpl(String name, int daysNextState) {
        this.name = name;
        this.daysNextState = daysNextState;
    }

    public void grow() {
        this.age++;
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
}
