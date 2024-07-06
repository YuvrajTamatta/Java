import java.util.*;

class Automor {
    static boolean isAutomorphic(int num) {
        int square = num * num;
        while (num > 0) {
            if (num % 10 != square % 10)
                return false;
            num = num / 10;
            square = square / 10;
        }
        return true;
    }
} 

class Auto {
        public static void main(String args[]) {
            int no;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            no=sc.nextInt(); 

            Automor a = new Automor();
            if(a.isAutomorphic(no))
            {
                System.out.println("auto");
            }
            else
            {
                System.out.println("not");
            }
        }
    }
