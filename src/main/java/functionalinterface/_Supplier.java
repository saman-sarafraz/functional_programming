package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDatabaseUrl());
        System.out.println(getDatabaseUrlSuppliers.get());
    }

    private static final Supplier<List<String>> getDatabaseUrlSuppliers =
            () -> Arrays.asList(
                    "jdbc://localhost:4030/users",
                    "jdbc://localhost:4030/customers"
            );

    private static String getDatabaseUrl() {
        return "jdbc://localhost:4030/users";
    }
}
