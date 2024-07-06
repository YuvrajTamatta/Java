import java.util.*;

class Auto{
    static boolean Auto(int num){
        int sqr = num* num;
        while (num>0) {
            if(num%10 != sqr%10)
                return false;
                num=num/10;
                sqr=sqr/10;
            
        }
        return true;
    }
}
/**
 * automorphic
 */
public class automorphic {

    public static void main(String[] args) {
        Auto a = new Auto();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the::");
        int no = sc.nextInt();

        if(a.Auto(no)){
            System.out.println("yes auto");
        }
        else{
            System.out.println("Not auto");
        }
    }
}