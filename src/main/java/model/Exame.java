package model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Exame implements Serializable {

	private static final long serialVersionUID = 1092641945564228919L;

	private Long id;
	private String nomeExame;
	private String tipoExame;
	private String observacao;
	
	public Exame() {
	}

	public Exame(Long id, String nomeExame, String tipoExame, String observacao) {
		super();
		this.id = id;
		this.nomeExame = nomeExame;
		this.tipoExame = tipoExame;
		this.observacao = observacao;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeExame() {
		return nomeExame;
	}

	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}

	public String getTipoExame() {
		return tipoExame;
	}

	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	@Override
	public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("id", id)
                .append("nomeExame", nomeExame)
                .append("tipoExame", tipoExame)
                .append("observacao", observacao)
                .build();
	}
}
