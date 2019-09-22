//NB...!!!
package sad_viva;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author nuwanmalintha
 */
public class Jdbc {
    
    // create connection
    
    public static Connection con;
    
    public static Connection getConnection() throws Exception{
    
        if(con == null){
        Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sad_viva", "root", "123");
        }
        return con;
    }
    
    //save update dele
    
    public static void setData(String sql)throws Exception{  
        Jdbc.getConnection().createStatement().executeUpdate(sql);
    }
    
    // search
    
    public static ResultSet getData(String sql)throws Exception{
        ResultSet executeQuery = Jdbc.getConnection().createStatement().executeQuery(sql);
        return executeQuery;
    }
}
