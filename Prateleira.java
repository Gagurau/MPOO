package mercadinho;

import java.util.ArrayList;

public class Prateleira {
	private int limit;
	private ArrayList<Item> itens = new ArrayList<Item>();
	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	public void add(Item item) {
		if (this.itens.size() < this.limit ) {
			this.itens.add(item);
			this.limit++;
		}
		else {
			System.out.println("Prateleira cheia.");
		}			
	}
	public void remove(Item item) {
		if (this.itens.contains(item)){
			this.itens.remove(item);
			this.limit --;
		}
		else {
			System.out.println("Item não encontrado");
		}
	}
}
