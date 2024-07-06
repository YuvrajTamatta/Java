import java.io.*;
import java.util.*;

class File_name
{
    File_name()
    {
        File f = new File("Class-a.txt");
        System.out.println("---------------------");
        System.out.println("File name is: "+ f.getName());
    }
}

class File_Path
{
    File_Path()
    {
        File f =  new File("Class-a.txt");
        System.out.println("----------------------");
        System.out.println("File path is : "+f.getAbsolutePath());
    }
}

class Read
{
    Read()
    {
        File f = new File("Class-a.txt");
        System.out.println("-----------------");
        System.out.println("File Readable: "+f.canRead());
    }
}

class File_Write
{
    File_Write()
    {
        File f = new File("Class-a.txt");
        System.out.println("------------------");
        System.out.println("File writteable : "+f.canWrite());
    }
}

class File_delete
{
    File_delete()
    {
        File f = new File("Class-a.txt");
        System.out.println("-------------------------");
        System.out.println("This file is deleted: "+f.delete());
    }
}

class Menu
{
    Menu()
    {
        System.out.println("----- File Menu ------ ");
        System.out.println(" 1. File Name");
        System.out.println(" 2. File Path");
        System.out.println(" 3. File can-Read");
        System.out.println(" 4. File can-Write");
        System.out.println(" 5. Delete");
        System.out.println(" 6. Exit");
    }
}

class Case_perform
{
    Scanner sc=new Scanner(System.in);
    int choice;
    Case_perform()
    {
        System.out.println("Enter the above choices: ");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                new File_name();
                break;
            case 2:
                new File_Path();
                break;
            case 3:
                new Read();
                break;
            case 4:
                new File_Write();
                break;
            case 5:
                new File_delete();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.println(" Please Enter above numbers: ");
            

        }
    }
}

public class MenuDriveFile {
    public static void main(String[] args) {

        while (true) {
            Menu m = new Menu();
            Case_perform cp = new Case_perform();
            
        }
        
    }
}
