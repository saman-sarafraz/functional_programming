package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println(isEmail("me@test.com"));
        System.out.println(isEmail("something"));

        System.out.println(isEmailPredicate.test("me@test.com"));
        System.out.println(isEmailPredicate.test("something"));

        System.out.println(
                isEmailPredicate
                        .or(emailContainsDotPredicate)
                        .test("me@testcom")
        );


    }

    private static final Predicate<String> isEmailPredicate =
            email -> email.contains("@");

    private static final Predicate<String> emailContainsDotPredicate =
            email -> email.contains(".");

    private static boolean isEmail(String email) {
        return email.contains("@");
    }
}
