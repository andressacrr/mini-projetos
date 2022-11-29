import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJDBC {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coursejdbc", "root", "andressa");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from people");

            while (rs.next()) {
                System.out.println(rs.getString("firstname"));
            }

        } catch (Exception e){
            e.printStackTrace();
        }


    }
}