package com.devlab.facade.example_foo;

import com.devlab.facade.example_foo.stuff.*;

public class Facade {

    public void method1(){

        System.out.println("------------------------");
        System.out.println("Facade : method1");

        ToolA toolA = new ToolA();
        toolA.tht();
        toolA.foo();
        toolA.bar();

        ToolD toolD = new ToolD();
        toolD.gkl();
    }

    public void method2(){

        System.out.println("------------------------");
        System.out.println("Facade : method2");

        ToolE toolE = new ToolE();
        toolE.dft();
        toolE.mtk();

        ToolC toolC = new ToolC();
        toolC.klm();

    }

    public void method3(){

        System.out.println("------------------------");
        System.out.println("Facade : method3");

        ToolB toolB = new ToolB();
        toolB.jan();

    }
}
