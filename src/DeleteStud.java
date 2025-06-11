import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteStud {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/demo";
        String username="root";
        String password="1234";

        String query="delete from student where studname=?";
        try{
            Connection con= DriverManager.getConnection(url,username,password);
            PreparedStatement pr=con.prepareStatement(query);
            pr.setString(1,"Shreya");
            int update=pr.executeUpdate();
            if(update>0){
                System.out.println("Data deleted");
            }
            else{
                System.out.println("Data not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
