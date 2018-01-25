import java.util.*;
public class Overload {
	private int length;
	private int bredth;
	private int height;
	public void setLength(int l) {
		length  = l;
}
	public int getLength() {
		return length;
	}
	public void setBredth(int b) {
		bredth=b;
}
	public int getBredth() {
		return bredth;
	}
	public void setHeight(int h) {
		height= h;
}
	public int getHeight() {
		return height;
	}
	
	public void area() {
		System.out.println("Area of the square");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the lenght");
		int len = sc.nextInt();
		setLength(len);
		int a1=len*len;
		System.out.println(a1);
		
		
	}
	public void area(int l,int b) {
		System.out.println("Area of the rectangle");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the lenght");
		int len = sc.nextInt();
		setLength(len);
		System.out.println("Please enter the bredth");
		int bre = sc.nextInt();
		setBredth(bre);
		int a1=len*bre;
		System.out.println(a1);
		
		
	}
	
}