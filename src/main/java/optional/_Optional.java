package optional;

import java.util.Optional;

public class _Optional {

    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
                .orElseThrow(() -> new IllegalArgumentException());
        System.out.println(value);
    }
}
