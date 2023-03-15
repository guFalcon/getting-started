package at.htl.gettingstarted;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Used to configure the root-path of all REST servlets without changing the root of the standard web-server alongside with it.
 */
@ApplicationPath("api")
public class ApplicationConfig extends Application {

}