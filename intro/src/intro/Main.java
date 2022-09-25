package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hello World");

		String ogrenciSayim = "öğrenci sayim : ";
		int ogrenciSayisi = 11;
		System.out.println(ogrenciSayim + ogrenciSayisi);

		double sayi = 12.5;
		sayi = 1445542555;
		char karakter = 425;
		System.out.println(karakter);

		int sayi2 = 20;
		if (sayi2 < 15) {
			System.out.println("sayi 15 den kçüktür");
		} else if (sayi2 == 20) {
			System.out.println("eşit");

		} else {
			System.out.println("büyük");

		}

		// Switch-case

		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("mükemmel : geçtiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("İYİ : geçtiniz");
			break;
		case 'D':
			System.out.println("FENA DEĞİL : geçtiniz");
			break;
		case 'F':
			System.out.println("MAALESEF KALDINIZ");
			break;
		default:
			System.out.println("geçersiz not girdiniz");
			break;
		}

		// loops

		// for

		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("for döngüsü bitti");

		// while

		int i = 2;
		while (i <= 10) {
			System.out.println(i);
			i += 2;
		}

		System.out.println("while döngüsü bitti");

		// do-while
		int j = 1;
		do {
			System.out.println("loglandı");
			System.out.println(j);
			j += 2;
		} while (j < 10);

		System.out.println("do-while döngüsü bitti");

		// arrays

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		for (int k = 0; k < ogrenciler.length; k++) {
			System.out.println(ogrenciler[k]);
		}

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);

		}

		// multidimensional-array-demo

		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakır";
		sehirler[2][1] = "Şanlıurfa";
		sehirler[2][2] = "Gaziantep";

		for (int k = 0; k <= 2; k++) {
			System.out.println("-------------------------------------");
			for (int l = 0; l <= 2; l++) {
				System.out.println(sehirler[k][l]);
			}

		}

		// strings-demo
		String mesaj = "Bugün hava çok güzel";

		System.out.println(mesaj);

		/*System.out.println("Eleman sayısı : " + mesaj.length());
		System.out.println("beşinci eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj.startsWith("b"));
		System.out.println(mesaj.endsWith("l"));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("ava"));
		System.out.println(mesaj.lastIndexOf("a"));*/
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,4));
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
			
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());

	}

}
