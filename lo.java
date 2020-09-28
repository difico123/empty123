import java.util.Scanner;

public class lo {
    static boolean flag = false;
    static Scanner sc = new Scanner(System.in);
    static int b;
    static
    {
        b = sc.nextInt();
    }

    public static void main(String args[])
    {
        System.out.println(b);
        /*List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(0);
        int i = list.get(0);
        list.set(0, i+1);
        System.out.println(list);*/
        //if(!flag) System.out.println(!flag);
    }

    public static int add(int i, int i1) {
        int i2 = i+i1;
        return i2;
    }
    public static int simpleArraySum(int[] ar) {
        int sum = 0;
        for(int Num : ar)
        {
            sum += Num;
        }
        return sum;
    }
}
