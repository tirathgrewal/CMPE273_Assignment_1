import static org.junit.Assert.*;

import org.junit.Test;
public class AccountTest{
	Account a=new Account();
	
	@Test
	public void testInterface1()
	{
		assertEquals(a.deposit(200),true);
		}
	@Test
	public void testInterface2()
	{
		assertEquals(a.withdraw(20),true);
	}
	@Test
	public void testInterface3()
	{
		assertEquals(a.totBal(),200,0.01);
	}
	
	
}