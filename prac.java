import java.sql.*;
import java.util.*;

class Connect{
    Scanner sc = new Scanner(System.in);
    String url;
    String username;
    String pass;
    Connection con;

    Connect()
    {
        try {
           url="jdbc:mysql://localhost:3306/yuv";
           username="root";
           pass  = "";

           con = DriverManager.getConnection(url,username,pass);

           System.out.println("Connected"); 

            
        } catch (Exception e) {
           System.out.println(e);
        }
    }

}

class Tabel extends Connect
{
    Tabel(){
        try {
            String tablename = "CREATE TABLE YUVRAJ (ID INT(20) PRIMARY KEY AUTO_INCREMENT, NAME VARCHAR(255) NOT NULL, EMAIL VARCHAR(255))";
        Statement st = con.createStatement();
        st.executeUpdate(tablename);
        System.out.println("table created");
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}

class Insert extends Connect
{
    Insert(){
        try {
            System.out.println("Enter the name: ");
            String name= sc.nextLine();

            System.out.println("EMAIL: ");
            String email = sc.nextLine();

            String query = "INSERT INTO YUVRAJ (NAME, EMAIL) VALUES ('"+name+"', '"+email+"')";

            PreparedStatement prest = con.prepareStatement(query);

            prest.executeUpdate();

            System.out.println("data is inserted..");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Display extends Connect
{
    Display(){
        try{
            Statement st = con.createStatement();
            String dis = "SELECT * FROM YUVRAJ";
            ResultSet rs = st.executeQuery(dis);
            System.out.println("ID \t NAME \t EMAIL");
            System.out.println("===================================");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
                System.out.println("===================================");
            }
            con.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

class Delete extends Connect
{
    Delete()
    {
        try {
            new Display();
            Statement stmt = con.createStatement();

            System.out.println("Enter the delete record:");
            int ch=sc.nextInt();

            String d_query = "DELETE FROM YUVRAJ WHERE ID='"+ch+"'";
            int exec = stmt.executeUpdate(d_query);

            System.out.println("Row affected"+exec);
            if(exec==1)
            {
                new Display();
            }
            con.close();


        } catch (Exception e) {
           e.printStackTrace();
        }
    }

}

class Menu
{
    Menu()
    {
      System.out.println("1. insert");  
      System.out.println("2. Display");
      System.out.println("3. Delete");

    }
}

class Choice extends Connect{
    Choice(){
        while (true) {
            new Menu();
            System.out.println("Enter above choice: ");
            int choose= sc.nextInt();

            switch (choose) {
                case 1:
                    new Insert();
                    break;

                 case 2:
                    new Display();
                    break;
                
                    case 3:
                    new Delete();
                    break;
            
                default:
                    break;
            }
            
        }
    }
}

class prac
{
    public static void main(String[] args) {
      Tabel t = new Tabel();  
     Choice c = new Choice();
    }
}