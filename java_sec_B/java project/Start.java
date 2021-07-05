import java.lang.*;
import classes.*;
import fileio.*;
import java.util.Scanner;

public class Start
{
	public static void main(String args[])
	{
		Medicine m = new Medicine();
		EmployeeManagement em = new EmployeeManagement();
		CustomerAccount ca = new CustomerAccount();
		
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------------------------------");
		System.out.println("WelCome to XYZ Pharmacy...");
		System.out.println("-------------------------------------------");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Payment Management");
			System.out.println("\t3. Customer-Account Management");
			System.out.println("\t4. Medicine Shop Management");
			System.out.println("\t5. Exit");
			
			System.out.print("Your Choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Employee Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Search an Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
				
					System.out.print("Your Option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert New Employee");
							System.out.println("-------------------------------------------");
							
						    System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							
							System.out.print("Enter Employee Phone: ");
							String phone1 = sc.next();
							
							System.out.print("Enter Employee Email: ");
							String email1 = sc.next();
							
							System.out.print("Enter Employee NId: ");
							int empNid1 = sc.nextInt();
							
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpName(name1);
							e1.setPhone(phone1);
							e1.setEmail(email1);
							e1.setNid(empNid1);
							e1.setSalary(salary1);
							
							
							if(em.addEmployee(e1))
							{
								System.out.println("Employee Inserted.... EmpNId: " + e1.getNid());
							}
							else
							{
								System.out.println("Employee NOT Inserted.... EmpNId: " + e1.getNid());
							}
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove an Employee");
							System.out.println("-------------------------------------------");
						
							System.out.print("Enter Employee NId: ");
							int empNid2 = sc.nextInt();
							
							Employee e2 = em.searchEmployee(empNid2);
							
							if(e2 != null)
							{
								if(em.removeEmployee(e2))
								{
									System.out.println("Employee Removed.... EmpNId: " + empNid2);
								}
							}
							else
							{
								System.out.println("Employee NOT Removed.... EmpNId: " + empNid2);
							}
							break;
							
						case 3:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search an Employee");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Employee Id: ");
							int empNid3 = sc.nextInt();
							
							Employee e3 = em.searchEmployee(empNid3);
							
							if(e3 != null)
							{
								System.out.println("Employee Found......");
								System.out.println("Employee Name: " + e3.getEmpName());
								System.out.println("Employee Phone: " + e3.getPhone());
								System.out.println("Employee Email: " + e3.getEmail());
								System.out.println("Employee NID: " + e3.getNid());
								System.out.println("Employee Salary: " + e3.getSalary());
							}
							else
							{
								System.out.println("Employee NOT Found......");	
							}
							System.out.println();
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Employees");
							System.out.println("-------------------------------------------");
							
							em.showAllEmployee();
							
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							
							break;
							
						default:
						
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					break;
					
				case 2:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Payment Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. New Payment");
					System.out.println("\t2. Remove Payment History");
					System.out.println("\t3. Search a Payment");
					System.out.println("\t4. Show All Payments");
					System.out.println("\t5. Go Back");
					
					
					System.out.print("Your Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to New Payment");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Medicine Name: ");
							String medName1 = sc.next();
							System.out.print("Enter Amount: ");
							int amount1 = sc.nextInt();
							System.out.print("Enter Payment Id: ");
							int paymentId1 = sc.nextInt();
							System.out.print("Enter Account Id: ");
							int accountId1 = sc.nextInt();
							
							
							Payment p1 = new Payment(paymentId1, accountId1);
							
							if(ca.newPayment(medName1,amount1,p1))
							{
								System.out.println("Customer Inserted.... Payment Id: " + p1.getPaymentId());
							}
							else
							{
								System.out.println("Customer NOT Inserted.... Payment Id: " + p1.getPaymentId());
							}
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove Payment History");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Payment Id: ");
							int paymentId2 = sc.nextInt();
							System.out.print("Enter Account Id: ");
							int accountId2 = sc.nextInt();
							
							Payment p2 = new Payment(paymentId2, accountId2);
							
							if(ca.deletePaymentHistory(p2))
							{
								System.out.println("Payment History Deleted.... ");
							}
							else
							{
								System.out.println("Payment History Not found!!! ");
							}
							System.out.println();
							break;
							
						case 3:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search a Payment");
							System.out.println("-------------------------------------------");
							
							
							System.out.print("Enter Payment Id: ");
							int paymentId3 = sc.nextInt();
							
							Payment p3 = ca.searchPayment(paymentId3);
							
							if(p3 != null)
							{
								System.out.println("Payment Found......");
								System.out.println("Payment ID: " + p3.getPaymentId());
								System.out.println("Account ID: " + p3.getAccountId());
							}
							else
							{
								System.out.println("Payment NOT Found......");	
							}
							System.out.println();
						
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Payment");
							System.out.println("-------------------------------------------");
							
							ca.showDetails();
							
							System.out.print("Payment ID: ");
							int paymentId3 = sc.nextInt();
							
							Payment p4 = ca.searchPayment(paymentId3);
							
							if(p4 != null)
							{
								p4.showAllPayments();
							}
							else
							{
								System.out.println("Invalid ID....");
							}
							System.out.println();
				
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							
							break;
							
						default:
						
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					
					
					break;
					
				case 3:
				
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Customer-Account Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Create an Account for a Customer");
					System.out.println("\t2. Remove an Account of a Customer");
					System.out.println("\t3. Search an Account of a Customer");
					System.out.println("\t4. Show All Accounts of a Customer");
					System.out.println("\t5. Go Back");
					
					
					
