// import java.util.*;

// class find
// {
//     Scanner sc = new Scanner(System.in);
//     find()
//     {
//         System.out.print("Enter the number of factor : ");
//         int num=sc.nextInt();
//         System.out.print("Factors of " + num + " are :==> ");
//         for(int i = 1 ; i<=num; i++)
//         {
//             if(num%i==0)
//             {
//                 System.out.print(i+" ");
//             }
           
//         }
        
//     }
// }

// class factor
// {
//     public static void main(String[] args) {
//         find f = new find();
//     }
// }

import java.util.*;

class fact{
    Scanner sc = new Scanner(System.in);
    fact()
    {
        System.out.print("Enter the numbr : ");
        int num = sc.nextInt();
        System.out.print("Factor of "+ num + " are :==>>>  ");

        for(int i =1; i<=num; i++)
        {
            if(num%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}

/**
 * factor
 */
public class factor {

    public static void main(String[] args) {
        fact f = new fact();
    }
}