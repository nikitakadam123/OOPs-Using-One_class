import java.util.Date;

public class Bill {

	private int billNo;
	private double totalBill;
	private double cgst;
	double sgst;
	double finalTotal;
	Date billDate;
	
	public Bill(int billNo, double totalBill, double cgst, double sgst, double finalTotal, Date billDate) {
		super();
		this.billNo = billNo;
		this.totalBill = totalBill;
		this.cgst = cgst;
		this.sgst = sgst;
		this.finalTotal = finalTotal;
		this.billDate = billDate;
	}
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
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
	public double getFinalTotal() {
		return finalTotal;
	}
	public void setFinalTotal(double finalTotal) {
		this.finalTotal = finalTotal;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	
	
}
