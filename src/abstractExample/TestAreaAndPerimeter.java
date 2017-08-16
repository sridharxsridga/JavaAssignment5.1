/*
 * This class is implemented to display the area and perimeter of rectangle, triangle and cirlce
 */

package abstractExample;

public class TestAreaAndPerimeter {

	public static void main(String[] args) {
		Circle circle = new Circle(12);//creating object of circle class
		System.out.println("\t\t\tCircle Details");
		System.out.println(circle);  //printing object to get circle details
		circle.findArea();  //print area of circle
		circle.findPerimeter(); //print perimeter of circle
		
		Triangle triangle= new Triangle(12,45,23); //creating object of triangle class
		System.out.println("\t\t\tTriangle Details");
		System.out.println("\n"+triangle);//printing object to get triangle details
		triangle.findArea();//print area of triangle
		triangle.findPerimeter(); //print perimeter of triangle
		
		Rectangle rectangle = new Rectangle(23,54); //creating object of rectangle class
		System.out.println("\t\t\tRectangle  Details");
		System.out.println("\n"+rectangle);//printing object to get rectangle details
		rectangle.findArea();//print area of triangle
		rectangle.findPerimeter();//print perimeter of triangle
		

	}

}
