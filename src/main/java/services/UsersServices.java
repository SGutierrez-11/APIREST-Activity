package services;

import model.Message;
import entity.Users;
import providers.UsersProvider;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.ArrayList;

@Path("users")
public class UsersServices {

    @POST
    @Path("createUsers")
    @Consumes("application/json")
    @Produces("application/json")
    public Response createUser(Users user){
        UsersProvider provider = new UsersProvider();
        try {
            provider.create(user);
            return Response.status(200).entity(user).build();
        } catch (SQLException e) {
            e.printStackTrace();
            return Response.status(500).entity(new Message("FAILED")).build();
        }
    }

}
