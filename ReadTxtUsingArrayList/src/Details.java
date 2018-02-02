import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class Details {

	
	ArrayList<MainFunction> list;
	
	public static void main(String[] args) throws IOException {
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US); 
		String fName = "First Name", lName = "Last Name", //column name in variable for formating purpose
				DOB = "DOB", Position = "Position", Salary = "Salary";
		

	File file = new File("C:\\Users\\BASUDEV\\eclipse-workspace\\ReadTxtUsingArrayList\\empFile.txt");
	FileReader fr = new FileReader(file);
	BufferedReader br =new BufferedReader(fr);
	String data;
	int count=0;
	Details ds = new Details();
	Scanner ca= new Scanner(System.in);
	System.out.println("Please enter 1 to display salary less then 10000\n");
	System.out.println("Please enter the number 2 to display salary more then 10000");
	int choice = ca.nextInt();
	top(fName,lName,DOB,Position,Salary);
	ArrayList<MainFunction> list=new ArrayList<MainFunction>(5);
	while((data =br.readLine())!=null) {
		String[] tokens =data.split(",");		
		
		list.add(new MainFunction(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4]));	
				
		
		double salary = list.get(count).getSalary();
	
		if(choice>2)break;
		if(choice==1) {
			
				ds.displayEmployeeList(list, count, us);
			}else  if(choice==2){
				if(salary>=10000) {

				ds.displayEmployeeList(list, count, us);
			}
		}
		count++;
	}
	
	button();
	br.close();
	}

	
	private void displayEmployeeList(ArrayList<MainFunction> list2, int count1,NumberFormat us) {
		// TODO Auto-generated method stub
		System.out.printf("%-13s",list2.get(count1).getfName());
		System.out.printf("%-17s",list2.get(count1).getlName());
		System.out.printf("%-17s",list2.get(count1).getDOB());
		System.out.printf("%-15s",list2.get(count1).getPosition());
		System.out.printf("%-19s",us.format(list2.get(count1).getSalary()));
		System.out.println("\n");
	}

	public static void top(String fName, String lName, String dob, String job, String salary){
		System.out.print("__________________________________________");
		System.out.print("__________________________________________\n");
		System.out.printf("%-13s | %-13s | %-12s | %-15s | %11s |%n",
							 fName, lName, dob, job, salary );
		System.out.print("__________________________________________");
		System.out.print("__________________________________________\n");
	}
	public static void button() {
		System.out.print("__________________________________________");
		System.out.print("__________________________________________\n");
	}
}
