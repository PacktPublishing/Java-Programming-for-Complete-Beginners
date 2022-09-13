package Demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestStudentMark {
	@Test
	public void test_getTotalMarks() {
		assertEquals(300.0, StudentMark.getTotalMarks(100,100,100),0.0f);
	}
	
	@Test(expected = ArithmeticException.class)
	public void test_getTotalMarksAbove() {
		StudentMark.getTotalMarks(1000,  1000, 1000);
	}
	
	@Test(expected = ArithmeticException.class)
	public void test_getTotalMarksBelow() {
		StudentMark.getTotalMarks(-1,-1,-1);
	}

	@Test
	public void test_getTotalMarksArithmeticCheck() {
		StudentMark.getTotalMarks(10+20+30, 30+20, 40+20+10);
	}
	
	@Test
	public void test_getGrade() {
		assertEquals("A+", StudentMark.getGrade(90));
	}
	
	@Test(expected = ArithmeticException.class)
	public void test_getGradeInvalidMarks() {
		assertEquals("A+", StudentMark.getGrade(900));
	}
	
	@Test
	public void test_getPercent() {
		assertEquals(100.0, StudentMark.getPercent(100, 100, 100), 0.0f);
	}
	
	@Test(expected = ArithmeticException.class)
	public void test_getPercentInvalidMarks() {
		StudentMark.getPercent(1000, 1000, 1000);
	}

	
	
}
