package com.zhou.e1_simpleFactory;

/**
 * 简单运算工厂类
 *
 * @author zhouzh
 * @since 2023/6/8 8:30
 */
public class OperationFactory {
    public static Operation createOperate(String operate) {
        return switch (operate) {
            case "+" -> new Add();
            case "-" -> new Subtract();
            case "*" -> new Multiply();
            case "/" -> new Divide();
            case "pow" -> new Pow();
            default -> throw new IllegalStateException("Unexpected value: " + operate);
        };
    }
}
