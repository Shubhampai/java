package CAT;

public class Computer extends Electronics{

	private String item_name;
	private String  Category_name;
	
	
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getCategory_name() {
		return Category_name;
	}
	public void setCategory_name(String category_name) {
		Category_name = category_name;
	}
	
	
	public Computer(Integer price,String item_name, String category_name) {
		super(price);
		this.item_name = item_name;
		Category_name = category_name;
	}
	
	
	
}
