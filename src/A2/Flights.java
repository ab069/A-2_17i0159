package A2;

public class Flights {
	private String origin;
	private int destination;
	private int numberOfPassengers;
	private Dates flightDate;
	private int travelDocumentId;

	Flights()
	{
		origin="/0";
		destination=0;
		numberOfPassengers=0;
		flightDate=new Dates();
		flightDate.setDay(0);
		flightDate.setMonth(0);
		flightDate.setYear(0);
		travelDocumentId=0;
	}
	
	public int isFull()
	{
		if (numberOfPassengers==150)
		{
			return 1;
		}		
		else
		{
			return 0;
		}
	}
  
	public void setTravelDocumentId(int a)
	{
		travelDocumentId=a;
	}
	
	public void setOrigin(String a)
	{
		origin=a;
	}
	
	public void setNumOfPassengers(int a)
	{
		numberOfPassengers=a;
	}

    public void setDate(int a, int b, int c) {
	flightDate.setDay(0);
	flightDate.setMonth(0);
	flightDate.setYear(0);
	}

	public void setDestination(int a) {
		destination=a;
	}
	

	
	public int getTravelDocumentId()
	{
		return travelDocumentId;
	}
	
	public int getNumOfPassengers()
	{
		return numberOfPassengers;
	}
}
