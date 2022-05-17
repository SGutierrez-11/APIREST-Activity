package services;

import entity.Orders;
import entity.Users;
import model.Message;
import providers.OrdersProvider;
import providers.UsersProvider;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Path("orders")
public class OrdersServices {

    @POST
    @Path("createOrders")
    @Consumes("application/json")
    @Produces("application/json")
    public Response createOrders(Orders orders){
        OrdersProvider provider = new OrdersProvider();
        try {
            provider.create(orders);
            return Response.status(200).entity(orders).build();
        } catch (SQLException e) {
            e.printStackTrace();
            return Response.status(500).entity(new Message("FAILED")).build();
        }
    }

}
