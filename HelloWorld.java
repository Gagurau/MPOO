import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
	Date data = new Date();
	String hora = new SimpleDateFormat("HH:mm:ss").format(data);
	
	private String nome;
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void imprimir() {
		System.out.println(hora + " Olá, " + this.getNome() + ". Você acabou de fazer o seu primeiro Hello World em Java. Parabéns");
	}
	
}
