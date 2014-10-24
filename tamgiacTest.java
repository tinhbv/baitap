package tamgiac;

import static org.junit.Assert.*;

import org.junit.Test;

public class tamgiacTest {
	
	@Test	//khong la tam giac
	public void test1() {
		tamgiac test = new tamgiac(100,100,200) ;
		assertEquals(0,test.kiemtra(100,100,200));
	}
	
	@Test	//tam giac deu
	public void test2() {
		tamgiac test = new tamgiac(100,100,100) ;
		assertEquals(1,test.kiemtra(100,100,100));
	}
	
	@Test	//tam giac can
	public void test3() {
		tamgiac test = new tamgiac(100,100,150) ;
		assertEquals(2,test.kiemtra(100,100,150));
	}
	
	@Test	//tam giac thuong
	public void test4() {
		tamgiac test = new tamgiac(100,150,200) ;
		assertEquals(3,test.kiemtra(100,150,200));
	}
}
