package pruebajunitgradle;

import org.junit.jupiter.api.*;

public class SaludoTest {

    private Saludo saludo;
    String environment = System.getProperty("env");

    @Test
    @Tag("regression")
    void helloWorld() {
        saludo = new Saludo();
        System.out.println("\n\n\nTEST DE REGRESSION");
        System.out.println("https://" + environment + "/endpoint.com");

    }

    @Test
    @Tag("smoke")
    void helloWorld1() {
        saludo = new Saludo();
        System.out.println("\n\n\nTEST DE SMOKE");
        System.out.println("https://" + environment + "/endpoint.com");
    }

    @Test
    @Tag("intregration")
    void helloWorld2() {
        saludo = new Saludo();
        System.out.println("\n\n\nTEST DE INTEGRATION");
        System.out.println("https://" + environment + "/endpoint.com");
    }
}