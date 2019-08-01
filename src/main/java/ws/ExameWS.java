package ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import model.Exame;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class ExameWS {
	
	private static List<Exame> exames = new ArrayList<>();

	public void createExam(Exame exame) {
		// TODO Auto-generated method stub
		exame.setId(exames.size() + 1L);
		exames.add(exame);

	}
	
	public List<Exame> readAllExams() {
		return exames;
	}
	
	public void updateExam(Exame exame) {
		// TODO Auto-generated method stub
		
	}
	
	public void deleteExam(Long examId) {
		// TODO Auto-generated method stub
		
	}
}
