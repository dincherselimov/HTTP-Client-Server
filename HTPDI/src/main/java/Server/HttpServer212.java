package Server;

import Config.Config;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * This class runs a simple HTTP Server working on "localhost" and port: 9000
 */
public class HttpServer212 {

    private static HttpServer server;
    private String host;
    private int port;

    public HttpServer212(String host, int port){
        this.host = host;
        this.port = port;
    }
    //Execute the ServerStart method
    public static void main(String[] args) throws IOException {
        HttpServer212 server = new HttpServer212(Config.getInstance().getHost(),
                Config.getInstance().getPort());

        server.serverStart();
    }

    /**
     * Connecting to localhost on port 9000
     * Creating httpContext
     * Setting an executor(by default is null)
     * Start the server
     * @throws IOException
     */
    public void serverStart() throws IOException {
        //Create new threadPool, up to 10 threads
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);

        //initializing the server
        server = HttpServer.create(new InetSocketAddress(host, port), 0);

        //creating context for server
        server.createContext("/st",new HTTPHandler());

        //setting executor not to be null(default)
        server.setExecutor(threadPoolExecutor);

        //start the server
        server.start();
        System.out.println("Server started on port 9000");
    }

    public void stop() {
        //Stop the server
        server.stop(0);
        System.out.println("Server stopped");
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }
}


