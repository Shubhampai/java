package CAT;

public class Women_cloth extends Clothing {
	private String item_name;
	private String Category;
	
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public Women_cloth(Integer price, String item_name, String category) {
		super(price);
		this.item_name = item_name;
		Category = category;
	}
	
	
}
