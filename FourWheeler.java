/*
 * If we use fully qualified name then only we can declare  the class of this package will be 
 * accessible.
 * here there is no need to import. but we have to use fully qualified name every time when  access the class or interface
 * It is generally used when two packages have same class name e.g. java.util and java.sql packages contain Date class.
 */
package mypackage3;//here i have created another package called mypackage3
                  //classes are the basics of opps(object oriented programming)

public class FourWheeler {         //created main class  name as FourWheeler
	                       //classes are the basics of opps(object oriented programming)
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
					//Here public is a access modifier which defines who can access this method
					//Here static a keyword which identifies class related thing
					//void is used to define return type of the method,void means method wont return any value
					//main is name of method,and to display
					//declares method String[]
					//String[]args means arguments will be passed into main method and says that main() as a parameter
		System.out.println("The Properties of a four wheeler are :"); 
		//system is used to return code
		//out is a static number
        //Println is used to print text the properties of a four wheeler are and gives output 
		//prints the properties of a car 
		
		packagesdemo.Car car = new packagesdemo.Car(); //here created fully qualified name to access the object of the class Bike from package as packagesdemo
              
		car.gears();  //displays the get methods for the objects provided
		car.milage();//displayd milage
		car.speed();//displays speed
		car.model();//displays model
		
	}

}

