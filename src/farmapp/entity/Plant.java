package farmapp.entity;

public interface Plant {
	public String getName();
	public int getAge();
	public String getState();
	public int getDaysNextState();
    public void grow();
}
