package action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import model.Exame;
import ws.ExameWS;

public class CreateAction extends ActionSupport {

	private static final long serialVersionUID = 5402912957414641367L;
	
	private static final Logger logger = Logger.getLogger(CreateAction.class);
	
	ExameWS exameService = new ExameWS();
	private Exame exame = new Exame();
	private String message;

	@Override
	public String execute() throws Exception {
		logger.info("Passei: " + exame);
		exameService.createExam(exame);
		message = exameService.readAllExams().toString();
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
}
