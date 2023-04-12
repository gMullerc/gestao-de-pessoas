package br.com.magnasistemas.entity.historico;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_HIST_DOCUMENTO_PROFISSIONAL")
public class HistoricoDocumentosProfissionais {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PK_DOCUMENTO_PROFISSIONAL")
	private Long id;
	@Column(unique = true)
	private String pis;
	@Column(unique = true)
	private String carteiraDeTrabalho;

	public HistoricoDocumentosProfissionais() {
		super();
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPis(String pis) {
		this.pis = pis;
	}

	public void setCarteiraDeTrabalho(String carteiraDeTrabalho) {
		this.carteiraDeTrabalho = carteiraDeTrabalho;
	}

	public Long getId() {
		return id;
	}

	public String getPis() {
		return pis;
	}

	public String getCarteiraDeTrabalho() {
		return carteiraDeTrabalho;
	}
}

