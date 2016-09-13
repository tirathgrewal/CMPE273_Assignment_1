import static org.junit.Assert.*;

import org.junit.Test;
public class MultitTest{
	Multit m1=new Multit("Thread 1",65530);
	Multit m2=new Multit("Thread 2",18);
	
	 
	
	@Test
	public void testMultit1()
	{
		assertEquals(m1.cal(65530),"FFFA");
		}
	@Test
	public void testMultit2()
	{
		assertEquals(m2.cal(18),"12");
	}
	
}