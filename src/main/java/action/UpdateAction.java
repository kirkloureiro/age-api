package action;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import model.Exame;
import ws.ExameWS;

public class UpdateAction extends ActionSupport {

	private static final long serialVersionUID = 8205280022229265122L;

	private static final Logger logger = Logger.getLogger(UpdateAction.class);
	
	ExameWS exameService = new ExameWS();
	private Exame exame = new Exame();
	private String message;
	private List<Exame> exames = new ArrayList<>();

	@Override
	public String execute() throws Exception {
		logger.info("exame: " + exame);
		exameService.updateExam(exame);
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
