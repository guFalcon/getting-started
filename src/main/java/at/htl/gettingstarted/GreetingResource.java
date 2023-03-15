package at.htl.gettingstarted;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import at.htl.gettingstarted.entities.Greeting;
import at.htl.gettingstarted.entities.Person;

@Path("/greeting")
public class GreetingResource {

    @ConfigProperty(name = "myProperty", defaultValue = "default")
    private String configValue;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hello")
    public String hello() {
        return "Hello RESTEasy " + configValue;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/json")
    public Greeting json() {
        return new Greeting("testname");
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/person")
    public Person person() {
        return new Person("Gerald", "Unterrainer");
    }
}