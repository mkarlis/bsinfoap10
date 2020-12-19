import java.util.Scanner;

public class bmi {

	static int bmi=0;
	static int weight=0;
	static double heightM=0;
	static boolean running = true;
	static int tibmi = 21;
	static boolean needsChange = false;
	public static void main(String[] args) {
		while(running)
		{
		Scanner scan = new Scanner(System.in);

		System.out.println("Bitte Größe in cm eingeben: ");
		String h = scan.nextLine();
		int heightCM = Integer.parseInt(h);
		heightM = heightCM*0.01;		
		System.out.println("Bitt Gewicht als ganze Zahl in kg eingeben: ");
		String w = scan.nextLine();
		weight = Integer.parseInt(w);
		System.out.println("Bitte Geschlecht (W / M) eingeben: ");
		String s = scan.nextLine();
		int mMaxBMI = 25;
		int mMinBMI = 20;
		int wMaxBMI = 24;
		int wMinBMI = 19;
		
		int bmi = (int) Math.round((weight/(heightM*heightM)));
		
		if((s.equals("M") && bmi > mMaxBMI) || (s.equals("W") && bmi > wMaxBMI))
		{
			System.out.println("BMI "+bmi+" ist zu hoch.");
			needsChange = true;
		} else if((s.equals("M") && bmi < mMinBMI) || (s.equals("W") && bmi < wMinBMI))
		{
			System.out.println("BMI " +bmi +" ist zu niedrig.");
			needsChange = true;
		} else 
			System.out.println("BMI " + bmi+" im Normalbereich");	
		
		if(needsChange)
		{
			calcIdealWeight(tibmi, heightM);
		}
		
		
		System.out.println("Zum Abbruch x eingeben. Sonst beliebige Taste drücken");
		String x = scan.nextLine();
		if(x.equals("x"))
				{
			running = false;
			System.exit(0);
				}
		}
	}
		static void calcIdealWeight(int tibmi, double heightM)
		{
			int idealWeight = (int) (tibmi*heightM*heightM);
			System.out.println("Idealgewicht: ca. "+idealWeight + "kg.");
			int weightDifference = Math.abs(weight - idealWeight);
			if(idealWeight < weight)
			{
				System.out.println("Sie sollten ca. " +weightDifference + "kg abnehmen.\n Berechnet mit bmi von 21");
			} else 
				System.out.println("Sie sollten ca. " +weightDifference + "kg zunehmen. \n Berechnet mit bmi von 21");
		}
}
