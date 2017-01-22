package Date;
enum Object {day , month , year}
public class DateOprations extends Date {
	int [] monthw = {0 ,31,28,31,30,31,30,31,31,30,31,30,31};
	/*
	 * programs to make are as follow:-
	 * 
	 * below date (done onlt the day part)
	 * addMonth
	 * subMonth
	 * addYear
	 * subYear
	 *future planing is storen in a image found in ("C:\Users\ARYAN\Desktop\Developer\future.png") 
	 * modify subDay but first make subDay with another name and then make the program and then replace it........ 
	 */
	
	
  // for the easy method invalid is made....
	int invalidDay = (Integer) 0;
	int invalidMonth= (Integer) 0; 
	int invalidYear = (Integer) 0;

	public DateOprations(int day, int month, int year) {
		super(day, month, year);
		
		
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
		
		invalidDay = day;
		invalidMonth = month;
		invalidYear = year;
		
	}

	public boolean findLeap (){
		boolean value = false;
		if ((this.getYear()%4 == 0 && this.getYear() % 100 != 0) || (this.getYear() % 400 == 0)){
			value = true;
		}
		if (this.getYear()%4 != 0){
			value = false;
		}
		return value;
	}
	public boolean vaildDate(Object input){
		boolean value =false;
		if (input == Object.year ){
			if (this.year < 0){
				value = true;
			}
		}
		if (input == Object.month ){  
			if (this.month >= 12 && this.month > 0 ){
				value = true;
			}
		}
		if (input == Object.day ){
			this.takeLeap();
			if (this.day > 0 && this.day <= monthw [this.month]){
				value = true;
			}
		}
		
		return value;
	}
	public boolean equalDate (Date input){
		boolean value  = false;
		
		if (this.day == input.day && this.month == input.month && this.year == input.year){
			value = true;
		}
		return value;
	}
	
	public boolean notEqualDate (Date input){
		boolean value  = true;
		
		if (this.day == input.day && this.month == input.month && this.year == input.year){
			value = false;
		}
		return value;
	}
	
	
	public boolean lessThanDate (Date input){
		boolean value  = false;
		
		if (this.day < input.day || this.month < input.month || this.year < input.year){
			value = true;
		}
		return value;
	}
	
	public boolean moreThanDate (Date input){
		boolean value  = false;
		
		if (this.day > input.day || this.month > input.month || this.year > input.year){
			value = true;
		}
		return value;
	}
	

	
	
	public void takeLeap (){
// This is program (method) of some small coding which is necessary for the method ABOVELIMIT();
		// this is a program in which 1 day is added when there is a leap year.........
		if (this.findLeap()){
			monthw [2] = 29;
		}
		if (this.findLeap() == false){
			monthw [2] = 28;
		}
	
		
	}
	
       
	
	
	public void aboveLimit (Object object){

		if (object == Object.month){
			if (this.month > 12){
				year += month / 12;
				this.month = month%12;
			}
		}

		if (object == Object.day){
			
			this.takeLeap();
			while (day > monthw[month]){
			  this.takeLeap();
				day -= monthw[month];
				month++;
				
				if (month > 12){ 
					month = 1 ;
					year+= 1;
				   }
				
				}
		}
	}
		
	public int monthLimitater (int input, boolean tune){
		
		if (tune){
		while (input > 0){
			this.month --;
			input --;
			
			if (this.month <= 0){
				
				this.month = 12;
				year--;
			}
			
		}
		
		
		return this.month;
		}
		
		else{
			int value = this.month;
			while (input > 0){
				value --;
				input --;
				
				if (value <= 0){
					
					value = 12;
					
				}
				
			}
			
			
			return value;
			}
		
			
		
	}
	
	public void belowLimit (Object object){
       int input = Math.abs(this.month);
		if (object == Object.month){
			if (this.month < 0){
			this.month = 12;
			this.year -= 1;
			this.monthLimitater(input, true);
		}
		}
		if (object == Object.day){

			int differenceInMonth = 1;
			boolean makeDifference = false;
			this.takeLeap();
			
			while  (this.day < 0){
				makeDifference = true;
				int value = Math.abs(this.day);
				this.day +=  monthw [this.monthLimitater(differenceInMonth , false)];
				
				  if ( value > monthw [this.monthLimitater(differenceInMonth , false)] )  differenceInMonth++;
				  
				  
			}
			
			if (makeDifference)this.monthLimitater(differenceInMonth , true);
			if (this.day == 0) {
				this.day = monthw [this.monthLimitater(1, true)] ;
			  }
		}
		}
		
		
		
	

		
	
