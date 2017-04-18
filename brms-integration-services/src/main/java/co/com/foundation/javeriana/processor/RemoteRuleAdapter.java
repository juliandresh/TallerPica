package co.com.foundation.javeriana.processor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.camel.Exchange;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class RemoteRuleAdapter {

	private static final String ENDPOINT = "http://localhost:9292/kie-server/services/rest/server/containers/instances/maintenance-container";
	
	public void process(Exchange exchange)throws Exception {

		HttpClient client = HttpClientBuilder.create().build();

		HttpPost post = new HttpPost(ENDPOINT);

		post.setHeader("Content-Type", "application/xml");
		post.setHeader("Authorization", "Basic YnJtczpBZG1pbkAxMjM=");
		post.setHeader("X-KIE-ContentType", "XSTREAM");

		StringEntity xmlEntity = new StringEntity(exchange.getIn().getBody(String.class));
		post.setEntity(xmlEntity);
		HttpResponse response = client.execute(post);

		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}

		exchange.getOut().setHeader("Content-Type", "application/xml");
		exchange.getOut().setBody( result );
		System.out.println("VALOR DE RESULT: " + result);
	}

}