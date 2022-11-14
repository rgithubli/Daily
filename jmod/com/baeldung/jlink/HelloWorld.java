package com.baeldung.jlink;

import java.util.logging.Logger;

public class HelloWorld {
    private static final Logger LOG = Logger.getLogger(HelloWorld.class.getName());

    public static void main(String[] args) throws Exception {
        LOG.info("Hello World!");
    }
}

