import static org.junit.Assert.*;

import org.junit.Test;


public class PrintMessageTest {

	String message ="Hi you" ;
	PrintMessage test = new PrintMessage(message) ;
	
	@Test
	public void testprintMessage()
	{
		assertEquals(message,test.printMessage());
	}

}
