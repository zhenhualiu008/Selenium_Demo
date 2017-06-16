package scripts.testscripts.testNG;

import org.testng.annotations.Test;

/**
 * Created by lzh on 2017/6/16.
 */
public class TestDependent {

    @Test
    public void fun1() {
        System.out.println("1. fun1  第一个执行, 因为fun3依赖它；");
    }

    @Test( dependsOnMethods = {"fun3"} )
    public void fun2() {
        System.out.println("2. fun2  最后执行，因为fun3已经执行完毕。；");
    }

    @Test( dependsOnMethods = {"fun1"} )
    public void fun3() {
        System.out.println("3. fun3  第二个执行，因为它依赖的fun1已经执行完毕；");
    }
}
