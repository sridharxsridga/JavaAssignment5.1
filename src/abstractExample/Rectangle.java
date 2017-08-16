/*
 * This class is implemented to find the area and perimeter of rectangle
 * 
 */

package abstractExample;

public class Rectangle extends Figure {

	private float length;
	private float width;

	Rectangle(float length,float width){
		this.length = length;  //initialising values
		this.width = width;
		
	}
	
	@Override
	void findArea() {  //Method to calculate area of rectangle and display 
		double area = length * width;
		System.out.println("Area of rectangle :" + area);

	}

	@Override
	void findPerimeter() {  //Method to calculate perimeter of rectangle and display 
		double perimeter = (2 * length) + (2 * width);
		System.out.println("Perimeter of rectangle :" + perimeter);

	}

	public float getLength() { //Getter method for length
		return length;
	}

	public void setLength(float length) {//Setter method for length
		this.length = length;
	}

	public float getWidth() {//Getter method for width
		return width;
	}

	public void setWidth(float width) { //Setter method for width
		this.width = width;
	}
	public String toString(){  // Overriding toString method of Object class to display length and width of rectangle
		return "Rectangle[Length:"+getLength() +" Width:"+getWidth()+"] ";
	}

}
