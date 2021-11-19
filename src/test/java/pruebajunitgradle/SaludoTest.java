package pruebajunitgradle;

import org.junit.jupiter.api.*;

public class SaludoTest {

    @Test
    @Tag("regression")
    @Tag("smoke")
    void helloWorld() {
        System.out.println("\n\n\nTEST DE REGRESSION");
        System.out.println("https://" + Utils.getEnvironment() + "/endpoint.com");

    }

    @Test
    @Tag("smoke")
    void helloWorld1() {
        System.out.println("\n\n\nTEST DE SMOKE");
        System.out.println("https://" + Utils.getEnvironment() + "/endpoint.com");
    }

    @Test
    @Tag("integration")
    void helloWorld2() {
        System.out.println("\n\n\nTEST DE INTEGRATION");
        System.out.println("https://" + Utils.getEnvironment() + "/endpoint.com");
    }
}