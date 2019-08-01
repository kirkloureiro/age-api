package ws;

import wsclient.ExameWSService;

public class EndpointClientSample {

	public static void main(String[] args) {
		ExameWSService service = new ExameWSService();
		wsclient.ExameWS exameWS = service.getExameWSPort();
		wsclient.ArrayList resultList = exameWS.readAllExams();
		System.out.println(resultList);
	}
}
