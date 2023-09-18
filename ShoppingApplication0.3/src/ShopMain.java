
public class ShopMain {

	public static void main(String[] args) {
		ShopInfo sinfo=new ShopInfo();
		
		
		Customer custarr[]=sinfo.accept();
		sinfo.Billing(custarr, 0, null);
		sinfo.display(custarr);
		//Bill billObj = null;
		//Customer cust=null;
		//sinfo.display(cust,billObj);
	}

}
