package Day2;

import java.util.Scanner;

public class usuerEnter {
	
	public static void main(String[] args) {
		// kullanici adi girisi
		
		String sys_kul_adi = "yazilimbilimi";
		String parola = "12345";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("kullanici adi:");
		
		String kullaniciadi = scan.nextLine();
		
		System.out.println("parola");
		
		String kul_parola = scan.nextLine();
		
		
		if (!(sys_kul_adi.equals(kullaniciadi))  &&   !(parola.equals(kul_parola )) ) {
			
			System.out.println("kullanici adi ve parola yanlis");
		}
		else if ((sys_kul_adi.equals(kullaniciadi))  &&   !(parola.equals(kul_parola )) ) {
			
			
			System.out.println("parola yanlis");
		}
		else if (!(sys_kul_adi.equals(kullaniciadi))  &&   (parola.equals(kul_parola )) ) {
			
			System.out.println("kullanici adi yanlis");
		}
		else {
			
			System.out.println("giris basarili");
			
		}
	}

}
