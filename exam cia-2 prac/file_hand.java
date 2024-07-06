import java.io.*;
import java.io.IOException;
import java.util.Scanner;
class Scan
{
    Scanner sc=new Scanner(System.in);
}

class Createfile
{
    Createfile()
    {
        try
        {
            File f = new File("mca2.txt");
            if (f.createNewFile())
            {
                System.out.println("File created: " + f.getName());
            }
            else
            {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

class Menu
{
    Menu()
    {
            // Display menu
            System.out.println("File Handling Menu");
            System.out.println("1. Create New File");
            System.out.println("2. Write to a File");
            System.out.println("3. Read From a File");
            System.out.println("4. Delete a File");
            System.out.println("5. Rename a File");
            System.out.println("6. Exit");   
    }
}
class Case extends Scan
{
    Case()
    {
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice) 
        {
                case 1:
                    new Createfile();
                    break;
                case 2:
                    new Writefile();
                    break;
                case 3:
                    new Readfile();
                    break;
                case 4:
                    new Deletefile();
                    break;
                case 5:
                    new Renamefile();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
        }
    }
}

class Writefile extends Scan
{
    Writefile()
    {
        try 
        {
            FileWriter f=new FileWriter("mca2.txt");
            try 
            {
                f.write("Atmiya University....");
            }
            finally 
            {
                f.close();
            }
            System.out.println("Success Fully file Write...");
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
    }
}
class Readfile 
{
    Readfile()
    {
        try 
        {
            FileReader fr=new FileReader("mca2.txt");
            try 
            {
                int i;
                while((i=fr.read())!=-1)
                {
                    System.out.print((char)i);
                }
                System.out.println("\n");
            }
            finally 
            {
                fr.close();
            }
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }     
    }
}
class Deletefile
{
    Deletefile()
    {
        File f=new File("mca2.txt");
        if(f.delete())
        {
            System.out.println(f.getName()+"File is Delete Sucessfully");
        }
    }
}
class Renamefile
{
    Renamefile()
    {
        File f=new File("mca2.txt");
        File r=new File("mca3.txt");
        if(f.exists())
        {
            System.out.println(f.renameTo(r));
            System.out.println("File is Rename->"+r.getName());
        }
        else 
        {
            System.out.println("File Does not exits...");
        }
    }
}
class file_hand
{
    public static void main(String[] args) 
    {
        while(true)
        {
            new Menu();   
            new Case();   
        }
    }
}