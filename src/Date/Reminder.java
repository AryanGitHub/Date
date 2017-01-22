package Date;


import java.util.StringTokenizer;
public class Reminder {

	String reminder;
	DateOprations date;
	
	public Reminder (String reminder , DateOprations date) {
		this.reminder = reminder;
		this.date = date;
	}

	public String getReminder() {
		return reminder;
	}

	public DateOprations getDate() {
		return date;
	}

	public void setReminder(String reminder) {
		this.reminder = reminder;
	}

	public void setDate(DateOprations date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return date.toString()+" ; "+this.reminder.toString();
	}

	public String showReminder() {
		return getDate().toString()+" ; "+getReminder();
	}
	
	public void addMoreReminder (String reminder){
		this.reminder += " ; " + reminder;
	}

	public void addSubReminder (String reminder){
		this.reminder += " ; (" + reminder +")";
	}
	
	public void deletReminder (int position){
		
		int value = 0;
		String[] store = reminder.split(" ; ");
		
	    while (value < store.length){
			
			if (value == position){
				if (value == 0) reminder = "";
				value++;
				continue;	
			}
			if (value == 0) reminder = "";
			
			
			reminder += store[value];
			
			if (value != store.length-1) reminder += " ; ";
			value ++;
		}
		
	
	}
	
	// current not working   !!!!!!!!!!!
	public void deletReminder (int[] input){
		
		int value = 0;
		int process = 0;
		
	   String[] store = reminder.split(" ; ");
		
	    while (value < store.length){
			
	    	while (process < input.length){
	    		
	    	
			if (value == input [process]){
				if (value == 0) reminder = "";
				value++;
				process ++;
				continue;	
			}
			process ++;
	    	}
			if (value == 0) reminder = "";
			
			
			reminder += store[value];
			
			if (value != store.length-1) reminder += " ; ";
			value ++;
		}
		
 
	    
	}
	
	


	
	public void deletAllReminder (){
			reminder = "";
	
	}
	
	
		
	}

