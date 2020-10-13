package Day_4;

public class Question7 {

	public static void main(String[] args) {
		
		int change, quarters, dimes, nickles, billPay=1;
		int price=95;
		
		System.out.println("Price in cents: " + price);
		
		change=(billPay*100)-price;
		
		System.out.println("Change in cents: " + change);
		
		quarters=change/25;
		dimes=(change-quarters*25)/10;
		nickles=(change-(quarters*25)-(dimes*10))/5;
		
		System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + "and " + nickles + " nickles" );
				
				

	}

}
