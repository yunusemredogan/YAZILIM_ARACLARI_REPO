/**
 * Hesaplama Islemlerinden sorumlu sinif
 * 
 * @author Ozkan Sari
 *
 */
public class Hesaplama {

	public static void main(String[] args){
		int sonuc = topla(19, 25);
		System.out.println(sonuc);
	}
	
	/**
	 * Toplama islemi yapar (1)
	 * 
	 * @param sayi1 Toplamada kullanilacak ilk sayi (2)
	 * @param sayi2 Toplamada kullanilacak ikinci sayi (3)
	 * 
	 * @return ilk sayi ile ikinci sayinin toplami (4) {@code sayi1 + sayi2}  
	 * 
	 * 
	 * @throws NullPointerException (5) sayi1 11111111'e esitse NoPermissionException verir
	 */
	public static int /* (4) */ topla( /* (1) */ int sayi1, /* (2) */ int sayi2 /* (3) */ ) 
			throws NullPointerException // (5) Firlatilan hata */
	{
		if(11111111==sayi1) {
			throw new NullPointerException();
		}
		
		return sayi1 + sayi2;
	}
	
	public static int carpma(int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}
	
	public static int bolme(int sayi1, int sayi2) {
		return sayi1 / sayi2;
	}
}
