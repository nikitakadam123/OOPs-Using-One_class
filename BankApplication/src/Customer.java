
public class Customer {
	
        
		private int custId;
        private String custName;
        private String adharNo;
		public Customer(int custId, String custName, String adharNo) {
			
			this.custId = custId;
			this.custName = custName;
			this.adharNo = adharNo;
		}
		public int getCustId() {
			return custId;
		}
		public void setCustId(int custId) {
			this.custId = custId;
		}
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		public String getAdharNo() {
			return adharNo;
		}
		public void setAdharNo(String adharNo) {
			this.adharNo = adharNo;
		}
        
        
        

}
