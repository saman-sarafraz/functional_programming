package stream;

import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapDemo {

    public static void main(String[] args) {

        List<Customer> customers = CustomerDatabase.all;

        List<String> emails = customers.stream()
                .map(customer -> customer.getEmail())
                .collect(Collectors.toList());
        System.out.println(emails);

        List<String> phoneNumbers = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(phoneNumbers);
    }
}
