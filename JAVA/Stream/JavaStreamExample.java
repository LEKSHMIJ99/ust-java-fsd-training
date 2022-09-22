package Stream;
import java.util.*;
import java.util.stream.Collectors;
 class Product{
	int id;
	String name;
	float price;
	public Product(int id,String name, float price) {
		this.id=id;
		this.name=name;
		this.price=price;
		
	}

}
 public class JavaStreamExample{
	 
 private static Collection<Product> productList;

public static void main(String[] args) {
	 List<Product>productsList=new ArrayList<Product>();
	 productsList.add(new Product(1,"hp laptop",25000f));
	 productsList.add(new Product(2,"dell laptop",30000f));
	 productsList.add(new Product(3,"lenevo",28000f));
	 productsList.add(new Product(4,"sony laptop",90000f));
	 productsList.add(new Product(5,"apple laptop",25000f));
	 Float totalPrice = productsList.stream().map(product->product.price).reduce(0.0f,(sum,price)->sum+price);
	 
	System.out.println(totalPrice);
	 
	
	
	
	float totalPrice2=productList.stream().map(product->product.price).reduce(0.0f,Float::sum);
	 System.out.println(totalPrice2);
 }
 }
	 
	 
 
