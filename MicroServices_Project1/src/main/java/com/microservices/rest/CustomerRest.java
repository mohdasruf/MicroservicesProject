package com.microservices.rest;


import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
@Named
@Path("/")
public class CustomerRest {

	
	@GET
	@Path("customer")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer submitOrder(@QueryParam("length") float len,
			@QueryParam("width") float width) {

		Customer order = new Customer();
		 order.setlen(len);
		 order.setwidth(width);
		 order.calcarea(len, width);
		 order.uniqueid();
		 return order;
	}
}
