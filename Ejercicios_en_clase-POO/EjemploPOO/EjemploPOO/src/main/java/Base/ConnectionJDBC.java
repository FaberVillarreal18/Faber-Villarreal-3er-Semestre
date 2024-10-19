package DB;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.*;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionJDBC {
    static final String user = CREDENTIALS.USER.getValue();
    static final String password = CREDENTIALS.PASSWORD.getValue();
    static final String bd = CREDENTIALS.DBNAME.getValue();
    static final String ip = CREDENTIALS.IP.getValue();
    static final String puerto =CREDENTIALS.PORT.getValue();
    static final String url = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    //PoolConnection
    private static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(url);
        ds.setUsername(user);
        ds.setPassword(password);
        ds.setInitialSize(5);
        return ds;
    }

    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }

    public static void closeConecction(Connection connection) throws SQLException {
        connection.close();
    }
}
