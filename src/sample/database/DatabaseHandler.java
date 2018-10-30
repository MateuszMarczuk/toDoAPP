package sample.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Mateusz Marczuk
 * Wojskowa Akademia Techniczna im. Jarosława Dąbrowskiego, Warszawa 30.10.2018.
 */
public class DatabaseHandler extends Configs{

    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://"+ dbHost + ":" + dbPort + "/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser,dbPass);
        return dbConnection;
    }


}
