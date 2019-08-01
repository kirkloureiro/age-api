package ws;

import javax.xml.ws.Endpoint;

public class EndpointStarter {

	public static void main(String[] args) {
		String url = "http://localhost:1212/exame";
		Endpoint.publish(url, new ExameWS());
		System.out.println("Service started @ " + url);
	}
}