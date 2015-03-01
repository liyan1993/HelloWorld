package cn.edu.ncepu.liyan.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by liyan on 15-3-1.
 */
public class HelloWorld {
    //日志接口
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        LOGGER.info("Hello World!");
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}
