import static org.junit.Assert.*;

import org.junit.Test;
public class PostTest{
	Post p=new Post();
	
	@Test
	public void testStack1()
	{
		assertEquals(p.st("67+"),13);
		}
	@Test
	public void testStack2()
	{
		assertEquals(p.st("512+4*+3-"),14);
	}
	@Test
	public void testStack3()
	{
		assertEquals(p.st("22*44*+4/"),5);
	}
	@Test
	public void testStack4()
	{
		assertEquals(p.st("53+82-*"),48);
	}
	@Test
	public void testStack5()
	{
		assertEquals(p.st("62/3-42*+"),8);
	}
}