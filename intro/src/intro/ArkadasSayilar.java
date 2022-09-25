package intro;

public class ArkadasSayilar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi1 = 225;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;
		for (int i = 1; i < sayi2 ; i++) {
			if (sayi2 % i == 0) {
				toplam2 = toplam2+i;
				
			} 
			
		}
		for (int i = 1; i < sayi1 ; i++) {
			if (sayi1 % i == 0) {
				toplam1 = toplam1+i;
				
			} 
		}	
		if (toplam2 == sayi1 && toplam1==sayi2) {
			System.out.println("arkadas");
			
		} 
		else {
			System.out.println("arkadas değildir");
		}
		
	}
}


