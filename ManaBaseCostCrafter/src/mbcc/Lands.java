package mbcc;

public class Lands {
	
	private String name;
	private Integer cost;
	private Color colors;
	private int type;
	
	public Lands(String n, Integer c, Color col, int t) {
		this.name = n;
		this.cost = c;
		this.colors = col;
		this.type = t;
	}
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public Color getColors() {
		return colors;
	}
	public void setColors(Color colors) {
		this.colors = colors;
	}
	
}
