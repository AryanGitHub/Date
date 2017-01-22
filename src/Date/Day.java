package Date;

public class Day {
	
	String days [] = { "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday" , "Sunday" };
	DateOprations day;
	
	public Day( DateOprations day) {
		
		this.day = day;
	}

	
	public String getDay (){
		return days[(int) (day.getRank()% 7)];
	}
	
	public String toString (){
		return day.toString()+" ("+getDay()+")";
	}
	
	
	

}
