import java.util.Date;
public class EmpMain {

	public static void main(String[] args) {
		EmpInfo einfo=new EmpInfo();
		Employee emparr[]=einfo.create();
		einfo.display(emparr);
		// Instantiate a Date object
		      Date date = new Date();

	 // display time and date using toString()
		     System.out.println("\t\t"+date.toString()+"\t\t");
		     System.out.println("___________________________________________________________________________");

	}

}
