// import java.util.*;

// class proess {

//     Scanner sc = new Scanner(System.in);
//     int no, sqr, s_r, temp, count = 0;

//     proess() {
//         System.out.print("Enter Number : ");
//         no = sc.nextInt();
//     }

//     void Perform() {
//         temp = no;
//         sqr = temp * temp;
//         while (temp > 0) {
//             temp = temp / 10;
//             count++;
//         }
//         s_r = sqr % (int) Math.pow(10, count);
//         if (s_r == no) {
//             System.out.println("this Number is Automorphic : " + no);

//         } else {
//             System.out.println("this Number is not  Automorphic : " + no);

//         }

//     }
// }

// class Automorphic {
//     public static void main(String[] args) {
//         proess s = new proess();
//         s.Perform();
//     }

// }

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the square of the number
        long square = number * number;

        // Convert both the number and its square to strings
        String numberStr = String.valueOf(number);
        String squareStr = String.valueOf(square);

        // Check if the last digits of the square are the same as the number
        if (squareStr.endsWith(numberStr)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }

        scanner.close();
    }
}
