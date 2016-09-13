import static org.junit.Assert.*;

import org.junit.Test;
public class ExamTest{
	Exam e=new Exam();
	
	@Test
	public void testArray1()
	{
		double [] marks = {19, 28, 45, 49, 12, 32, 18, 41, 49, 30, 17, 44, 42, 45, 14, 30, 39, 36, 29, 24 };
		assertEquals(e.cal(marks),32.15,0.01);
		}
	@Test
	public void testArray2()
	{
		double [] marks = {10, 22, 44, 40, 22, 28, 38, 40, 49, 30, 23}; 
		assertEquals(e.cal(marks),31.45,0.01);
	}
	@Test
	public void testArray3()
	{
		double [] marks = {50, 42, 43, 40, 21, 35, 22, 8, 48, 48, 29, 48}; 
		assertEquals(e.cal(marks),36.16,0.01);
	}
	@Test
	public void testArray4()
	{
		double [] marks = {25, 28, 12, 8, 37, 15, 12, 48, 18, 18, 15, 11, 21, 39, 6}; 
		assertEquals(e.cal(marks),20.86,0.01);
	}
	@Test
	public void testArray5()
	{
		double [] marks = {45, 47, 42, 41, 42, 43, 32, 38, 48, 49, 35, 21, 41, 49, 36, 39, 50}; 
		assertEquals(e.cal(marks),41.05,0.01);
	}
}