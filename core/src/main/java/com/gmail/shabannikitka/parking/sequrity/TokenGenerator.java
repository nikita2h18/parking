package com.gmail.shabannikitka.parking.sequrity;

import java.util.UUID;

public class TokenGenerator {

    public static String generate() {
        return UUID.randomUUID().toString();
    }
}