package com.zhou.e1_simpleFactory;

import java.util.Scanner;

/**
 * @author zhouzh
 * @since 2023/6/8 9:06
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strOperate = sc.nextLine();
        Operation operate = OperationFactory.createOperate(strOperate);
        System.out.println("numberA : ");
        double numberA = sc.nextDouble();
        System.out.println("numberB : ");
        double numberB = sc.nextDouble();
        double result = operate.getResult(numberA, numberB);
        System.out.println("result = " + result);
    }
}
