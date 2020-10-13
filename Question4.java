package Day_4;

public class Question4 {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		 
		System.out.println("n1" + "=" + n1 );
		System.out.println("n2" + "=" + n2);
		
		
		System.out.println("---------");
		
	    //Swap with third variable
		int temp = n1; //10
		n1 = n2; //20
		
		n2 = temp;
		
		System.out.println("n1" + "=" + n1 );
		System.out.println("n2" + "=" + n2);
		
		//Swap with two variable
		n1 = n1 + n2;//20+10=30
		n2 = n1 - n2; // 30-10=20
		n1 = n1 - n2; //30 - 20= 10
		
		System.out.println("n1" + "=" + n1 );
		System.out.println("n2" + "=" + n2);
		//   30          n2=10
		n1= n1 + n2 - (n2 = n1);//20
		
		System.out.println("n1" + "=" + n1 );
		System.out.println("n2" + "=" + n2);

	}

}
