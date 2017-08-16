/*
 * This class is implemented to find the perimeter and area of circle
 * 
 */

package abstractExample;

public class Circle extends Figure {
	private float radius;
	
	Circle(float radius){   
		this.radius = radius; //assigning radius
	}

	@Override
	void findArea() {   //Method to calculate area of circle and display 
		double area = Math.PI * Math.pow(radius, 2);  //area=pi*r*r
		System.out.println("Area of circle :" + area);
	}

	@Override
	void findPerimeter() {  //Method to calculate perimeter of circle and display 
		double perimeter = 2 *Math.PI * radius;   //perimeter = 2*pi*r
		System.out.println("Perimeter of circle :" + perimeter);
	}

	public float getRadius() {  //Getter method for radius
		return radius;
	}

	public void setRadius(float radius) {  //Setter method for radius
		this.radius = radius;
	}
	
	public String toString(){  // Overriding toString method of Object class to display radius
		return "Circle[Radius:"+getRadius()+"] ";
	}


}
