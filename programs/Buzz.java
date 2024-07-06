import java.util.*;
class Buzz{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any number :");

		int no = sc.nextInt();

		if(no % 10 == 7 || no % 7 == 0)
		{
			System.out.print("number is buzz");
		}
		else{
			System.out.println("number is not buzz number");
		}

	}
}