import java.io.*;
import java.util.*;
public class rFile {
	private Scanner x;
	public void writefile() {
		final Formatter x ;  // helps to create file
		try {
			x= new Formatter("emp.txt");
			System.out.println("File Created");
			x.format("%s %s %s \n","Basu","IT","20000");
			x.format("%s %s %s \n","Ram","Cashier","200000");
			x.format("%s %s %s \n","BOB","Manager","10000");
			x.close();
			
		}catch(Exception e) {
			
			System.out.println("File not found");
		}
	}
		
		
	public void reafFile() {
		
		try {
			x = new Scanner(new File("emp.txt"));
			while(x.hasNext())
			{
				String name = x.next();
				String position = x.next();
				int salary=Integer.parseInt(x.next());
				
				if(salary > 10000)
				{
					System.out.printf("the name of the person and position %s %s %s\n " ,name ,position ,salary);
				}
				else {
					System.out.printf("The person with less salary is %s %s %s" ,name,position,salary);
				}
			}
			x.close();
			
		}catch(Exception e)
		{
			System.out.println("Error");
		}
		
	}
	
}
