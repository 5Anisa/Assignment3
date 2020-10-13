package Day_4;

public class Question6 {

	public static void main(String[] args) {
		
		int mgCaffeine = 500;
		int lethalOverDose = 10000;
		
		int dosesToKill=lethalOverDose/mgCaffeine;
		
		System.out.println("Number of milligrams in drink: " + mgCaffeine);
		System.out.println("It would take about " + dosesToKill + " drinks for a lethal overdose" );

	}

}
