import java.util.*;

class factorial{

    factorial(int num)
    {
        int i=1,fact=1;
        for(i=1;i<=num;i++)
        {    
             fact=fact*i;    
        }    
         System.out.println("Factorial of the number: "+fact);  
    }
}

class Factorial_c
{
     public static void main(String []args)
     {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        factorial obj = new factorial(num);
     }   
}