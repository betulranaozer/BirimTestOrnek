package tr.edu.medipol.yazilimort;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamalarTest {

	@Test
	public void testFaktoriyelRec() {
		int sonuc = Hesaplamalar.faktoriyelRec(5);
		assertEquals(120,sonuc);
	}

	@Test
	public void testFaktoriyelLoop() {
		int sonuc = Hesaplamalar.faktoriyelLoop(5);
		assertEquals(120,sonuc);
	}
	
	@Test
	public void testFaktoriyel() {
		for(int i=1; i<1000; i++) {
			int sonuc1 = Hesaplamalar.faktoriyelLoop(i);
			int sonuc2 = Hesaplamalar.faktoriyelLoop(i);
			assertEquals(sonuc1,sonuc2);
		}
	}
	
	@Test
	public void testToplama() {
		int sonuc = Hesaplamalar.toplama(56, 32);
		assertEquals(88,sonuc);
	}

	@Test
	public void testCikartma() {
		int sonuc = Hesaplamalar.cikartma(56, 32);
		assertEquals(24,sonuc);
	}

	@Test
	public void testCarpma() {
		int sonuc = Hesaplamalar.carpma(56, 32);
		assertEquals(1792,sonuc);	
	}

}
