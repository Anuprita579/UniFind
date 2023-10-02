import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    conn(){
        String url = "jdbc:mysql://localhost:3307/unifind";
        String username = "root";
        String password = "root123";
        try{
            c = DriverManager.getConnection(url, username,password);
            s = c.createStatement();
            System.out.println("Database connected successfully.");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new conn();
    }
}