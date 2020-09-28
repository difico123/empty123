import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bai6 {
//    public static int solution(int[] a,int k) {
//
//    }
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\ducno\\IdeaProjects\\hello\\src\\main\\java\\unknow.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String p = scanner.nextLine();
                String[] s = p.split("   ",2);
                String s1 = s[0];
                String s2 = s[1];

                System.out.println(s1 + " " + s2);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}