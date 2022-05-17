package providers;

import db.DBConnection;
import entity.Orders;
import entity.Products;

import java.sql.SQLException;
import java.util.Date;

public class OrdersProvider {

    public void create(Orders orders) throws SQLException {
        String sql = "INSERT INTO ordersA00369145(creationDate, payDate, isPay, amountProduct, userId) VALUES ('$CREATIONDATE', '$PAYDATE', '$ISPAY', '$AMOUNTPRODUCT', '$USERID')";
        sql.replace("$CREATIONDATE", "" + new Date().getTime());
        sql.replace("$PAYDATE", ""+0);
        sql.replace("$ISPAY", ""+orders.getIsPay());
        sql.replace("$AMOUNTPRODUCT", ""+orders.getAmountProduct());
        sql.replace("$USERID", ""+orders.getUserId());
        DBConnection connection = new DBConnection();
        connection.connect();
        connection.commandSQL(sql);
        connection.disconnect();
    }





}
