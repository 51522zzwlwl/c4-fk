import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入：");
        String string = in.nextLine();
        String revers = new StringBuffer(string).reverse().toString();
        System.out.println("输出："+ revers);
    }
}
