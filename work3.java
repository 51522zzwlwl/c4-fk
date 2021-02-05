import java.util.Scanner;
import java.util.ArrayList;

public class work3 {

    public static void main(String[] arge) {
        Scanner in = new Scanner(System.in);
        String charList = in.nextLine();
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < charList.length(); i++)
        {
            if (Character.isDigit(charList.charAt(i)))
            {
                numList.add(charList.charAt(i) - '0');
            }
        }
            for (int each : numList)
            {
                System.out.print(each);
            }
    }
}