import java.util.HashMap;
import java.util.Map;
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

			int count = tekst.length();
			Map<Character, Integer> numChars = new HashMap<Character, Integer>(Math.min(count, 26));

			for (int i = 0; i < count; ++i) {
				char charAt = tekst.charAt(i);
				if (!numChars.containsKey(charAt)) {
					numChars.put(charAt, 1);
				} else {
					numChars.put(charAt, numChars.get(charAt) + 1);
				}
			}
			System.out.println(numChars);
		}
		input.close();
	}
}
