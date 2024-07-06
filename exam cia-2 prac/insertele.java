import java.util.*;

public class insertele {
    public static void main(String args[])
    {
     int arr[]={1,2,3,4,5};
     int pos=2;
     int val=100;

     for(int i=0; i>=arr.length-1;i--)
     {
        if(i>=pos)
        {
            arr[i]=arr[i];
            if(i==pos)
            {
                arr[i]=val;
            }
        }
        
     }System.out.println(arr[i]);
     
    }
    
}
