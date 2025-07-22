package EntityClassAssignment2;


public class ProductDemo {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.setName("Watch");
		p1.setPrice(5000);
		p1.setQuantity(3);
		
		System.out.println("Product 1");
		System.out.println("Name= "+ p1.getName());
		System.out.println("Price= "+ p1.getPrice());
		System.out.println("Quantity= "+ p1.getQuantity());
		System.out.println("-------------------------------");
		
		Product p2 = new Product();
		p2.setName("Bag");
		p2.setPrice(2000);
		p2.setQuantity(1);
		
		System.out.println("Product 2");
		System.out.println("Name= "+ p2.getName());
		System.out.println("Price= "+ p2.getPrice());
		System.out.println("Quantity= "+ p2.getQuantity());
		System.out.println("-------------------------------");
		
		Product p3 = new Product();
		p3.setName("Accessories");
		p3.setPrice(3000);
		p3.setQuantity(5);
		
		System.out.println("Product 3");
		System.out.println("Name= "+ p3.getName());
		System.out.println("Price= "+ p3.getPrice());
		System.out.println("Quantity= "+ p3.getQuantity());
		System.out.println("-------------------------------");
	}

}
