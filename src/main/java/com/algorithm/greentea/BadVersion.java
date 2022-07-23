package com.algorithm.greentea;

import java.util.concurrent.Callable;

/*
你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版
本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。

假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。

你可以通过bool isBadVersion(version)接口来判断版本号 version 是否在单元测试中出错。
实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/first-bad-version
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
//public class BadVersion implements Runnable{
//    static int name;
//    @Override
//    public void run() {
//        System.out.println(name);
//    }
//}
//class Tests{
//
//    public static void main(String[] args) {
//        BadVersion badVersion = new BadVersion();
//        badVersion.run();
//    }
//}

//public class BadVersion implements Callable<String> {
////
////    @Override
////    public String call() throws Exception {
////        return "a";
////    }
////}
////class Test{
////    public static void main(String[] args) {
////
////    }
////}

public class BadVersion extends Thread{
    private String name;

    public BadVersion(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);
    }
}
class Test{
    public static void main(String[] args) {
        BadVersion li = new BadVersion("li");
        BadVersion li2 = new BadVersion("li2");
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("a"+i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("b"+i);
            }
        });
  
        thread2.start();
    }
}
