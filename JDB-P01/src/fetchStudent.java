import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class fetchStudent {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/demo";
        String username="root";
        String password="1234";

        String query="Select * from Student";
        try{
            Connection con= DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            System.out.println(" Name "+"    | "+" Age "+"| "+" Address ");
            System.out.println("-------------------------------------------------");
            while (rs.next()){
                System.out.println(rs.getString("studname") + "  |  " +
                        rs.getInt("age") + "  |  " +
                        rs.getString("address"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
