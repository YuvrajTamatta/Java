import java.util.*;

public class search_string {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the main string. ");
        String mainString=sc.nextLine();

        System.out.println("Enter the subString. ");
        String subString=sc.nextLine();

        mainString = mainString.toLowerCase();
        subString = subString.toLowerCase();
        
        String words[] = mainString.split("\\s+");
        int count=0;
        for(String word : words)
        {
            if(word.equals(subString))
            {
                count++;
            }
        }
        System.out.println("sub string found at times. "+count);
    }
}