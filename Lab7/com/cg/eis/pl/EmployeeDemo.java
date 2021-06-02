package  Lab7.com.cg.eis.pl;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Lab7.com.cg.eis.bean.Employee;

public class EmployeeDemo  extends Employee{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sm=new Scanner(System.in);
		HashMap<String,Employee> hmap=new HashMap<String,Employee>();
		HashMap<String,Integer> alist=new HashMap<String,Integer>();
		int choice;
		char ch='y';
		while(ch=='y') {
			System.out.print("\n1. Add Employee Details\n2. Display Employee Details Corresponding to Insurance Scheme\n3. Delete Employee Details\nEnter your choice : ");
			choice=sm.nextInt();
			switch(choice) {
			case 1 : System.out.print("Enter the number of employees : ");
					int numOfEmp=sm.nextInt();
					Employee emp[]=new Employee[numOfEmp];
					for(int i=0;i<numOfEmp;i++) {
						emp[i]=new Employee();
					}
					for(int i=0;i<numOfEmp;i++) {
						System.out.println("Enter id : ");
						emp[i].id=sm.nextInt();
						System.out.println("Enter name : ");
						emp[i].name=sm.next();
						System.out.println("Enter salary : ");
						emp[i].salary=sm.nextDouble();
						System.out.println("Enter designation : ");
						sm.nextLine();
						emp[i].designation=sm.nextLine();
						hmap.put(emp[i].getInsuranceScheme(), emp[i]);
						alist.put(emp[i].getInsuranceScheme(),emp[i].id);
						System.out.println();
					}
					System.out.println("Hash Map after adding employee details :\n");
					for(HashMap.Entry<String, Employee> m : hmap.entrySet()) {
						System.out.println(m.getValue());
					}
					break;
			case 2 : System.out.print("Enter the insurance scheme : ");
					sm.nextLine();
					String ins_scheme=sm.nextLine();
					System.out.print("The employee details for the given insurance scheme are :\n ");
					for(HashMap.Entry<String, Employee> m : hmap.entrySet()) {
						if(m.getKey().equalsIgnoreCase(ins_scheme))
						System.out.println(m.getValue());
					}
					break;
			case 3 :
					System.out.print("Enter the id of the employee you want to delete : ");
					int id=sm.nextInt();
					for(Map.Entry<String,Integer> m : alist.entrySet()) {
						if(m.getValue()==id)
						hmap.remove(m.getKey());
					}
					System.out.println("Hash Map after deleting employee details :\n");
					for(HashMap.Entry<String, Employee> m : hmap.entrySet()) {
						System.out.println(m.getValue());
					}
					break;
			default : System.out.println("Enter correct choice (1-3)....");
			}
			System.out.println();
			System.out.print("Do you want to continue?(y/n) ");
			ch=sm.next().charAt(0);
		}
		sm.close();
	}
}
