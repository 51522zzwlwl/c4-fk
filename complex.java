import java.util.Scanner;

public class complex {
    double real;
    double image;
    public complex(double real,double image)
    {
        this.real = real;
        this.image = image;
    }
    public double getReal()
    {
        return this.real;
    }
    public double getImage()
    {
        return this.image;
    }
    public void setReal(double real)
    {
        this.real = real;
    }
    public void setImage(double image)
    {
        this.image = image;
    }
    public void add(complex first,complex second)
    {
        double real1 = first.getReal()+second.getReal();
        double image1 = first.getImage()+second.getImage();
        if (image1 == 1)
            System.out.println("两复数相加的结果为："+real1+"+"+"i");
        else
            System.out.println("两复数相加的结果为："+real1+"+"+image1+"i");
    }
    public void reduce(complex first,complex second)
    {
        double real2 =first.getReal()-second.getReal();
        double image2 =first.getImage()-second.getImage();
        if (image2 == 1)
            System.out.println("两复数相减的结果为："+real2+"+"+"i");
        else
            System.out.println("两复数相减的结果为："+real2+"+"+image2+"i");
    }
    public void multiply(complex first,complex second)
    {
        double real1;
        double image1;
        if(first.getImage() != 0 && second.getImage() != 0)
        {
            real1 = (first.getReal() * second.getReal()) - (first.getImage() * second.getImage());
            image1 = (first.getReal() * second.getImage()) + (first.getImage() * second.getReal());
        }
        else
        {
            real1 = (first.getReal() * second.getReal());
            image1 =(first.getReal() * second.getImage()) + (first.getImage() * second.getReal());
        }
        if (image1 == 1)
            System.out.println("两复数相乘的结果为："+real1+"+"+"i");
        else
            System.out.println("两复数相乘的结果为："+real1+"+"+image1+"i");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        complex first = new complex(in.nextDouble(),in.nextDouble());
        complex second = new complex(in.nextDouble(),in.nextDouble());
        second.add(first,second);
        second.reduce(first,second);
        second.multiply(first,second);
    }
}
