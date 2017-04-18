package co.com.foundation.javeriana.processor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

import org.apache.camel.Exchange;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class BpelAdapter {

	private static final String ENDPOINT = "http://localhost:9763/services/swift-business-process/";
	
	public void process(Exchange exchange)throws Exception {

		HttpClient client = HttpClientBuilder.create().build();

		HttpPost post = new HttpPost(ENDPOINT);

		StringEntity xmlEntity = new StringEntity(exchange.getIn().getBody(String.class));
		post.setEntity(xmlEntity);
		HttpResponse response = client.execute(post);

		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		
		while ((line = rd.readLine()) != null) {
			result.append(line);
			System.out.println(result);
		}

		exchange.getOut().setHeader("Content-Type", "application/xml");
		exchange.getOut().setBody( result );
		File file = new File("C:/AES-WS/body.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write(String.valueOf(result));
		bw.close();
		System.out.println("VALOR DE RESULT: " + result);
	}

}