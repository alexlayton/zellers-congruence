import java.util.*;

public class ZellersCongruence
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a date (DD/MM/YYYY): ");
		String date = in.next();
		System.out.println(zCongruence(date));
	} //main
	
	public static String zCongruence(String date)
	{
		String [] days = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
		int h, q, m, y, k, j;
		
		q = Integer.parseInt(date.substring(0,2));
		m = Integer.parseInt(date.substring(3,5));
		y = Integer.parseInt(date.substring(6,10));
		
		if(m == 1 || m == 2)
		{
			m += 12;
			y -= 1;
		}
		
		k = y % 100;
		j = y / 100;
		
		h = (q + (((m+1) * 26) / 10) + k + (k/4) + (j/4) + (5 * j)) % 7;
		
		return days[h];
	} //zCongruence
}
