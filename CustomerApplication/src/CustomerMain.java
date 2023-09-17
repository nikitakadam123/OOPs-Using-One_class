

public class CustomerMain {

	public static void main(String[] args) {
		
		CustomerInfo custinfo=new CustomerInfo();
		Customer custarr[]=custinfo.accept();
		custinfo.display(custarr);

		
	}

	
}
