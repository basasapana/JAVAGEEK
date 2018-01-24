
public class Mainfile {

	public static void main(String[] args) {
		rFile rf= new rFile();
		rf.writefile();
		rf.reafFile();

		/*final Formatter x ;  // helps to create file
		try {
			x= new Formatter("emp.txt");
			System.out.println("File Created");
			x.format("%s%s%s","Basu","IT","20000");
			x.format("%s%s%s","Ram","Cashier","2000");
			x.format("%s%s%s","BOB","Manager","10000");
			x.close();
			rf.readfile();
		}catch(Exception e) {
			
			System.out.println("File not found");
		}*/

	}
	

}
