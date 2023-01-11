package app;

import Sockets.Server;
import Sockets.pojos.HttpResponse;
import java.io.IOException;

import static Sockets.contract.HttpMethod.GET;

/**
 * Test functional server library.
 */
public class App {
    public static void main(String[] args) throws IOException {
        Server myServer = new Server(8080);
        myServer.addRoute(GET, "/testOne",
                (req) -> new HttpResponse.Builder()
                        .setStatusCode(200)
                        .addHeader("Content-Type", "text/html")
                        .setEntity("<HTML> <P> Hello There... </P> </HTML>")
                        .build());
        myServer.start();
    }
}
