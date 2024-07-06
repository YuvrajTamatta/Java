import java.io.*;
public class seach_string
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a main string: ");
		String ms=br.readLine();
		System.out.println("Enter a substring: ");
		String ss=br.readLine();
		int l=ms.length();
		int i,p=0,freq=0;
		
		for(i=0;i<l;i++)
		{
 			char ch=ms.charAt(i);
 			if(ch==' ')
 			{
 				String word=ms.substring(p,i);
 				if(word.equalsIgnoreCase(ss))
 				{
 					freq++;
 				}
 				p=i+1;
 			}
		}
		System.out.println("No of times substring is present in the main string: "+freq);
	} 
} 