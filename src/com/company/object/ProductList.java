package com.company.object;

import java.util.Random;

public class ProductList {

    private static final Random random = new Random();

    public static String generate() {
        return String.format(TEMPLATES, 1 + random.nextInt(1000), 1 + random.nextInt(5), 1 + random.nextInt(1000));
    }

    private static final String TEMPLATES = "INSERT INTO product_list(id_order, antistress_id, count_) VALUES( %s, %s, %s);";

}
