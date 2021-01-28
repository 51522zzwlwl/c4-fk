import jdk.nashorn.internal.runtime.UnwarrantedOptimismException;

import java.util.Scanner;

public class work4 {
    private Object move;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("要输入几个数：");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("请输入数组的元素：");
        for(int i = 0;i<n;i++)
        {
            nums[i] = in.nextInt();
        }
        work4 work = new work4();
        work.move(nums);
        for(int j = 0;j<n;j++)
        {
            System.out.println(nums[j]);
        }
    }
    public void move(int[] nums)
    {
        int j = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] != 0)
            {
                nums[j++] = nums[i];
            }
        }
        while(j<nums.length)
        {
            nums[j++] = 0;
        }
    }
}
