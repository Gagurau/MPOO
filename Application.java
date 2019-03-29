package ativ;
public class Application {

	public static void main(String[] args) {
		Aluno al = new Aluno();
		Professor pr = new Professor();
		Endereco end = new Endereco();
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		pessoa1.setCpf("2183181831");
		al.setAnoEntrada(2017);
		pessoa1.setNome("marcos");
		al.setPeriodoEntrada(2);
		pessoa2.setCpf("1923812");
		pessoa2.setNome("vinicius");
		pr.setAdmissao(); 
		end.setCidade("Petrolina");
		end.setComplemento("lagoa");
		end.setNumero(32);
		end.setRua("dois");
		Endereco end2 = new Endereco();
		end2.setCidade("Recife");
		end2.setComplemento("Estufa");
		end2.setNumero(286);
		end2.setRua("três");
		pessoa1.setEndereco(end);
		pessoa2.setEndereco(end2);
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa2.getEndereco());
	}

}
