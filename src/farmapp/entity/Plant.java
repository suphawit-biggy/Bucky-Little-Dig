package farmapp.entity;

public interface Plant {
	public String getName();
	public int getAge();
	public String getState();
	public int getDaysNextState();
    public void sleep();
    public void water();
    public int getWater();
    public int getWaterMax();
    public int getHealth();
    public int getHealthMax();
}
