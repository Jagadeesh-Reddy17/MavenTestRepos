package maventestex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demos.calculator;

class sampletest {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	@Test
    public void testcase1(){
        Assertions.assertEquals("HELLO","HELLO");
        Assertions.assertEquals(500,100+100+300);
    }
	@Test
	public void testadd()
	{
		calculator c= new calculator();
		int r=c.add(300, 200);
        Assertions.assertEquals(500,r);
	}
	}
	
	


