package cn.edu.ncepu.liyan.helloworld;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    private HelloWorld helloWorld;
    @Before
    public void setUp() throws Exception {
        helloWorld = new HelloWorld();
    }

    @Test
    public void testSayHello() throws Exception {
        HelloWorld.main(null);
        helloWorld.sayHello();
    }
}