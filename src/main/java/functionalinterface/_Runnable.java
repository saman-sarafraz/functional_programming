package functionalinterface;

public class _Runnable {

    public static void main(String[] args) {
        // Imperative approach
        helloWorld();
        // Declarative approach
        Runnable helloWorld = () -> System.out.println("Hello World");
        helloWorld.run();
    }

    public static void helloWorld() {
        System.out.println("Hello World");
    }
}
