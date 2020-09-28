import java.util.Scanner;

public class bai4 {
    public static String isEquals(int a[], int n) {
        if ( n == 1) return "YES";
        int Right = 0;
        int Left = 0;

        for (int i = 0; i < n ;i++ ) {
            Right += a[i];
        }

        for (int i = 0; i < n - 1; i++) {
            Right -= a[i];
            if (Right == Left) {
                return "YES";
            } else {
                Left += a[i];
            }
        }
        return "NO";
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int a[] = new int[100000];
        int n =0;

        for (int i = 0 ; i < T; i++) {
            n = sc.nextInt();;
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            System.out.println(isEquals(a, n));
        }
    }
}
