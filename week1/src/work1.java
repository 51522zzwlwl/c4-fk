import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        {
            Scanner in = new Scanner(System.in);
            System.out.println("输入体重（kg）：");
            double w = in.nextDouble();
            System.out.println("输入身高（m）：");
            double h = in.nextDouble();
            double result = w/(h*h);
            if(result<18.5)
              {
                  System.out.println("过轻");
              }
            else if(result>18.5&&result<25)
            {
                  System.out.println("正常");
            }
            else if (result>25&&result<28)
            {
                  System.out.println("过重");
            }
            else if (result>28&&result<32)
            {
                  System.out.println("肥胖");
            }
            else {
                System.out.println("非常肥胖");
            }
        }
    }
}
