package com.codecool.uml.overriding;

public class Webshop {

    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();

        System.out.println("***** Order 1 *****");
        System.out.println("Status of order1: " + order1.getStatus());
        order1.checkout();
        System.out.println("Status of order1: " + order1.getStatus());
        order1.pay();
        System.out.println("Status of order1: " + order1.getStatus());

        System.out.println("***** Order 2 *****");
        System.out.println("Status of order3: " + order2.getStatus());
        order2.pay();
        System.out.println("Status of order2: " + order2.getStatus());
        order2.checkout();
        System.out.println("Status of order2: " + order2.getStatus());
        order2.pay();
        System.out.println("Status of order2: " + order2.getStatus());
        order2.pay();
        System.out.println("Status of order2: " + order2.getStatus());

        System.out.println("***** Order 3 *****");
        System.out.println("Status of order3: " + order3.getStatus());
        order3.checkout();
        System.out.println("Status of order3: " + order3.getStatus());
        order3.checkout();
        System.out.println("Status of order3: " + order3.getStatus());

        System.out.println("####### Using the Processes #######");
        Order order4 = new Order();
        System.out.println("Status of order4: " + order4.getStatus());
        CheckoutProcess cp = new CheckoutProcess();
        PaymentProcess pp = new PaymentProcess();
        pp.process(order4);
        System.out.println("Status of order4: " + order4.getStatus());
        cp.process(order4);
        System.out.println("Status of order4: " + order4.getStatus());
        cp.process(order4);
        System.out.println("Status of order4: " + order4.getStatus());
        pp.process(order4);
        System.out.println("Status of order4: " + order4.getStatus());

        System.out.println("***** Test Done *****");

    }
}
