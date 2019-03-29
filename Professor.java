package ativ;
import java.util.Date;

public class Professor  {
	private Date admissao;
	private Pessoa pessoa;
	public Date getAdmissao() {
		return admissao;
	}

	public void setAdmissao() {
		this.admissao = new Date ();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
