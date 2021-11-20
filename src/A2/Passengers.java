package A2;

import java.util.Scanner;


public class Passengers {
	String name;
	char gender;
	int age;
	String address;
	int passportNumber;
	int destination;
	int typeOfPlane;


	Passengers(){
	name="abc";
	gender='0';
	age=0;
	address="/0";
	passportNumber=0;
	destination=0;
	typeOfPlane=0;

	}


    public void setName(String a)
    {
    	name=a;
    }
    
    public void setGender(char a)
    {
    	gender=a;
    }
    
    public void setAge(int a)
    {
    	age=a;
    }
    
    public void setAddress(String a)
    {
    	address=a;
    }
    

	public void setPnumber(int a) {
	
		passportNumber=a;
	}
    
	public void setDestination(int a) {
		
		destination=a;
	}

	public void setPType(int a) {
		typeOfPlane=a;
	}

	
}
