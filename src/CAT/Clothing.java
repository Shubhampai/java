package CAT;

public class Clothing extends Department{

 Integer price,dil=100; 
 
	
	
	public Integer getPrice() {
	return price;
}


public void setPrice(Integer price) {
	this.price = price;
}





	public Clothing(Integer price) {
		super();
		this.price = price;
	}

	


	@Override
	public void DepCat() {
	System.out.println("Department Category: Clothing");
	Integer i;
	i= this.price + this.dil;
		System.out.println("Amount: " +i);
	}

}
