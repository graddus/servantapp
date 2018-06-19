package servant.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {
    private String connectionURL = "jdbc:oracle:thin:@localhost:1521:XE";
    private String username = "lucca";
    private String password = "Burdeos1";
    private String driver = "oracle.jdbc.driver.OracleDriver";
    private Connection con;

    BaseDao() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    Connection getConnection(){
        // URL, User and Password
        try {
			con = DriverManager.getConnection(connectionURL, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return con;
    }

    void close() throws SQLException {
        if (con != null) {
            con.close();
        }
    }


}


