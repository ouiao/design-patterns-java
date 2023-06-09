package com.zhou.e2_strategy.demo1_simplFactory;

import java.util.Scanner;

/**
 * @author Zhouzh
 * @since 2023/6/9 22:05
 **/
public class App {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        CashSuper csuper = CashFactory.createCashAccept(sc.nextInt());
        var price = sc.nextDouble();
        var num = sc.nextInt();
        var totalPrices = csuper.acceptCash(price, num);

        System.out.println("totalPrices = " + totalPrices);
    }
}
