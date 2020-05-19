package com.dwmkerr.javamaveenstandardversionsample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    @Test
    public void expectHelloToGiveCorrectGreeting() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello, World!", helloWorld.Hello());
    }
}