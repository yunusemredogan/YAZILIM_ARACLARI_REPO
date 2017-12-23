import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaTest {

	@Test
	public void testClass() {
		boolean hataOlustu = false;
		try {
			Hesaplama hesaplama = new Hesaplama();
		} catch(Exception e) {
			hataOlustu = true;
		}
		
		assertFalse(hataOlustu);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testToplaUnupported1() {
		Hesaplama.topla(Integer.MAX_VALUE+1, 3);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testToplaUnupported2() {
		Hesaplama.topla(3, Integer.MAX_VALUE+1);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testToplaUnupported3() {
		Hesaplama.topla(Integer.MAX_VALUE+1, Integer.MAX_VALUE+1);
	}
	
	@Test
	public void testToplaHepsi() {
		
		for (int sayi1=-10000; sayi1<10001; sayi1++) {
			for (int sayi2=-10000;sayi2<10001; sayi2++) {
				int gercekSonuc = Hesaplama.topla(sayi1, sayi2);
				assertEquals(sayi1+sayi2, gercekSonuc);
			}
		}
		
	}
	
	@Test
	public void testIslemler() {
		int gercekSonuc = Hesaplama.islemler(19,25);
		assertEquals(10, gercekSonuc);
	}

	
	@Test
	public void testTopla25ve14() {
		int gercekSonuc = Hesaplama.topla(25, 14);
		assertEquals(39, gercekSonuc);
	}
	
	@Test
	public void testToplaNegatif() {
		int gercekSonuc = Hesaplama.topla(-25, -14);
		assertEquals(-39, gercekSonuc);
	}
	
	@Test
	public void testCarp6ve7() {
		int gercekSonuc = Hesaplama.carpma(6, 7);
		assertEquals(42, gercekSonuc);
	}
	
	@Test
	public void test60Bol10() {
		int gercekSonuc = Hesaplama.bolme(60, 10);
		assertEquals(6, gercekSonuc);
	}

}
