package com.github.kmbulebu.dcs.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.github.kmbulebu.dsc.it100.DSCSession;

@Path("/module")
public class DSCResource {

	private @Inject DSCSession session;
	
	@POST
    @Path("/connect/{ipaddress}")
    @Consumes({ MediaType.APPLICATION_JSON})
    public Response connect(@PathParam("ipaddress") String ipAddress) {
		
		try {
			session.connect(ipAddress);
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
		
		return Response.ok().build();
	}
}
