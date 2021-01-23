
public class work2 {
    public static void main(String[] args) {
        int ge = 0, shi=0, bai=0;
        int i,x;
        int count = 0;
        for(i=100;i<1000;i++)
        {
            ge = i % 10;
            shi = i / 10 % 10;
            bai = i / 100;
            x = (ge * ge * ge) + (shi * shi * shi) + (bai * bai * bai);
            if (x == i)
            {
                count++;
            }
        }
        System.out.println("1000以内水仙花数有"+count+"个");
    }
}
