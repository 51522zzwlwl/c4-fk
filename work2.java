import java.util.Scanner;

public class work2 {
    public String longestget(String[] strs)
    {
        String ret = "";

        if(strs.length == 0) return ret;
        if(strs.length == 1) return strs[0];

        ret = strs[0];

        for(int i = 1; i < strs.length; i++)
        {
            while (!strs[i].startsWith(ret))
            {
                ret = ret.substring(0, ret.length()-1);
                if (ret.length() == 0)
                {
                    return "";
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("字符串数量n为：");
        int n = in.nextInt();
        System.out.println("请输入字符串：");
        String s[] = new String[n];
        s[0] = in.nextLine();
        for(int i = 0; i < n; i++)
        {
            s[i] = in.nextLine();
        }
        work2 result = new work2();
        String r = result.longestget(s);
        System.out.println(r);
    }
}
