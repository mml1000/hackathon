package com.pump4court.hackathon;

import static spark.Spark.*;
import spark.Request;
import spark.Response;

/**
 * Hello world!
 *
 */
public class App 
{
  public static void main( String[] args )
  {
    final String static_dir = System.getenv("STATIC_DIR");
    final int port_number = 8080;

    assert static_dir != null;
    externalStaticFileLocation(static_dir);

    port(port_number);

    get("/", (req, res) -> "Hello World!");

  }
}
