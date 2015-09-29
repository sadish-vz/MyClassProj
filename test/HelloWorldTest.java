package test;

import static org.junit.Assert.*;

import com.sk.pak.MyCl;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testHello() {
		MyCl obj = new MyCl();
		String str = obj.sayHello();
		assertEquals("Hello World",str);
	}

}
