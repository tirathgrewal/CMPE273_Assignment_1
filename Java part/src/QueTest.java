import static org.junit.Assert.*;

import org.junit.Test;
public class QueTest{
	Que q=new Que();
	
	@Test
	public void testQue1()
	{
		assertEquals(q.enqueue("Ted"),"Ted");
		assertEquals(q.enqueue("Viv"),"Viv");
		assertEquals(q.enqueue("Tom"),"Tom");
		assertEquals(q.enqueue("Sid"),"Sid");
		assertEquals(q.enqueue("Jim"),"Jim");
		assertEquals(q.size(),5);
		assertEquals(q.dequeue(),"Ted");
		assertEquals(q.peek(),"Viv");
		
		}
	
}