import java.util.ArrayList;
import java.util.Scanner;

public class HASHMAP {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        int n = scanner.nextInt();
        int[] arrays = new int[100];
        for (int i = 0; i < n; i++) {
            arrays[i] = scanner.nextInt();
        }

        String[] s = new String[2];

        int queriesNum = scanner.nextInt();

        for (int i = 0; i < queriesNum; i++) {
            for (int j = 0; j < 2; j++) {
                s[j] = scanner.nextLine();
                if (s[j].equals("Insert"))
                    Insert(arrays, n);
                if (s[j].equals("Delete"))
                    Delete(arrays, n);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arrays[i] + " ");
        }
    }

    private static void Delete(int[] arr,int n) {
        int x = scanner.nextInt();
        for (int i = x; i < n; i++) {
            arr[i] = arr[i + 1];
        }
    }

    private static void Insert(int[] arr,int n) {
        int x = scanner.nextInt(); // position
        int y = scanner.nextInt(); // value
        int i;
        for (i = n; i > x; i--) {
            arr[i] = arr[i-1];
        }
        arr[i] = y;
    }
}
