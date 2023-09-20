
public class BankApplicationMain {

	public static void main(String[] args) {
		CustomerInfo custinfo=new CustomerInfo();
		Customer custarr[]=custinfo.create();
		
		
		AddressInfo ainfo=new AddressInfo();
		Address addr=ainfo.create();
		
		
		AccountInfo accinfo=new AccountInfo();
		Account accarr[]=accinfo.accsept();
		
		custinfo.display(custarr);
		ainfo.display(addr);
		accinfo.show(accarr);
	
        
	}

}
