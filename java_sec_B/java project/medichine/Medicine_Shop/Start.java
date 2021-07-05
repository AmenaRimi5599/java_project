import java.lang.*;
import classes.*;
import fileio.*;
import java.util.Scanner;

public class Start
{
	public static void main(String args[])
	{
		EmployeeManagement em = new EmployeeManagement();
		CustomerAccount ca = new CustomerAccount();
		MedicineShop ms = new MedicineShop();
		Injection i = new Injection();
		
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
							Medicine med5 = ca.newPayment(medName1,amount1,p1);
							
							if(med5 != null)
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
							System.out.println("You have chose to See All Customers");
							System.out.println("-------------------------------------------");
							
							ca.showAllCustomer();
							
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
                            int nid1 = sc.nextInt();
                            System.out.print("Customer accountId: ");
                            int accountId1 = sc.nextInt();
                           
                            Customer c1 = new Customer(cusName1, phone1,email1,nid1,accountId1);
                          
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
                            int nid2 = sc.nextInt();
                            System.out.print("Customer accountId: ");
                            int accountId2 = sc.nextInt();
                           
                            Customer c2 = new Customer(cusName2, phone2,email2,nid2,accountId2);
                          
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
                                System.out.println("Customer Account Found......");
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
                           

                            ca.showAllCustomer();
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
					System.out.println("\t3. Search a Medicine");
					System.out.println("\t4. Show All Medicines");
					System.out.println("\t5. Go Back");
					
					System.out.print("Your Option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have choose to Insert New Medicine");
							System.out.println("-------------------------------------------");
							
						
							System.out.print("Medicine ID: ");
							int medID1 = sc.nextInt();
							System.out.print("Medicine Name: ");
							String medName1 = sc.next();
							System.out.print("Medicine Company: ");
							String medCompany1 = sc.next();
							System.out.print("Medicine Cost: ");
							int medCost1 = sc.nextInt();
							System.out.print("Medicine Group: ");
							String medGroup1 = sc.next();
							System.out.print("Medicine Type: ");
							String medType1 = sc.next();
							System.out.print("Medicine Quantity: ");
							int medQuantity1 = sc.nextInt();
							System.out.print("Medicine Volume: ");
							int volume1 = sc.nextInt();
							
							Injection I1 = new Injection(medID1, medName1, medCompany1, medCost1, medGroup1, medType1, medQuantity1, volume1);
							
							if(ms.insertMedicine(I1))
							{
								String msg = "Customer Inserted.... customer Medicine ID: " + I1.getMedID();
								frwd.writeInFile(msg);
							}
							else
							{
								System.out.println("Customer NOT Inserted.... customer Medicine Id: " + I1.getMedID());
							}
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove a Medicine");
							System.out.println("-------------------------------------------");
						
							System.out.print("Medicine ID: ");
							int medID2 = sc.nextInt();
							System.out.print("Medicine Name: ");
							String medName2 = sc.next();
							System.out.print("Medicine Company: ");
							String medCompany2 = sc.next();
							System.out.print("Medicine Cost: ");
							int medCost2 = sc.nextInt();
							System.out.print("Medicine Group: ");
							String medGroup2 = sc.next();
							System.out.print("Medicine Type: ");
							String medType2 = sc.next();
							System.out.print("Medicine Quantity: ");
							int medQuantity2 = sc.nextInt();
							System.out.print("Medicine Volume: ");
							int volume2 = sc.nextInt();
							
							Injection I2 = new Injection(medID2, medName2, medCompany2, medCost2, medGroup2, medType2, medQuantity2, volume2);
							 
							if(ms.removeMedicine(I2))
							{
								System.out.println("Medicine removed....");
							}
							else
							{
								System.out.println("Medicine NOT removed....");
							}
							System.out.println();
						
							break;
							
						case 3:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search a Medicine");
							System.out.println("-------------------------------------------");
							
							System.out.print("Medicine Name: ");
							String medName3 = sc.next();
							
							Medicine x2 = ms.searchMedicine(medName3);
						
							 
							if(x2 != null)
							{
								System.out.println("Medicine found....");
							}
							else
							{
								System.out.println("Medicine NOT not found....");
							}
							System.out.println();
							
							break;
						
						case 4:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search a Medicine");
							System.out.println("-------------------------------------------");
							
							System.out.print("Medicine Name: ");
							String medName4 = sc.next();
							
							Medicine x3 =ms.searchMedicine(medName4);
						
							 
							if(x3 != null)
							{
								System.out.println("Medicine found....");
							}
							else
							{
								System.out.println("Medicine NOT not found....");
							}
							System.out.println();
							
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Medicine");
							System.out.println("-------------------------------------------");
							
							ms.showAllMedicine();
							
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



