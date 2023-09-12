
public class PruductApplicataionMain {

	public static void main(String[] args) {
		AccountInfo ainfo=new AccountInfo();
		AddressInfo addinfo=new AddressInfo();
		CustomerInfo custinfo=new CustomerInfo();
		
		System.out.println("*************Enter Customer Data********************");
		Customer custobj=custinfo.create();
		System.out.println("____________________________________________________");
		
		System.out.println("*************Enter Account Data******************** ");
		Account accobj=ainfo.create();
		System.out.println("____________________________________________________");
		
		System.out.println("************Enter Address Detials******************");
		Address addobj= addinfo.create();
		System.out.println("___________________________________________________");
		
		custinfo.display(custobj);
		ainfo.display(accobj);
		addinfo.display(addobj);
	}

}
