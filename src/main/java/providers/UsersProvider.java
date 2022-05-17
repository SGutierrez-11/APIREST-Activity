package providers;

import db.DBConnection;
import entity.Users;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsersProvider {

    public void create(Users user) throws SQLException {
        String sql = "INSERT INTO usersA00369145(idUsers) VALUES ('$IDUSERS')";
        sql.replace("$IDUSERS", user.getIdUsers());
        DBConnection connection = new DBConnection();
        connection.connect();
        connection.commandSQL(sql);
        connection.disconnect();
    }

    /*
    public ArrayList<Users> getAllUsers() throws SQLException {
        ArrayList<Users> output = new ArrayList<Users>();
        String sql = "SELECT * FROM usersA00369145";
        DBConnection connection = new DBConnection();
        connection.connect();

        ResultSet resultSet = connection.getDataBySQL(sql);
        while(resultSet.next()){
            int id = resultSet.getInt(resultSet.findColumn("id"));
           // String id = resultSet.getString(resultSet.findColumn("id"));
            String idUsers = resultSet.getString(resultSet.findColumn("idUsers"));

            Users user = new Users(id, idUsers);
            output.add(user);

        }
        connection.disconnect();
        return output;
    }
*/
}
