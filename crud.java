import java.sql.*;
import java.util.*;
class Cone
{
	Scanner sc=new Scanner(System.in);
	String url;
	String unm;
	String pwd;
	Connection con;
	Cone()
	{
		try 
		{
	 		url="jdbc:mysql://localhost:3306/std";
			unm="root";
	 		pwd="";
	 		con=DriverManager.getConnection(url,unm,pwd);
			System.out.println("connected....");
	 	}
	 	catch(Exception e)
	 	{
	 		e.printStackTrace();
	 	}
	 }
}
class Create_Table extends Cone
{
	Create_Table()
	{
		try 
		{
			String q="create table c_b(sid int(20) primary key auto_increment, s_name varchar(100) not null,s_stream varchar(100) not null)";
			Statement stmt=con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("Table Created In Data-Base...");
			//con.close();
		}
		catch(SQLException e)
		{
			if (e.getErrorCode() == 1050) // MySQL error code for "table already exists"
			{ 
                		System.out.println("Table already exists.");
            		}
            		else 
            		{
				e.printStackTrace();
			}
		}
	}
}
class Ins extends Cone
{
	Ins()
	{
		try 
		{
			System.out.println("Enter Student Name:");
                	String snm=sc.nextLine();

                	System.out.println("Enter Student Stream:");
                	String stream=sc.nextLine();

                	String q="Insert into c_b (s_name,s_stream) values('"+snm+"','"+stream+"')";

                	//get the PreparedStatement Object

                	PreparedStatement pstmt=con.prepareStatement(q);

                	pstmt.executeUpdate();

	                System.out.println("Your Data is Inserted....");
                	con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Display extends Cone
{
	Display()
	{
		try 
		{
			Statement stmt=con.createStatement();  
        	String q="Select * from c_b";
        	ResultSet rs=stmt.executeQuery(q);  
        	System.out.println("\t Student-ID \t Student-Name \t Student Stream");
        	System.out.println("\t=================================================\n");
        	while(rs.next())
        	{  
                System.out.println("\t\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)); 
                System.out.println("\t---------------------------------------------------------------\n");    
            }
            con.close();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Search extends Cone
{
	Search()
	{
		try 
		{
			Statement stmt=con.createStatement(); 
                System.out.println("Enter Search Record");
                int s_r=sc.nextInt(); 
                String q="Select * from c_b where sid='"+s_r+"'";
              
                ResultSet rs=stmt.executeQuery(q);  

                System.out.println("\t Student-ID \t Student-Name \t Student Stream");
                System.out.println("\t=================================================\n");  
                while(rs.next())
                {
                        System.out.println("\t\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));         
                }
               
                con.close();
                
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Update extends Cone
{
	Update()
	{
		try 
		{

			new Display();
			System.out.print("Update Student Record ID :");
			String s_r=sc.nextLine();
			System.out.print("Update Student  Name:");
			String u_snm=sc.nextLine();
			System.out.print("Update Student Stream:");
			String u_stream=sc.nextLine();
                	String u_query="UPDATE c_b SET s_name ='"+u_snm+"',s_stream='"+u_stream+"' WHERE sid = '"+s_r+"'";

                	Statement stmt=con.createStatement();
                	int r_affect=stmt.executeUpdate(u_query);
                	if(r_affect==1)
                	{
                		System.out.println("Record is Updated");
                		new Display();
		        }
                	con.close();         
		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Delete extends Cone
{
	Delete()
	{
		try 
		{
			new Display();
			System.out.println("\n--------------------------------------");
			Statement stmt=con.createStatement(); 
                	System.out.println("Enter Delete Record");
	                int s_r=sc.nextInt(); 
					
	                String d_query="Delete from c_b where sid='"+s_r+"'";
	                int r_affect=stmt.executeUpdate(d_query);
					
	                System.out.println("Row Affected..."+r_affect);
	                if(r_affect==1)
	                {
	                	new Display();
	                }
	                con.close();           
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class F_menu
{
	F_menu()
	{

		System.out.println("Crud Operation With Mysql");
		System.out.println("1.Add Record");
		System.out.println("2.Display Records");
		System.out.println("3.Search Record");
		System.out.println("4.Update Record");
		System.out.println("5.Delete Record");
		System.out.println("6.Exit");
		System.out.println("---------------------------------------------\n");
	}
}
class Menu extends Cone
{
	Menu()
	{
		while(true)
		{
			new F_menu();
			System.out.println("Enter Above Choice");
			int c_no=sc.nextInt();
			switch(c_no)
			{
				case 1:
					new Ins();
					break;
				case 2:
					new Display();
					break;
				case 3:
					new Search();
					break;
				case 4:
					new Update();
					break;
				case 5:
					new Delete();
					break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("Please Above Menu");
			}
		}
	}
}
class crud
{
	public static void main(String[] args) 
	{
		new Create_Table();
		new Menu();
	}
}