package A2;
import java.util.*;
import java.io.*;



public class Main {
	public static void main(String[] args) throws GendersException, AgesException, PassportsException, FlightssException, TypesException, FlightsException {
	
		try {
			FileWriter w = new FileWriter("info.txt");
			w.write("1 for Pakistan, ");
			w.write("2 for Iran, ");
			w.write("3 for China, ");
			w.write("4 for Afghanistan, ");
			w.write("5 for Iraq");
			w.close();
		}catch(IOException e)
		{
			System.out.println("Error Occured");
			e.printStackTrace();
		}
		
	String countries[]= {"Pakistan", "Iran", "China", "Afghanistan", "Iraq"};
		
	Scanner input = new Scanner(System.in); 
	Passengers arr[];
	arr =new Passengers[5];
	Flights flights[];
	flights =new Flights[5];
	
	for(int i=0;i<5;i++)
	{
		flights[i]=new Flights();
		flights[i].setOrigin(countries[i]);
		flights[i].setDestination(0);
		flights[i].setNumOfPassengers(0);
		flights[i].setDate(0, 0, 0);
		flights[i].setTravelDocumentId(i+1);
	}
	
	for(int i=0;i<5;i++)
	{
		arr[i]=new Passengers();
		System.out.println("Name:");
		String namen=input.next();
		arr[i].setName(namen);
		
		System.out.println("Gender; m= male, f= female");
		char gender=input.next().charAt(0);
		
		if(gender!='m' && gender!='f')
		{
			throw new GendersException("Invalid Gender");
		}
		else
		{
			arr[i].setGender(gender);
		}
		
		System.out.println("Age:");
		int a=input.nextInt();
		if(a<0 || a>100)   
		{
			throw new AgesException("Invalid Age");
		}
		else
		{
			arr[i].setAge(a);
		}
		
		System.out.println("Address:");
		String ad=input.next();
		arr[i].setAddress(ad);
		
		System.out.println("Passport number:");
		int p= input.nextInt();
		if(p<0 || p>999)
		{
			throw new PassportsException("Invalid Passport Number");
		}
		else
		{
			arr[i].setPnumber(p);
		}
		
		System.out.println("Destination:");
		
		try {
			FileReader r = new FileReader("info.txt");
			Scanner sc=new Scanner(r);
			while(sc.hasNextLine())
			{
				String d=sc.nextLine();
				System.out.println(d);
			}
			r.close();
		}catch(IOException e)
		{
			System.out.println("Error Occured");
			e.printStackTrace();
		}
		
		int k=0;
		int fli= input.nextInt();
		if(fli<1 || fli>5)
		{
			throw new FlightssException("Invalid flight");
		}
		else
		{
			for(int j=0;j<5;j++)
			{
				if(flights[j].getTravelDocumentId()==fli)
					 k=j;
			}
	
			if(flights[k].isFull()==0)
			{
				arr[i].setDestination(fli);
				flights[k].setNumOfPassengers(flights[k].getNumOfPassengers() + 1);
			}
			else
			{
				throw new FlightsException("No seats available");
			}
				
			
		}
		
		System.out.println("Type of plane: 1 or 2 ");
		int type= input.nextInt();
		if(type!=1 && type!=2)
		{
			throw new TypesException("Invalid plane type");
		}
		else
		{
			arr[i].setPType(type);
		}
		
		System.out.println("Destination:");
		int dest= input.nextInt();
		flights[k].setDestination(dest);
	}
	

	
	}

}

