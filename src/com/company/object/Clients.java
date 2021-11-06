package com.company.object;

import java.util.Random;

public class Clients {

    private static final Random random = new Random();

    public static String generate() {
        return String.format(TEMPLATES, 2801 + random.nextInt(11000), 1 + random.nextInt(11500), 1 + random.nextInt(2));
    }

    private static final String TEMPLATES = "INSERT INTO clients(human_id, location_id, subscription_id) VALUES( %s, %s, %s);";

}
