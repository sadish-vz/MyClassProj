package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;
import com.sk.pak.MyCl;

public class HelloWorldTest {

	

	@Test
	public void test() {
		MyCl hello = new MyCl();
		assertEquals("A test for Hello World String", "Hello Wold", hello.sayHello());
	}

}
