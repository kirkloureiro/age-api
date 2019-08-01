package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import model.Exame;
import ws.ExameWS;

public class ReadAction extends ActionSupport {
	
	private static final long serialVersionUID = -663032396763336141L;
	
	ExameWS exameService = new ExameWS();
	private Exame exame = new Exame();
	private String message;
	private List<Exame> exames = new ArrayList<>();

	@Override
	public String execute() throws Exception {
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
