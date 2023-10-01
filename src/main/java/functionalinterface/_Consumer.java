package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        // Normal
        Customer ali = new Customer("Ali", "99999999");
        greet(ali);
        greetV2(ali, false);
        // Consumer functional interface
        greetConsumer.accept(ali);
        greetConsumerV2.accept(ali, false);
    }

    private static final Consumer<Customer> greetConsumer =
            customer -> System.out.println(
                    "Hello " + customer.getName() +
                    ", thanks for register phone number " +
                    customer.getPhoneNumber()
            );

    private static final BiConsumer<Customer, Boolean> greetConsumerV2 =
            (customer, showPhone) -> System.out.println(
                    "Hello " + customer.getName() +
                    ", thanks for register phone number " +
                    (showPhone ? customer.getPhoneNumber() : "*********")
            );

    private static void greet(Customer customer) {
        System.out.println(
                "Hello " + customer.getName() +
                ", thanks for register phone number " +
                customer.getPhoneNumber()
        );
    }

    private static void greetV2(Customer customer, boolean showPhone) {
        System.out.println(
                "Hello " + customer.getName() +
                ", thanks for register phone number " +
                (showPhone ? customer.getPhoneNumber() : "*********")
        );
    }

    public static class Customer {
        private final String name;
        private final String phoneNumber;

        public Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
    }
}