					System.out.print("Your Option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert New Acount for Customer");
							System.out.println("-------------------------------------------");
							
						
							System.out.print("Customer Name: ");
                            String cusName1 = sc.next();
                            System.out.print("Customer Phone: ");
                            String phone1 = sc.next();
                            System.out.print("Customer email: ");
                            String email1 = sc.next();
                            System.out.print("Customer nid: ");
                            int nid1 = sc.nextint();
                            System.out.print("Customer accountId: ");
                            int accountId1 = sc.nextint();
							
							Customer c1 = new Payment(cusName1, phone1,email1,nid1,accountId1);
                           
                            if(ca.insertCustomer(c1))
                            {
                                System.out.println("Customer Inserted.... customer accountId: " + c1.getAccountId());
                            }
                            else
                            {
                                System.out.println("Customer NOT Inserted.... customer accountId: " + c1.getAccountId());
                            }
                            System.out.println();
                            break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove an Account for Customer");
							System.out.println("-------------------------------------------");
						
							System.out.print("Customer Name: ");
                            String cusName2 = sc.next();
                            System.out.print("Customer Phone: ");
                            String phone2 = sc.next();
                            System.out.print("Customer email: ");
                            String email2 = sc.next();
                            System.out.print("Customer nid: ");
                            int nid2 = sc.nextint();
                            System.out.print("Customer accountId: ");
                            int accountId2 = sc.nextint();
							
							Customer c2 = new Payment(cusName2, phone2,email2,nid2,accountId2);
                           
                            if(ca.removeCustomer(c2))
                            {
                                System.out.println("Customer removed....");
                            }
                            else
                            {
                                System.out.println("Customer NOT removed....");
                            }
                            System.out.println();
                            break;
							
						case 3:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search an Account for customer");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Customer NID: ");
							int nid3 = sc.nextInt();
							
							Customer c3 = ca.searchCustomer(nid3);
							
							if(c3 != null)
							{
								System.out.println("Customer Account Found......" + c3.showAllCustomer());
							}
							else
							{
								System.out.println("Customer account NOT Found......");	
							}
							System.out.println();
						
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Accounts of customer");
							System.out.println("-------------------------------------------");
							
							System.out.print("Customer NID: ");
							int nid4 = sc.nextInt();
							
							Customer c4 = ca.searchCustomer(nid4);
							
							if(c4 != null)
							{
								c4.showAllAccounts();
							}
							else
							{
								System.out.println("Invalid Customer....");
							}
							System.out.println();
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							
							break;
							
						default:
						
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					
					
					break;
					
				case 4:
				
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Medicine Shop Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Medicine");
					System.out.println("\t2. Remove Medicine");
					System.out.println("\t3. Search an Account of a Customer");
					System.out.println("\t4. Show All Accounts of a Customer");
					System.out.println("\t5. Go Back");
					
					System.out.print("Your Option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Deposit Money");
							System.out.println("-------------------------------------------");
						
							System.out.print("Customer NID: ");
							int nid1 = sc.nextInt();
							
							Customer c1 = b.searchCustomer(nid1);
							
							if(c1 != null)
							{
								System.out.print("Account Number: ");
								int an = sc.nextInt();
								
								Account a = c1.searchAccount(an);
								
								if(a != null)
								{
									System.out.println("Previous Balance: " + a.getBalance());
									System.out.print("Deposit Amount: ");
									double am = sc.nextDouble();
									if(a.deposit(am))
									{
										System.out.println("Deposit Done.....");
										String msg = "Deposit... "+ am + " in Account Number "+ a.getAccountNumber();
										frwd.writeInFile(msg);
									}
									else
									{
										System.out.println("Invalid Amount.....");
									}
									System.out.println("Current Balance: " + a.getBalance());
								}
								else
								{
									System.out.println("Invalid Account....");
								}
							}
							else
							{
								System.out.println("Invalid Customer....");
							}
							
						
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Withdraw Money");
							System.out.println("-------------------------------------------");
						
							System.out.print("Customer NID: ");
							int nid2 = sc.nextInt();
							
							Customer c2 = b.searchCustomer(nid2);
							
							if(c2 != null)
							{
								System.out.print("Account Number: ");
								int an = sc.nextInt();
								
								Account a = c2.searchAccount(an);
								
								if(a != null)
								{
									System.out.println("Previous Balance: " + a.getBalance());
									System.out.print("Withdraw Amount: ");
									double am = sc.nextDouble();
									if(a.withdraw(am))
									{
										System.out.println("Withdraw Done.....");
										String msg = "Withdraw... "+ am + " in Account Number "+ a.getAccountNumber();
										frwd.writeInFile(msg);
									}
									else
									{
										System.out.println("Invalid Amount.....");
									}
									System.out.println("Current Balance: " + a.getBalance());
								}
								else
								{
									System.out.println("Invalid Account....");
								}
							}
							else
							{
								System.out.println("Invalid Customer....");
							}
								
							break;
							
						case 3:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Transactions");
							System.out.println("-------------------------------------------");
							
							frwd.readFromFile();
							
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							
							break;
							
						default:
						
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					
					break;
					
				case 5:
					System.out.println("-------------------------------------------");
					System.out.println("You have chose to Exit");
					System.out.println("-------------------------------------------");
					
					repeat = false;
					
					break;
					
				default:
					System.out.println("-------------------------------------------");
					System.out.println("Invalid Choice...............");
					System.out.println("-------------------------------------------");
					break;
			}
		}
	}
}



