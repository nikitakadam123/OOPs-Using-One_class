import java.util.Date;

public class Bill {

	
	private double totalBill;
	private double cgst;
	double sgst;
	public Bill(double totalBill, double cgst, double sgst) {
		super();
		this.totalBill = totalBill;
		this.cgst = cgst;
		this.sgst = sgst;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	public double getCgst() {
		return cgst;
	}
	public void setCgst(double cgst) {
		this.cgst = cgst;
	}
	public double getSgst() {
		return sgst;
	}
	public void setSgst(double sgst) {
		this.sgst = sgst;
	}
	 
	//Date billDate;
	
	
	}