	public void setDay(int day){
		Object input = Object.day;
		 this.day = day;
		this.aboveLimit(input);
		this.belowLimit(input);
		// may contain belowLimit
		
	}
	
	public void setMonth(int month){
		Object input = Object.month;
		 this.month = month;
		 this.belowLimit(input);
		 this.aboveLimit(input);
	}
	public void setYear(int year)
	{
		this.year = year;
		if (year <= 0){
			this.year = 1;
		}
	}
	
	public int getInvalidDay() {
		return invalidDay;
	}

	public int getInvalidMonth() {
		return invalidMonth;
	}

	public int getInvalidYear() {
		return invalidYear;
	}
	// maike seeter of invaid date;

	public long getRank (){
		long rank = 0;
		DateOprations data = new DateOprations(1, 1, 1);
		while (this.notEqualDate(data)){
			data.addDay(1);
			rank++;
		}
		return rank;
		
	}
	
	
	public String getWeeksnName (){
		Day data = new Day (this);
		return data.getDay();
		
	}

	public void addDay(int day){
    day += this.day;
    this.takeLeap();
    this.setDay(day);
	}
	
	public String toString (){
		return getDay()+"/"+getMonth()+"/"+getYear();
	}
	public String toString (String breaker){
		return getDay()+breaker+getMonth()+breaker+getYear();
	}
	
	public void subDay(int input){
	   
		while (input > 0){
			this.takeLeap();
	    	if (input < this.day){
				day -= input;
				input = 0;
			}
			if (input == this.day){
				day -= input;
				input = 0;
				month--;
				if (this.month < 1 ){
					year--;
					month = 12;
				}
				this.day = monthw [this.month];
			}
			
			
			if (input > this.day){
			if (this.day != monthw [this.month])
			{
				input -= this.day; 
				this.day -= this.day;
				month --;
				if (this.month < 1 ) {
					year--;
					month = 12;
				}
				day = monthw [this.month];
				continue;
			}
			if (this.day == monthw [this.month]){
			input -=  monthw [this.month];
			day -= monthw [this.month];
			month --;
			if (this.month < 1 ) {
				year -= 1;
				month = 12;
			}
			day = monthw [this.month];
			}
	
		}

		}
		
	
	
  }
	// function currently is working 
	public int[] differences(DateOprations [] date){
		
		int process = 0;
		int change = 0; 
		int [] changesArray = new int [date.length];
		DateOprations snapShort = new DateOprations(this.getDay(), this.getMonth(), this.getYear());
		while (process < date.length){
			if (this.lessThanDate(date [process])){
				while (this.notEqualDate(date [process])){
					this.addDay(1);
					change ++;
				}
				
			}
			
			else if (this.moreThanDate(date [process])){
				while (this.notEqualDate(date [process])){
					this.subDay(1);
					change ++;
				}
				
				
			}
			changesArray [process] = change;
			change = 0;
			process ++;
			
			this.setDay(snapShort.getDay());
			this.setMonth(snapShort.getMonth());
			this.setYear(snapShort.getYear());
		}
		change = 0;
        process = 0;
        
        
        return changesArray;
        
        
  /*      while (process < changesArray.length){
        	
        	if (changesArray[change] > changesArray [process]){
				change = process;
			}
        	process++;
        }
	    return date[change];*/
	
	}
	
	public DateOprations nearest (DateOprations [] date){
		int [] changesArray = this.differences(date);
		int process = 0;
		int change = 0;
      while (process < changesArray.length){
        	
        	if (changesArray[change] > changesArray [process]){
				change = process;
			}
        	process++;
        }
	    return date[change];
		
		
	}
	public DateOprations farest (DateOprations [] date){
		int [] changesArray = this.differences(date);
		int process = 0;
		int change = 0;
      while (process < changesArray.length){
        	
        	if (changesArray[change] < changesArray [process]){
				change = process;
			}
        	process++;
        }
	    return date[change];
		
		
	}
}