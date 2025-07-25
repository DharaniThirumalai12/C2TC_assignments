package assignment2.entity;

public class Main {
	    public static void main(String[] args) {
	        // Creating Student object
	        Student s1 = new Student();

	        // Creating Commission object
	        Commission obj = new Commission();
	        obj.acceptDetails("Dhaaru", "Puducherry", "9876543210", 75000);
	        obj.calculateCommission();
	    }
}
