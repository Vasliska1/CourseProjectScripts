package com.company.object;

import java.util.Random;

public class FactoryProd {


    private static final Random random = new Random();

    public static String generate() {
        return String.format(TEMPLATES, 1 + random.nextInt(1500), 1 + random.nextInt(5), 1 + random.nextInt(50000));
    }

    private static final String TEMPLATES = "INSERT INTO factory_production(factory_id, antistress_id, count_) VALUES(%s, %s, %s);";
}
