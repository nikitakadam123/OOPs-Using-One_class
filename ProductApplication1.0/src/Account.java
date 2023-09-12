
public class Account {
          private int accNo;
          private String AccType;
          private double accBal;
		public Account(int accNo, String accType, double accBal) {
			super();
			this.accNo = accNo;
			AccType = accType;
			this.accBal = accBal;
		}
		public int getAccNo() {
			return accNo;
		}
		public void setAccNo(int accNo) {
			this.accNo = accNo;
		}
		public String getAccType() {
			return AccType;
		}
		public void setAccType(String accType) {
			AccType = accType;
		}
		public double getAccBal() {
			return accBal;
		}
		public void setAccBal(double accBal) {
			this.accBal = accBal;
		}
          
}
