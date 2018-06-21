package cl.syachile.rest;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class HeadersCXF implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		String producto = exchange.getIn().getHeader("entrada").toString();
		StringBuilder salida = new StringBuilder();
		salida.append(
				"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:prod=\"http://www.productos.cl\">")
				.append("<soapenv:Header/>").append("<soapenv:Body>").append("<prod:consultarProductos>").append(producto)
				.append("</prod:consultarProductos>").append("   </soapenv:Body>").append("</soapenv:Envelope>");

		exchange.getIn().setBody(salida);

	}

}
