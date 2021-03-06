package action;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import model.Exame;
import ws.ExameWS;

public class CreateAction extends ActionSupport {

	private static final long serialVersionUID = 5402912957414641367L;
	
	private static final Logger logger = Logger.getLogger(CreateAction.class);
	
	private ExameWS exameService = new ExameWS();
	private Exame exame = new Exame();
	private String message;
	private List<Exame> exames = new ArrayList<>();

	@Override
	public String execute() throws Exception {
		logger.info("exame: " + exame);
		exameService.createExam(exame);
		this.exames = exameService.readAllExams();
		message = this.exames.toString();
		return super.execute();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}
	

	public List<Exame> getExames() {
		return exames;
	}

	public void setExames(List<Exame> exames) {
		this.exames = exames;
	}
}
