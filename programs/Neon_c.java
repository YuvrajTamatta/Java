import java.util.Scanner;

class Neon{

    Neon(int num)
    {
        int sum = 0; 
         int square = num * num;  
        while (square != 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is a Neon Number.");
        } else {
            System.out.println(num + " is not a Neon Number.");
        }
    }
}

class Neon_c {
    public static void main(String[] args) {
             
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the number to check: ");  
       int num = sc.nextInt();  
        Neon ob = new Neon(num);
       
    }
}