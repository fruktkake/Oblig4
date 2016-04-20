import java.util.Scanner;

public class SnuTekst {
	public static String baklengs;

	public static void baklengs(String tekst) {
		String baklengs = new String();
		for (int i = tekst.length() - 1; i >= 0; i--) {
			baklengs += tekst.charAt(i);
		}
		System.out.println("Baklengs streng: " + baklengs);
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		{
			System.out.println("Skriv inn en streng: ");
			String tekst = input.nextLine();
			baklengs(tekst);
		}
		input.close();
	}
}
