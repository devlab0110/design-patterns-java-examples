package com.devlab.proxy.example_internet;



public class Test {

    public static void main(String[] args) {

        System.out.println("------------------");
        Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("google.org");
            internet.connectTo("efg.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

}
