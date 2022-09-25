package intro;

public class SayiBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 42;
		boolean varMi=false;
		
		for (int sayi:sayilar) {
			if (sayi==aranacak) {
				varMi=true;
				break;
				
			} 
		}
		if(varMi) {
			System.out.println("sayı mevcut");
		}
		else {
			System.err.println("sayı mevcut değil");
		}
		
		

	}

}
