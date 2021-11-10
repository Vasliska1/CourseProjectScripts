package com.company;

import com.company.object.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Main {

    //11000 хьюм 1500 фабрик 3000 машин 2800 доставшиков 3000 рабочих 8200 клиентов 11500 адресов
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int fdfd;
        int dd;
        int df;
        Main generator = new Main();
        generator.generatorHuman();
        generator.generatorCity();
        generator.generatorDistrict();
        generator.generatorFactory();
        generator.generatorFactoryProd();
        generator.generatorCar();
        generator.generatorFactoryStaff();
        generator.generatorDeliveryman();
        generator.generatorLocation();
        generator.generatorClients();
        generator.generatorOrders();
        generator.generatorProduct();

        generator.generatorFactoryProd2();
        generator.generatorFactoryProd3();
        generator.generatorFactoryProd4();
        generator.generatorDeliveryFact();
        generator.generatorDeliveryFact2();
        generator.generatorFactoryProd5();
        try (PrintWriter out = new PrintWriter("scripts/data.sql", "UTF-8")) {

            out.println(sqlStatic);
            out.println("/*--------------------------------------------------------------------------------------------------------------*/");
            for (String s : generator.humans) {
                out.println(s);
            }
            out.println("/*--------------------------------------------------------------------------------------------------------------*/");


            for (String s : generator.city) {
                out.println(s);
            }
            out.println("/*--------------------------------------------------------------------------------------------------------------*/");

            for (String s : generator.district) {
                out.println(s);
            }
            out.println("/*--------------------------------------------------------------------------------------------------------------*/");


            for (String s : generator.factory) {
                out.println(s);
            }
            out.println("/*--------------------------------------------------------------------------------------------------------------*/");


            for (String s : generator.factoryProd) {
                out.println(s);
            }
            for (String s : generator.factoryProd2) {
                out.println(s);
            }
            for (String s : generator.factoryProd3) {
                out.println(s);
            }
            for (String s : generator.factoryProd4) {
                out.println(s);
            }
            for (String s : generator.factoryProd5) {
                out.println(s);
            }

            out.println("/*--------------------------------------------------------------------------------------------------------------*/");


            for (String s : generator.car) {
                out.println(s);
            }

            out.println("/*--------------------------------------------------------------------------------------------------------------*/");


            for (String s : generator.factoryStaff) {
                out.println(s);
            }
            out.println("/*--------------------------------------------------------------------------------------------------------------*/");


            for (String s : generator.deliveryman) {
                out.println(s);
            }

            out.println("/*--------------------------------------------------------------------------------------------------------------*/");


            for (String s : generator.location) {
                out.println(s);
            }

            out.println("/*--------------------------------------------------------------------------------------------------------------*/");


            for (String s : generator.clients) {
                out.println(s);
            }
            out.println("/*--------------------------------------------------------------------------------------------------------------*/");


            for (String s : generator.orders) {
                out.println(s);
            }

            out.println("/*--------------------------------------------------------------------------------------------------------------*/");


            for (String s : generator.productList) {
                out.println(s);
            }
            out.println("/*--------------------------------------------------------------------------------------------------------------*/");


            for (String s : generator.delivF1) {
                out.println(s);
            }
            out.println("/*--------------------------------------------------------------------------------------------------------------*/");


            for (String s : generator.delivF2) {
                out.println(s);
            }


        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    private ArrayList<String> humans = new ArrayList<>();
    private ArrayList<String> city = new ArrayList<>();
    private ArrayList<String> district = new ArrayList<>();
    private ArrayList<String> factory = new ArrayList<>();
    private ArrayList<String> factoryProd = new ArrayList<>();
    private ArrayList<String> factoryProd2 = new ArrayList<>();
    private ArrayList<String> factoryProd3 = new ArrayList<>();
    private ArrayList<String> factoryProd4 = new ArrayList<>();
    private ArrayList<String> factoryProd5 = new ArrayList<>();
    private ArrayList<String> car = new ArrayList<>();
    private ArrayList<String> factoryStaff = new ArrayList<>();
    private ArrayList<String> deliveryman = new ArrayList<>();
    private ArrayList<String> location = new ArrayList<>();
    private ArrayList<String> clients = new ArrayList<>();
    private ArrayList<String> productList = new ArrayList<>();
    private ArrayList<String> orders = new ArrayList<>();
    private ArrayList<String> delivF1 = new ArrayList<>();
    private ArrayList<String> delivF2 = new ArrayList<>();

    public void generatorHuman() {
        for (int i = 0; i < 11000; i++) {
            humans.add(Humans.generate());
        }
    }

    public void generatorCity() {
        for (int i = 0; i < 255; i++) {
            city.add(City.generate());
        }
    }

    public void generatorDistrict() {
        for (int i = 0; i < 1500; i++) {
            district.add(District.generate());
        }
    }

    public void generatorFactory() {
        for (int i = 0; i < 1500; i++) {
            factory.add(Factory.generate());
        }
    }

    public void generatorFactoryProd() {
        for (int i = 1; i < 1500; i++) {
            factoryProd.add(FactoryProd.generate());
        }
    }

    public void generatorFactoryProd2() {
        FactoryProd.i = 1;
        for (int i = 1; i < 1000; i++) {
            factoryProd.add(FactoryProd.generate1());
        }
    }

    public void generatorFactoryProd3() {
        FactoryProd.i = 1;
        for (int i = 1; i < 500; i++) {
            factoryProd.add(FactoryProd.generate2());
        }
    }

    public void generatorFactoryProd4() {
        FactoryProd.i = 1;
        for (int i = 1; i < 200; i++) {
            factoryProd.add(FactoryProd.generate3());
        }
    }

    public void generatorFactoryProd5() {
        FactoryProd.i = 100;
        for (int i = 1; i < 500; i++) {
            factoryProd.add(FactoryProd.generate4());
        }
    }

    public void generatorCar() {
        for (int i = 0; i < 3000; i++) {
            car.add(Car.generate());
        }
    }

    public void generatorFactoryStaff() {
        for (int i = 0; i < 3000; i++) {
            factoryStaff.add(FactoryStaff.generate());
        }
    }

    public void generatorDeliveryman() {
        for (int i = 0; i < 2800; i++) {
            deliveryman.add(Deliveryman.generate());
        }
    }

    public void generatorLocation() {
        for (int i = 0; i < 11500; i++) {
            location.add(Location.generate());
        }
    }

    public void generatorClients() {
        for (int i = 0; i < 8200; i++) {
            clients.add(Clients.generate());
        }
    }

    public void generatorOrders() {
        for (int i = 0; i < 2000; i++) {
            orders.add(Order.generate());
        }
    }

    public void generatorProduct() {
        for (int i = 0; i < 2000; i++) {
            productList.add(ProductList.generate());
        }
    }

    public void generatorDeliveryFact() {
        for (int i = 0; i < 500; i++) {
            delivF1.add(DeliveryFact.generate1());
        }
    }

    public void generatorDeliveryFact2() {
        for (int i = 0; i < 500; i++) {
            delivF2.add(DeliveryFact.generate2());
        }
    }


    private static String sqlStatic = "INSERT INTO antistress(kind) VALUES('Поп-ит');\n" +
            "INSERT INTO antistress(kind) VALUES('Симл-димпл');\n" +
            "INSERT INTO antistress(kind) VALUES('Сквиш'); \n" +
            "INSERT INTO antistress(kind) VALUES('Осьминог-перевертыш'); \n" +
            "INSERT INTO antistress(kind) VALUES('Спинер'); \n" +
            "INSERT INTO stress_kind(stress) VALUES('Проблемы с концентрацией внимания');\n" +
            "INSERT INTO stress_kind(stress) VALUES('Проблемы с нервозностью');\n" +
            "INSERT INTO stress_kind(stress) VALUES('Проблемы с бессоницей');\n" +
            "INSERT INTO stress_kind(stress) VALUES('Проблемы с нервным тиком');\n" +
            "INSERT INTO stress_kind(stress) VALUES('Проблемы с забывчивостью');\n" +
            "INSERT INTO antistress_to_stress(stress_id,  antistress_id) VALUES(1,1);" +
            "INSERT INTO antistress_to_stress(stress_id,  antistress_id) VALUES(2,2);\n" +
            "INSERT INTO antistress_to_stress(stress_id,  antistress_id) VALUES(3,3);\n" +
            "INSERT INTO antistress_to_stress(stress_id,  antistress_id) VALUES(4,4);\n" +
            "INSERT INTO antistress_to_stress(stress_id,  antistress_id) VALUES(5,5);\n" +
            "INSERT INTO subscription(subscription_kind) VALUES('обычная');\n" +
            "INSERT INTO subscription(subscription_kind) VALUES('VIP');\n";
}

