package Assignment1;


public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer obj  = new Customer(1,"Deepak",21,"Jodhpur",342001);
		obj.printDetail();
		
		System.out.println("Changing name for = " + obj.getName());
		obj.setName("agarwal");
		obj.getName();
		
		obj.printDetail();
		
	}

}
