import java.util.Scanner;

public class game {
    private int v = 100;

    public void guess()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("欢迎来到猜字游戏，请输入一个数字：");
        game player = new game();
        while(true)
        {
            int n = in.nextInt();
            if(n < player.v)
            {
                System.out.println("猜的有点小，再试一下吧！");
            }
            if (n > player.v)
            {
                System.out.println("猜大了噢，再试一下吧！");
            }
            if (n == player.v)
            {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
    }

    public static void main(String[] args) {
        game player = new game();
        player.guess();
    }

}
