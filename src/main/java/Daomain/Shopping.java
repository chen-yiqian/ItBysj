package Daomain;


public class Shopping
{
	
	private int id;
	private String no;
	public Food food;
	public Shopping(){
		super();
	}

	public Shopping(int id, String no, Food food) {
		this.id = id;
		this.no = no;
		this.food = food;
	}

	public Shopping(String no, Food food) {
		this.no = no;
		this.food = food;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}
}

