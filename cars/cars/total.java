package cars.cars;

import cars.Car;
import cars.Truck;

public class total {
    public static void main(String[] args) {
        Car c = new Car(4,1150,3);
        System.out.println("车轮的个数是："+c.getWheels()+" 车重是："+c.getWeight());
        System.out.println("这是一辆小车，能载5人，"+"实载"+c.getLoader()+"人");
        System.out.println("-------------------------");
        Truck t = new Truck(6,15000,1,7000);
        System.out.println("车轮的个数是："+t.getWheels()+" 车重是："+t.getWeight());
        System.out.println("这是一辆卡车，能载3人，实载"+t.getLoader());
        if(t.getPayload()<5000)
            System.out.println("这是一辆卡车，核载5000kg，你已装载"+t.getPayload());
        else
            System.out.println("这是一辆卡车，核载5000kg，你已装载"+t.getPayload()+"，你超载了");
    }
}
