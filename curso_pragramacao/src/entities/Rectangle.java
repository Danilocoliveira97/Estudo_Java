package entities;

public class Rectangle {
	public double L ;
	public double A ;
	
	
	public double area() {
		return  L*A ;
	}
	public double perimeter() {
		return 2 *(L*A);
	}
	public double diagonaL(){
		return Math.sqrt(A*A + L * L);
	}
	

}
