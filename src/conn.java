import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    public static void main(String[] args) throws Exception {
        conn.forName("com.mysql.cj.jdbc.Driver");


        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
        
        String query="select * from publisher";
        Statement smt = con.createStatement();
        smt.executeQuery(query);
    }

    private static void forName(String smt) {
    }
}
