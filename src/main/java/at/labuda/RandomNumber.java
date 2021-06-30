package at.labuda;


import java.util.Random;
import java.util.Random;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
@Path("/api")
public class RandomNumber {
    @GET
    @Path("/number")
    @Produces(MediaType.TEXT_PLAIN)
    public int RandomNumber() {
        int min = 500;
        int max = 600;

        //Generate random int value from 500 to 600

        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return(random_int);

        //taken from https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
    }

}



