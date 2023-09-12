import java.util.Scanner;
public class AccountMain {

	public static void main(String[] args) {
		
		
		AccountInfo ainfo = new AccountInfo();
		Account aobj=ainfo.accept();
		ainfo.display(aobj);
		
	}

}
