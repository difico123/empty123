import java.util.Scanner;

public class bai2 {

    public static int[] solution(int a[], int n) {
        int temp = 0;
        for (int i = 0; i < n / 2; i++ ) {
            temp = a[i];
            a[i] = a[n - i-1];
            a[n-i-1]= temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = new int[1000];
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        a = solution(a, n);

        for (int i = 0; i < n; i++ ) {
            System.out.print(a[i] + " ");
        }
    }
}
