import java.util.*;
import java.sql.*;

class Connect{
    Scanner sc = new Scanner(System.in);
    String url;
    String username;
    String pass;
    Connection cone;
    
    Connect()

    {
        
        try{
           url="jdbc:mysql://localhost:3306/yuv";
           username="root";
           pass="";
           cone=DriverManager.getConnection(url, username, pass);
            System.out.println("connected");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

class Table extends Connect
{
    Table()
    {
        try {
            // String q="create table yuv(sid int(20) primary key auto_increment, s_name varchar(100) not null,s_stream varchar(100) not null)";
            String q ="create table room(id int(10) primary key auto_increment, name varchar(100) not null, stream varchar(100) not null)";
            Statement ste = cone.createStatement();
            ste.executeUpdate(q);
            System.out.println("Table created..");
        } catch (Exception e) {
           e.printStackTrace();
        }

    }

}

class Insert extends Connect
{
    Insert()
    {
        try {
            System.out.println("Enter the name: ");
            String name= sc.nextLine();
    
            System.out.println("Enter the stream: ");
            String stream= sc.nextLine();
    
            String inse= "insert into room (name, stream) values('"+name+"','"+stream+"')";
            PreparedStatement pst= cone.prepareStatement(inse);
            pst.executeUpdate();
            } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class Display extends Connect
{
    Display()
    {
       try {
        Statement stmt = cone.createStatement();
    
        String di="select * from room";
        ResultSet rs = stmt.executeQuery(di);
        System.out.println("id\t name\t strea");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
        }
       } catch (Exception e) {
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
            System.out.println("Enter the delete record: ");
            int choice= sc.nextInt();
            Statement stmt = cone.createStatement();
            String del= "delete from room where id ='"+choice+"'";
            int r_afect=stmt.executeUpdate(del);
            System.out.println("Row deleted...");
            if(r_afect==1)
            {
                new Display();
            }
            cone.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ExamCrud
{
    public static void main(String[] args) {
    //    Table c = new Table();
       Insert i = new Insert();
       Display d = new Display();
       Delete a = new Delete();
    }
}