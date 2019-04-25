package mercadinho;

public class Gondola {
	private Prateleira[] prateleiras = new Prateleira[5];

	public Prateleira[] getPrateleiras() {
		return prateleiras;
	}

	public void setPrateleiras(Prateleira[] prateleiras) {
		this.prateleiras = prateleiras;
	}
	public void add(int index, Item item) {
		this.prateleiras[index].add(item);
	}
	public void remove(int index, Item item) {
		this.prateleiras[index].remove(item);
	}
}
