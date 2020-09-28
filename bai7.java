import java.util.Arrays;
import java.util.Scanner;

public class bai7 {
    /**
     *
     * @param a an Array
     */

    public static void findTriplets(int a[]) {
        Arrays.sort(a);
        int ArraySize = a.length;
        for (int i = 0; i < ArraySize - 1; i++) {
            int left = i + 1;
            int right = ArraySize - 1;
            while (left < right) {
                if(a[i] + a[left] + a[right] == 0)
                {
                    System.out.println(a[i] + " " + a[left] + " " + a[right]);
                    left++;
                    right--;
                } else if (a[i] + a[left] + a[right] < 0){
                 left ++;
                } else {
                    right--;
                }
            }
        }
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        findTriplets(arr);
    }

}
