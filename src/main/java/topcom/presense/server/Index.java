package topcom.presense.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.server.mvc.Viewable;

/**
 * Root resource (exposed at "/" path)
 */
@Path("/")
public class Index {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return Response that will be built by template.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response index() {
        return Response.ok(new Viewable("/index")).build();
    }

}
