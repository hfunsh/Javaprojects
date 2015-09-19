//This program will display the current time


public class currentTime {

	public static void main(String[] args) {
		//get the current system time
		long time = System.currentTimeMillis();
		
		//calculate the total number of seconds by diving the system time by 1000
		long totalSeconds = time / 1000;
		
		
	   //compute the current second by taking the modulus of total number of seconds divided by 60
		long currentSecond = totalSeconds % 60;
		
		
		//calculate the total number of minutes by dividing the total seconds by 60
		long totalMinutes = totalSeconds / 60;
		
		//calculate the current minutes by taking the modulus of total minutes divided by 60
		long currentMinute = totalMinutes % 60;
		
	 
		//calculate the total number of hours by dividing the total number of minutes by 60
		long totalHours = totalMinutes / 60;
		
		//compute the current hour by taking the modulus of the total hours divided by 24
		long currentHour = totalHours % 24;
		
		if (currentHour > 12) currentHour = currentHour -12;
		
		//convert to 12hr time
		
			
		
		//Display the output
	
		System.out.println(currentHour + ":" + currentMinute + ":" + currentSecond);
			}

}
