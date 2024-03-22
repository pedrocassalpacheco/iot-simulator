package com.datastax.se;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;
import java.util.ArrayList;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        ArrayList<Thread> cars = new ArrayList<Thread>();
        for (int i = 0; i < 500; i++) {
            Thread obj = new Thread(new Car(UUID.randomUUID().toString()));
            obj.start();
            cars.add(obj);
        }
    }
}
