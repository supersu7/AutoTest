package com.course.testng;

import org.testng.annotations.Test;

public class ExceptedException {

    /*
    * 在什么时候用到异常测试？
    * 在我们期望结果为某一个异常的时候
    * */


    //这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }


    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSucess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }
}
