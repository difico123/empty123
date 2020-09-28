import java.util.Arrays;
import java.util.Scanner;

public class bai5 {
    public static void solution(int a[])
    {
        //List<Integer> b = new ArrayList<Integer>();
        Arrays.sort(a);
        int Min = 999999;
        for(int i = 1 ; i < a.length;i++)
        {
            if(a[i]-a[i-1]<Min) {
                Min = a[i] - a[i-1];
            }
        }
        for(int i = 0 ; i < a.length-1;i++)
        {
           if(a[i+1]-a[i] == Min)
           {
              System.out.print(a[i] + " " + a[i + 1] + " ");
           }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        solution(a);
    }
}
