// class FactorialExample{  
//     public static void main(String args[]){  
//      int i,fact=1;  
//      int number=5;//It is the number to calculate factorial    
//      for(i=1;i<=number;i++){    
//          fact=fact*i;    
//      }    
//      System.out.println("Factorial of "+number+" is: "+fact);    
//     }  
//    }  
import java.util.*;

class yuvraj
{
    int fact =1;
    Scanner sc =new Scanner(System.in);
   
    yuvraj()
    {
        System.out.print("Enter factorial num:::");
        int num = sc.nextInt();
        for(int i =1; i<=num; i++)
        {
            fact = fact*i;
        }
        System.out.println("Factori of "+num+" is ::"+fact);
    }
}
public class factoril {

    public static void main(String[] args) {
        yuvraj y = new yuvraj();
    }
}