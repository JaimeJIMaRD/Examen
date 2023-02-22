package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {
Fecha fc =new Fecha();
@Test
	void test1() {
		boolean res= fc.validarFecha(02,2004,28);
		assert true:res;
	}
@Test
	void test2() {
		boolean res= fc.validarFecha(02,2004,-1);
		assert false:res;
	}
@Test
	void test3() {
		boolean res= fc.validarFecha(13,2004,12);
		assert false:res;
	}
@Test
	void test4() {
		boolean res= fc.validarFecha(31,2004,13);
		assert true:res;
	}

}
