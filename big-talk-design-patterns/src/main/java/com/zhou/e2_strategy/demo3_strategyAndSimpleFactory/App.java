package com.zhou.e2_strategy.demo3_strategyAndSimpleFactory;

import java.util.Scanner;

/**
 * @author Zhouzh
 * @since 2023/6/9 22:37
 **/
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var cashContext = new CashContext(sc.nextInt());
        var price = sc.nextDouble();
        var num = sc.nextInt();
        double totalPrices = cashContext.getResult(price, num);
        System.out.println("totalPrices = " + totalPrices);
    }
}
