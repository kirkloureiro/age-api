package ws;

import java.util.ArrayList;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import dao.ExameDao;
import model.Exame;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class ExameWS {
	
	ExameDao exameDao = new ExameDao();
	
	public void createExam(Exame exame) {
		exameDao.createExam(exame);
	}
	
	public ArrayList<Exame> readAllExams() {
		return (ArrayList<Exame>) exameDao.readAllExams();
	}
	
	public void updateExam(Exame exame) {
		exameDao.updateExam(exame);		
	}
	
	public void deleteExam(Long examId) {
		exameDao.deleteExam(examId);		
	}
}
