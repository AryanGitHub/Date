package Date;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Scanner;
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int day , mon , year;
		
        Scanner input = new Scanner (System.in);
        Scanner input1 = new Scanner (System.in);
        System.out.println("Enter 1st date.");
        day = input.nextInt();
        mon = input.nextInt();
        year = input.nextInt();
        DateOprations ab = new DateOprations(day, mon ,year);
        System.out.println("Enter 2nd date.");
        day = input.nextInt();
        mon = input.nextInt();
        year = input.nextInt();
        DateOprations ac = new DateOprations(day, mon ,year);
	
        System.out.println (ab + ab.getWeeksnName());
        /*
        while (ab.notEqualDate(ac)){
        	 int x = input.nextInt();
        	 String xy = input1.next();
        	 
        	 if (x==ab.day && xy.equalsIgnoreCase(ab.getWeeksnName())) System.out.println (ab.toString());
        	ab.addDay(1);
        }*/
		
	
	}
	}

