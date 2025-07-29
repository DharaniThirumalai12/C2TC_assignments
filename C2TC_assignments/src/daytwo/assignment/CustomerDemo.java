package daytwo.assignment;

import daytwo.Customer;

public class CustomerDemo {
	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setCid(101);
		c1.setName("Dharani");
		c1.setCity("Pondicherry");
		System.out.println(c1);
		Customer c2=new Customer();
		c2.setCid(102);
		c2.setName("Thirumalai");
		c2.setCity("Pondicherry");
		System.out.println(c2);
	System.out.println("The Id of Customer 1 is: "+ c1.getCid());
	System.out.println("The Name of Customer 2 is: "+ c2.getName());
	System.out.println("The City of Customer 2 is: "+ c2.getCity());
	}
}

