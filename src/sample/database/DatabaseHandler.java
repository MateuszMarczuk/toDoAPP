package sample.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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


    public void signUpUser(String firstName, String lastName, String username, String password, String gender, String location){

        String insert = "INSERT INTO " + Const.USER_TABLE + "("+Const.USERS_FIRSTNAME+","+Const.USERS_LASTNAME+","+Const.USERS_USERNAME+","+Const.USERS_PASSWORD
            +","+Const.USERS_GENDER+","+Const.USERS_LOCATION+")" + "VALUES(?,?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(insert);
            preparedStatement.setString(1,firstName);
            preparedStatement.setString(2,lastName);
            preparedStatement.setString(3,username);
            preparedStatement.setString(4,password);
            preparedStatement.setString(5,gender);
            preparedStatement.setString(6,location);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
