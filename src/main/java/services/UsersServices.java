package services;

import model.Users;
import providers.UsersProvider;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.sql.SQLException;

@Path("usersA00369145")
public class UsersServices {

    @GET
    @Path("echo")
    public String echo(){
        return("echo");
    }

    @POST
    @Consumes("application/json")
    public Response createUser(Users user){
        UsersProvider provider = new UsersProvider();
        try {
            provider.create(user);
            return Response.ok().build();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
