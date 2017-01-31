package com.template.api

import net.corda.core.messaging.CordaRPCOps
import javax.ws.rs.GET
import javax.ws.rs.PUT
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

// This API is accessible from /api/template. The endpoint paths specified below are relative to it.
@Path("template")
class TemplateApi(val services: CordaRPCOps) {
    /**
     * Define GET endpoints as follows.
     */
    @GET
    @Path("templateGetEndpoint")
    @Produces(MediaType.APPLICATION_JSON)
    fun templateGetEndpoint() {}

    /**
     * Define PUT endpoints as follows.
     */
    @PUT
    @Path("templatePutEndpoint")
    fun templatePutEndpoint(payload: Any): Response {
        return Response.accepted().build()
    }
}