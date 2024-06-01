import java.util.Scanner;

public class DuckNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int no, r, p, count = 0;
        System.out.print("Enter the no : ");
        no = sc.nextInt();
        while (no > 0) {
            r = no % 10;
            if (r == 0)
                count++;
            else
                p = r;
            no = no / 10;
        }
        if (count > 0)
            System.out.println("is Duck number");
        else
            System.out.println(" is Not Duck number");
    }
}