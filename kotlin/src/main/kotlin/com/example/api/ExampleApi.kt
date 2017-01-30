package com.example.api

import net.corda.core.messaging.CordaRPCOps
import javax.ws.rs.GET
import javax.ws.rs.PUT
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

// This API is accessible from /api/example. The endpoint paths specified below are relative to it.
@Path("example")
class ExampleApi(val services: CordaRPCOps) {
    /**
     * Define GET endpoints as follows.
     */
    @GET
    @Path("exampleGetEndpoint")
    @Produces(MediaType.APPLICATION_JSON)
    fun exampleGetEndpoint() {}

    /**
     * Define PUT endpoints as follows.
     */
    @PUT
    @Path("examplePutEndpoint")
    fun examplePutEndpoint(payload: Any): Response {
        return Response.accepted().build()
    }
}