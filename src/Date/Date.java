package Date;
enum object {day , month , year}
/*
 * in this i have created the base file structure of the date but eventually focus the month format ho to convert the numeric month to  
 */
public class Date {
	
	int day;
	int month;
	int year;
	String [] monthl = {"Janary" , "February" , "March" , "April" , "May" ,"June", "July" , "August" , "September" , "October" , "November" , "December"};
	
	public Date (int day , int month , int year)
	{
		this.day = day;
		this.month= month;
		this.year = year;
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}
