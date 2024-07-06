import java.io.*;

/**
 * CreteFile
 */
public class CreteFile {

    public static void main(String[] args) {
        File f = new File("G:\\JAVA\\file handling\\yuvraj.txt");
       
        try {
            if (f.createNewFile()) {
                System.out.println("file is created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Error handled");
        }
    }
}