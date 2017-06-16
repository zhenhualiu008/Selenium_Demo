package scripts.testscripts.testNG;

import org.testng.annotations.Test;

/**
 * Created by lzh on 2017/6/16.
 */
public class TestGroups {

    @Test(groups = {"group1","group2"})
    public void fun1() {
        System.out.println("1. fun1同时属于group1  和 group2，所以group1、group2执行的时候，fun1都执行；");
    }

    @Test
    public void fun2() {
        System.out.println("2. fun2  不属于任何一个组，所以按组执行的之后，fun2不执行；");
    }

    @Test(groups = {"group1"})
    public void fun4() {
        System.out.println("4. fun4  属于group1，所以group1执行的时候，fun4执行；");
    }

    @Test(groups = {"group2"})
    public void fun3() {
        System.out.println("3. fun3  属于group2，所以group2执行的时候，fun3执行；");
    }
}
