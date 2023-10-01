package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomerDatabase {

    public static List<Customer> all = Arrays.asList(
            new Customer(
                    101,
                    "Ali",
                    "ali@gmail.com",
                    Arrays.asList("0212222122", "09129992934")
            ),
            new Customer(
                    102,
                    "Mohammad",
                    "mohammad@gmail.com",
                    Arrays.asList("09128788888", "09362883331")
            ),
            new Customer(
                    103,
                    "Marjan",
                    "marjan@gmail.com",
                    Collections.singletonList("0217872277")
            )
    );
}
