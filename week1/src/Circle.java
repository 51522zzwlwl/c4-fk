import java.util.Scanner;
import java.text.DecimalFormat;

public class Circle {
    double radius;

    public double getArea(double r) {
        double area;
        area = 3.14*r*r;
        return area;
    }
    public double getPerimeter(double r)
    {
        double p;
        p = 2*3.14*r;
        return p;
    }
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");
        Scanner in = new Scanner(System.in);
        System.out.println("请输入圆的半径：r=");
        Circle c = new Circle();
        c.radius = in.nextDouble();
        double area = c.getArea(c.radius);
        double perimeter = c.getPerimeter(c.radius);
        System.out.println("the area is"+df.format(area)+"the perimeter is"+df.format(perimeter));
    }
}
