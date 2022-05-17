package config;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resource = new HashSet<Class<?>>();
        resource.add(services.UsersServices.class);
        resource.add(services.ProductsServices.class);
        resource.add(services.OrdersServices.class);
        return resource;
    }
}
