import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class insertStudent {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/demo";
        String username="root";
        String password="1234";

        String query="insert into Student (studname,age,address) VALUES (?,?,?)";
        try{
            Connection con= DriverManager.getConnection(url,username,password);
            PreparedStatement pst =con.prepareStatement(query);
            pst.setString(1,"Rudra");
            pst.setInt(2,17);
            pst.setString(3,"Bangalore");
            pst.executeUpdate();

            pst.setString(1,"Shreya");
            pst.setInt(2,18);
            pst.setString(3,"Nashik");
            pst.executeUpdate();

            System.out.println("Data inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
