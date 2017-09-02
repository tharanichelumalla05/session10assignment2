/*using fully qualified name  showing how the packages will work*/

package packagesdemo; //created package name as packagesdemo

 public class Car{ //created class as car
	              //classes are the basics of opps(object oriented programming)
	 public void speed(){ //created speed method
		 int speed = 150;//taking speed as 150
		 System.out.println("car has a property of speed ....");//system is used to return code
		                                                       //out is a static number
                                                             //Println is used to print text   and gives output 
		 System.out.println("car goes with a speed of :"+speed);//system is used to return code
		                                                         //out is a static number
                                                                //Println is used to print text and gives output 
	 
	 }
	  
		 public void milage( ){ //created milage  method
			//Here public is a access modifier which defines who can access this method
				//void is used to define return type of the method,void means method wont return any value
			 int  milage  =470;
			 System.out.println("car has another property called milage  ...."+milage);
			//system is used to return code
             //Println is used to print text car has another property called milage and gives output 
			 
		 } 
		  public void model(){ //  created four methods and declared their properties
			//Here public is a access modifier which defines who can access this method
				//Here static a keyword which identifies class related thing
				//void is used to define return type of the method,void means method wont return any value
			  String model = "Audi";
			  System.out.println("car model is"+ model);
			//system is used to return code
			  //out is a static number
              //Println is used to print text car model is  and gives output of car model
		  }
	  public void gears(){
		//Here public is a access modifier which defines who can access this method
			//Here static a keyword which identifies class related thing
			//void is used to define return type of the method,void means method wont return any value
		  System.out.println("car has 5 gears ....");
		//system is used to return code
		  //out is a static number
          //Println is used to print text car has 5 gears  and gives output 
	  }
	 
}