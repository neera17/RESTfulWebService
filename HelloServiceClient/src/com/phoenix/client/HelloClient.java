package com.phoenix.client;



import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;


import org.glassfish.jersey.client.ClientConfig;





public class HelloClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UriBuilder uri =
		UriBuilder.fromUri("http://localhost:8080/HelloWebService/zenrest");
		
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		
		WebTarget target = client.target(uri);
		String plain = target.path("/zenhello")
		.request()
		.accept(MediaType.TEXT_PLAIN)
		.get(String.class);
		System.out.println(plain);
		
		String html = target.path("/zenhello/welcome")
				.request()
				.accept("text/html")
				.get(String.class);
				System.out.println(html);
				
				String xml = target.path("/zenhello/test")
						.request()
						.accept(MediaType.TEXT_XML)
						.get(String.class);
						System.out.println(xml);
		
		
		

	}

}
