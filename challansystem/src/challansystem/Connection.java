package challansystem;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


public class Connection extends javax.swing.JFrame{
     PreparedStatement ps;
    java.sql.Connection conn=null;
    java.sql.Connection conn1=null;
    ResultSet rs=null;
    ResultSet rs1=null;
    Statement st,st1;
    public Connection()
    {
        setconnection();
    }
    protected void setconnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
            st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
             /* conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventary_database","root","123");*/
            //st1=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            System.out.println("Database Connected");
        }
        catch(Exception e)
        {
            System.out.println("Error in Connection plz Check :"+e);
        }
       
    
    }
    public static void main(String args[]){
    new Connection();
    }
}
