package com.lti;
import static
org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import com.lti.TestArithmatic;
public class CodeTest{
	private Arithmetic arth;
	
	@Before
	public void init(){
		arth=new Arithmetic();
	}
	@Test{
		public void testSub(){
			assertEquals(10,arth.sub(10,4))
		}
}
	
}