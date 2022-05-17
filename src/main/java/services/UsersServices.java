package services;

import model.Message;
import model.Users;
import providers.UsersProvider;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.ArrayList;

@Path("usersA00369145")
public class UsersServices {

    @GET
    @Path("echo")
    public String echo(){
        return("echo");
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response createUser(Users user){
        UsersProvider provider = new UsersProvider();
        try {
            provider.create(user);
            return Response.status(200).entity(user).build();
        } catch (SQLException e) {
            e.printStackTrace();
            return Response.status(500).entity(new Message("Operación éxitosa. ")).build();
        }
    }

    @GET
    @Path("all")
    public Response getAll(){
        try {
            UsersProvider provider = new UsersProvider();
            ArrayList<Users> users = provider.getAllUsers();
            return Response.ok(users)
                    .header("Content-Type", "application/json")
                    .build();


        } catch (SQLException e) {
            e.printStackTrace();
            return Response
                    .status(500)
                    .entity(new Message("Failed"))
                    .header("Content-Type","application/json")
                    .build();
        }

    }


}
