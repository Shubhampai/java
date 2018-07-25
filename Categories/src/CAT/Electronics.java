package CAT;

public class Electronics extends Department{

	public Integer price, dil=200;
	
	
	
	
	public Integer getPrice() {
		return price;
	}




	public void setPrice(Integer price) {
		this.price = price;
	}




	public Electronics(Integer price) {
		super();
		this.price = price;
	}



	@Override
	public void DepCat() {
		System.out.println("Department Category: Electronics");
		Integer i;
		i=this.price + this.dil;
		System.out.println("Amount: " +i);
		
	}





	

	
	
}
