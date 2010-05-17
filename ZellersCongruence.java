import java.util.*;

public class ZellersCongruence
{
	 public static void main(String [] Args) {
		
	 	String date[];
	 	date = new String[4];
	 	int h;
	 	String days[];
	 	days = new String[7];
	 	days[0] = "Saturday";
	 	days[1] = "Sunday";
	 	days[2] = "Monday";
	 	days[3] = "Tuesday";
	 	days[4] = "Wednesday";
	 	days[5] = "Thursday";
	 	days[6] = "Friday";
	 	int q; // The Day of the Month
	 	int m; // The Month of the Year
	 	int y; // The Year
		int K; 
		int J;	 
	 	Scanner in = new Scanner(System.in);
		
	 	System.out.println("Please enter the date in the format (DD/MM/YYYY): ");
		date[0] = in.next();
		// Take the input of the date
		
		date[1] = date[0].substring(0,2);
		date[2] = date[0].substring(3,5);
		date[3] = date[0].substring(6,10);
		//Take parts of the string in order to separate days and months
			
		q = Integer.parseInt(date[1]);
		m = Integer.parseInt(date[2]);
		y = Integer.parseInt(date[3]);
		//Turns the date substrings into integers
		
		if (m == 1 || m==2){
			m += 12;
			y -= 1;
		} //If the month is Jan or Feb, it should equal 13 or 14  
		
		K = y % 100;
		//The year mod 100
		J = y / 100;
		//The year divided by 100
		
		
		h = (q + (((m+1) * 26) / 10) + K + (K/4) + (J/4) + (5 * J)) % 7;
		//Zeller's Congruence formulae
		
		System.out.println(date[0] + " is a " + days[h]);
		//Print the date along with the day
		
		
	}
}
