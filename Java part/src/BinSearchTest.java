import static org.junit.Assert.*;

import org.junit.Test;
public class BinSearchTest{
	BinSearch b=new BinSearch();
	
	@Test
	public void testGeneric1()
	{
		Integer [] num={5,12,20,22,29,38,40,51,76};
		int key=40;
		assertEquals(b.binarySearch(num,key),true);
		}
	@Test
	public void testGeneric2()
	{
		Integer [] num={5,12,20,22,29,38,40,51,76};
		int key=41;
		assertEquals(b.binarySearch(num,key),false);
	}
	@Test
	public void testGeneric3()
	{
		String[] str={"a","bat","cat","dog", "elephant", "fish"};
		String key="fish";
		assertEquals(b.binarySearch(str,key),true);
	}
	@Test
	public void testGeneric4()
	{
		String[] str={"a","bat","cat","dog", "elephant", "fish"};
		String key="frog";
		assertEquals(b.binarySearch(str,key),false);
	}
}