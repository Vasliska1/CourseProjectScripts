package com.company.object;

import java.util.Random;

public class DeliveryFact {

    private static final Random random = new Random();

    public static String generate1() {
        return String.format(TEMPLATES, 1 + random.nextInt(1000), 1 + random.nextInt(2800), false, null);
    }

    public static String generate2() {
        return String.format(TEMPLATES1, 1 + random.nextInt(1000), 1 + random.nextInt(2800), true, "2021-11-06");
    }

    private static final String TEMPLATES = "INSERT INTO delivery_fact(order_id,  deliveryman_id, delivery_fact, delivery_date) VALUES(%s, %s, %s,%s);";
    private static final String TEMPLATES1 = "INSERT INTO delivery_fact(order_id,  deliveryman_id, delivery_fact, delivery_date) VALUES(%s, %s, %s,'%s');";
}
