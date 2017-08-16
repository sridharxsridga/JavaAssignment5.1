/*
 *  This class is implemented to find the area and perimeter of triangle 
 * 
 */


package abstractExample;

public class Triangle extends Figure {
	private float side1;
	private float side2;
	private float side3;
	
	Triangle(float side1 , float side2,float side3){
		
		this.side1 = side1;  //initialising values
		this.side2 = side2;
		this.side3 = side3;
		
		
	}
	@Override
	void findArea() {  // implementing Hero's formula for calculating area of triangle and display the area
		double semiPerimeter = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
		System.out.println("Area of Triangle :" + area);

	}

	@Override
	void findPerimeter() { //Method to calculate perimeter of triangle and display
		float perimeter = (side1 + side2 + side3) ;
		System.out.println("Perimeter of Triangle :" + perimeter);
	}

	public float getSide1() {  //Getter method for side1
		return side1;
	}

	public void setSide1(float side1) { //Setter method for side1
		this.side1 = side1;
	}

	public float getSide2() { //Getter method for side2
		return side2;
	}

	public void setSide2(float side2) {//Setter method for side2
		this.side2 = side2;
	}

	public float getSide3() { //Getter method for side3
		return side3;
	}

	public void setSide3(float side3) {//Setter method for side3
		this.side3 = side3;
	}
	
	public String toString(){  // Overriding toString method of Object class to display side os triangle
		return "Triangle[Side1:"+getSide1() +" Side2:"+getSide2()+" side3:"+getSide3() +"] ";
	}

}
