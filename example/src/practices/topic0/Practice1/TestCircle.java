package practice1;

public class TestCircle {        // save as "TestCircle.java"
   public static void main(String[] args) {
      // Declare and allocate an instance of class Circle called c1
      //  with default radius and color
      Circle c1 = new Circle();
      // Use the dot operator to invoke methods of instance c1.
      System.out.println("The circle has radius of " 
         + c1.getRadius() + " and area of " + c1.getArea());
   
      // Declare and allocate an instance of class circle called c2
      //  with the given radius and default color
      Circle c2 = new Circle(2.0);
      // Use the dot operator to invoke methods of instance c2.
      System.out.println("The circle has radius of " 
         + c2.getRadius() + " and area of " + c2.getArea());
      
     /* Exercise 1.1.1 and 1.1.2 trying new constructor and testing getColor() method. */ 
     
     // Declaration and allocation of an instance of class circle called c3
     // with the given radius and color
     Circle c33 = new Circle(3.0, "Green");	
     System.out.println("The circle has radius of "
    		  + c33.getRadius() + " and its color is "+ c33.getColor());
      
     /* Exercise 1.1.3 */
     
     //	System.out.println(c1.radius);
     // System.out.println(c1.radius=5.0);
     
     /*
        EXPLANATION OF THE ERROR: The cause of the error is that although we have created an instance of a Circle, both variables
        are private in class Circle and are not visible from an external class (TestCircle). So if we need to modify
        them after we have created the instance, we need create a new method to set private variables into Circle class.
      */
     
     Circle c3 = new Circle();   // construct an instance of Circle
     c3.setRadius(5.0);          // change radius
     c3.setColor("Green");       // change color
     
     
     /* Exercise 1.1.6 */
     System.out.println(c3.toString()); // Explicit call to method toString()
     System.out.println(c3);			// Implicit call to method toString()
   }
}