package com.company.object;

import java.util.Random;

public class FactoryProd {


    private static final Random random = new Random();
    public  static int i = 1;
    public static String generate() {
        return String.format(TEMPLATES, i++, 1, 1 + random.nextInt(50000));
    }
    public static String generate1() {
        return String.format(TEMPLATES, i++, 2, 1 + random.nextInt(50000));
    }
    public static String generate2() {
        return String.format(TEMPLATES, i++, 3, 1 + random.nextInt(50000));
    }
    public static String generate3() {
        return String.format(TEMPLATES, i++, 4, 1 + random.nextInt(50000));
    }
    public static String generate4() {
        return String.format(TEMPLATES, i++, 5, 1 + random.nextInt(50000));
    }

    private static final String TEMPLATES = "INSERT INTO factory_production(factory_id, antistress_id, count_) VALUES(%s, %s, %s);";
}
