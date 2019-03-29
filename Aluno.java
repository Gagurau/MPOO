package ativ;


public class Aluno {
	private int anoEntrada;
	private Pessoa pessoa;
	private int periodoEntrada;
	public int getPeriodoEntrada() {
		return periodoEntrada;
	}
	public void setPeriodoEntrada(int periodoEntrada) {
		this.periodoEntrada = periodoEntrada;
	}
	public int getAnoEntrada() {
		return anoEntrada;
	}
	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
