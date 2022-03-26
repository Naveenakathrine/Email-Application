package EmailApp;
import java.util.Scanner;
import java.util.Random;
public class Email 
{

		public Scanner s = new Scanner(System.in);
		
		private String firstname;
		private String lastname;
		private String dept;
		private String email;
		private String password;
		private int mailboxcapacity = 800;
		private int defaultpasswordlength = 8;
		private String alteremail;
		private String company = "nkcompany.com";
		
		public Email(String firstname, String lastname) {
			this.firstname = firstname;
			this.lastname = lastname;
			System.out.println("NEW EMPLOYEE: " + this.firstname + " " + this.lastname);
			this.dept = this.setDept();
			System.out.println("DEPARTMENT: " + this.dept);
			this.password = randompassword(defaultpasswordlength);
			System.out.println("PASSWORD: " + this.password);
			email = firstname.toLowerCase() + lastname.toLowerCase() + "@" + dept +company;
			System.out.println("Your email is = "+ email);
        	
		}
		
		private String setDept() 
		{
			System.out.println(" DEPARTMENT CODES\n1 Sales\n2 Development\n3 Accounting\n Enter the department code = ");
			Scanner in =new Scanner(System.in);
			int depchoice = in.nextInt();
			if (depchoice == 1) {return"Sales";}
			else if (depchoice == 2) {return"Development";}
			else if (depchoice == 3) {return"Accounting";}
			else {return"";}
		}

		private String randompassword(int length)
		{
			Random r = new Random();
			String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnop0123456789";
			char[] password = new char[length];
			for (int i = 0; i < length; i++) 
			{
		    int rand = 	(int)(Math.random() *passwordset.length());
		    password[i] = passwordset.charAt(rand);
			}
		   return new String(password);
		 }
		
		
		
		public void set_password()
		{
			boolean flag = false;
			do {
				System.out.print("ARE YOU SURE YOU WANT TO CHANGE YOUR PASSWORD? (Y/N) : ");
				char choice = s.next().charAt(0);
				if (choice == 'Y' || choice == 'y') {
					flag = true;
					System.out.print("Enter current password: ");
					String temp = s.next();
					if (temp.equals(this.password)) {
						System.out.println("Enter new password: ");
						this.password = s.next();
						System.out.println("PASSWORD CHANGED SUCCESSFULLY!");
					} else {System.out.println("Incorrect Password!");}
				} else if (choice == 'N' || choice == 'n') {
					flag = true;
					System.out.println("PASSWORD CHANGE CANCELED!");
				} else {System.out.println("***ENTER A VALID CHOICE***");}
			} while (!flag);
		}
	
		
		
		public void set_mailCap()
		{
			System.out.println("Current capacity = " + this.mailboxcapacity + "mb");
			System.out.print("Enter new capacity: ");
			this.mailboxcapacity = s.nextInt();
			System.out.println("MAILBOX CAPACITY CHANGED SUCCESSFULLY!");
			
		}
  
	
	
		public void alternate_email() 
		{
			System.out.print("Enter new alternate email: ");
			this.alteremail = s.next();
			System.out.println("ALTERNATE EMAIL SET SUCCESSFULLY!");
		}
      
	
		public void showInfo()
		{
			
			System.out.println("NAME: " + this.firstname + " " + this.lastname);
			System.out.println("DEPARTMENT: " + this.dept);
		    System.out.println("EMAIL: " + this.email);
		    System.out.println("PASSWORD: " + this.password);
		    System.out.println("MAILBOX CAPACITY: " + this.mailboxcapacity + "mb");
			System.out.println("ALTER EMAIL: " + this.alteremail);
		}
	}