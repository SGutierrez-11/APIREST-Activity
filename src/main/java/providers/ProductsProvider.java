package providers;

import db.DBConnection;
import entity.Products;
import entity.Users;

import java.sql.SQLException;

public class ProductsProvider {

    public void create(Products products) throws SQLException {
        String sql = "INSERT INTO productsA00369145(price, productName) VALUES ('$PRICE', '$PRODUCTNAME')";
        sql.replace("$PRICE", ""+products.getPrice());
        sql.replace("$PRODUCTNAME", products.getProductName());
        DBConnection connection = new DBConnection();
        connection.connect();
        connection.commandSQL(sql);
        connection.disconnect();
    }


}
