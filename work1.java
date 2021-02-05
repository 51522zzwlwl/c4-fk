import java.util.Scanner;

public class work1 {
    public static void work(int matrix[][])
    {
        if (matrix == null) {
            return;
        }
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++)
        {
            for (int j = i; j < n - 1 - i; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入二维数组维数n：");
        int n = in.nextInt();
        int matrix[][] = new int[n][n];
        System.out.println("请输入数组元素：");
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                matrix[i][j] = in.nextInt();
            }
        }
        work(matrix);
        for (int k = 0; k<n; k++)
        {
            for(int m = 0; m<n; m++)
            {
                System.out.print(matrix[k][m]+" ");
                if(m == n-1)
                    System.out.println();
            }
        }
    }
}
