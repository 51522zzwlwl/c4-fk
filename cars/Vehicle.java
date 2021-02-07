package cars;

public class Vehicle {
    private int wheels;
    private double weight;
    public int getWheels()
    {
        return wheels;
    }
    public void setWheels(int wheels)
    {
        this.wheels = wheels;
    }
    public double getWeight()
    {
        return weight;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public Vehicle(int wheels,double weight)
    {
        super();
        this.wheels = wheels;
        this.weight = weight;
    }
}
