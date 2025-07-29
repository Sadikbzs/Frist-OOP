import java.util.Scanner;

public class Helloworld {
    public static void main (String[] args)
    {
     int n,m;
        System.out.println("Enter 2 Number");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int [][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }

        }
        for  (int i = 0; i < n; i++) {
            for  (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

    }
}
