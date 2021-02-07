package cars;

public class Truck extends Car{
    private double payload;
    public double getPayload()
    {
        return payload;
    }
    public void setPayload(double payload)
    {
        this.payload = payload;
    }
    public Truck(int wheels,double weights,int loader,double payload)
    {
        super(wheels,weights,loader);
        this.payload = payload;
    }
}
