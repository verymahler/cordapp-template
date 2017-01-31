package com.example.api;

import net.corda.core.messaging.CordaRPCOps;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.concurrent.ExecutionException;

// This API is accessible from /api/example. The endpoint paths specified below are relative to it.
@Path("example")
public class ExampleApi {
    private final CordaRPCOps services;

    public ExampleApi(CordaRPCOps services) {
        this.services = services;
    }

    /**
     * Define GET endpoints as follows.
     */
    @GET
    @Path("exampleGetEndpoint")
    @Produces(MediaType.APPLICATION_JSON)
    public void exampleGetEndpoint() {}

    /**
     * Define PUT endpoints as follows.
     */
    @PUT
    @Path("examplePutEndpoint")
    public Response createPurchaseOrder(Object payload) throws InterruptedException, ExecutionException {
        return Response.accepted().build();
    }
}