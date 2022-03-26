package EmailApp;

import java.util.Scanner;
public class EmailMain
 {

			public static void main(String[] args) 
			{
				Scanner s = new Scanner(System.in);
			
				Email emp1 = new Email("Naveena","Kathrine");
				
				int choice = -1;
				do {
					System.out.println("\nENTER YOUR CHOICE\n1.Show Info\n2.Change Password"
							+ "\n3.Change Mailbox Capacity\n4.Set Alternate Email\n5.Exit");
					choice = s.nextInt();
					switch(choice) 
					{
					case 1:
						emp1.showInfo();
						break;
					case 2:
						emp1.set_password();
						break;
					case 3:
						emp1.set_mailCap();
						break;
					case 4:
						emp1.alternate_email(); 
						break;
					case 5:
						System.out.println("\nTHANKS!!!");
						break;
					default:
						System.out.println("INVALID CHOICE! ENTER AGAIN!");
					}
					
				}while(choice!=5); 
			}
       }
