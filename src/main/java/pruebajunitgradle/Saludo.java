package pruebajunitgradle;

public class Saludo {

    private static final String HELLO = "Hola";
    private static final String WORLD = "Mundo";

    public String helloWorld(){
        return HELLO + " " + WORLD;
    }

    public String helloWorld(String name){
        return HELLO + " " + name;
    }
}
