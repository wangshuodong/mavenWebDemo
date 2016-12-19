package com.wangsd.resteasy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Administrator on 2016/12/19.
 */
@Path("/hello")
public class HelloWorld {
    @GET
    @Path("/{param}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getMsg(@PathParam("param") String name) {
        String msg = "aaaa：" + name;
        return Response.status(200).entity(msg).build();
    }
}
