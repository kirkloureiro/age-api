package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import model.Exame;
import ws.ExameWS;

public class DeleteAction extends ActionSupport {

	private static final long serialVersionUID = 8324535037569123941L;
	
	ExameWS exameService = new ExameWS();
	private Long exameId;
	private String message;
	private List<Exame> exames = new ArrayList<>();

	@Override
	public String execute() throws Exception {
		exameService.deleteExam(exameId);
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

	public Long getExameId() {
		return exameId;
	}

	public void setExameId(Long exameId) {
		this.exameId = exameId;
	}

	public List<Exame> getExames() {
		return exames;
	}

	public void setExames(List<Exame> exames) {
		this.exames = exames;
	}
}
