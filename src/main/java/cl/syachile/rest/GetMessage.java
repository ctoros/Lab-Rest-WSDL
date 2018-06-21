package cl.syachile.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.ext.multipart.Multipart;

@Path("/")
@Produces("application/xml")
@Consumes("application/xml")
public interface GetMessage {
	
	@POST
	@Path("/execute")
	Response getMessageee(@Multipart String  input);
	

}
