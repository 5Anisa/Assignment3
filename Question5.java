package Day_4;

public class Question5 {

	public static void main(String[] args) {
		
		int seconds = 3695;
		
		System.out.println("inputSecond is " + seconds);
		
		int minutes, hours;
		int secondsRemainingAfterHour;
		
		hours = seconds/3600;
		secondsRemainingAfterHour = seconds % 3600;
		minutes = secondsRemainingAfterHour / 60;
		seconds = secondsRemainingAfterHour % 60;
		
		System.out.println(hours + "hours, " +  minutes + "minutes, " + "and " + seconds + "seconds");
		

	}

}
