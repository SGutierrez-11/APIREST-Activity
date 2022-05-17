package services;

import entity.Products;
import entity.Users;
import model.Message;
import providers.ProductsProvider;
import providers.UsersProvider;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Path("products")
public class ProductsServices {

    @POST
    @Path("createProducts")
    @Consumes("application/json")
    @Produces("application/json")
    public Response createProducts(Products products){
        ProductsProvider provider = new ProductsProvider();
        try {
            provider.create(products);
            return Response.status(200).entity(products).build();
        } catch (SQLException e) {
            e.printStackTrace();
            return Response.status(500).entity(new Message("FAILED")).build();
        }
    }

}
