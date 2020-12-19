import java.util.Scanner;
public class Kamm {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bitte Anzahl der Kamm-Zinken eingeben (2-10): ");
		String kz = scan.nextLine();
		int ikz = Integer.parseInt(kz);
		int rows = 0;
		int base = 20;
		int countshortline = (int) Math.floor((base-ikz)/(ikz-1));
		
		for(int i =0; i<ikz; i++)
		{
			System.out.println("**********");
			rows++;
			if(i==ikz-1)
				break;
			for(int j =0; j<countshortline; j++)
			{
				System.out.println("*");
				rows++;
			}
		}
		System.out.println(rows);
}
	
}
