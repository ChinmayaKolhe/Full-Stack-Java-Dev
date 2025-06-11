import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demo";
        String username = "root";
        String password = "1234";

        String createQuery = "CREATE TABLE teachers(teName VARCHAR(20), salary DECIMAL(5,2))";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement pst = con.prepareStatement(createQuery);
            pst.executeUpdate();
            System.out.println("Table 'teachers' created successfully.");
        } catch (SQLException e) {
            System.out.println("Table creation failed.");
            e.printStackTrace();
        }
    }
}
