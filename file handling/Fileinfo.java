import java.io.*;

public class Fileinfo {
    public static void main(String[] args) {
        File f = new File("G:\\JAVA\\file handling\\yuvraj.txt");

        if (f.exists()) {
            System.out.println("File name:"+f.getName());
            System.out.println("File location: "+f.getAbsolutePath());
            System.out.println("File Readabel: "+f.canRead());
            System.out.println("Writable: "+f.canWrite());
            System.out.println("length : "+f.length());
            System.out.println("deleted: "+f.delete());

        } else {
            System.out.println("File does not exits.....");
        }
    }
}
