import static org.junit.Assert.*;

import org.junit.Test;
public class CollectionsTest{
	Collections c=new Collections();
	
	@Test
	public void testCollection1()
	{
		assertEquals(c.check("Pen"),true);
		}
	@Test
	public void testCollection2()
	{
		assertEquals(c.check("Rubber"),false);
	}
	@Test
	public void testCollection3()
	{
		assertEquals(c.check("MacBook Pro"),true);
	}
}