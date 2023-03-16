import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AssertingExceptions {

    @Test
    public void assertionException(){
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            int divide = 10 / 0;
        });
        System.out.println(exception.getMessage());
    }

    @Test
    public void assertionExceptionSubType(){
        Exception exception = Assertions.assertThrows(RuntimeException.class, () -> {
            int divide = 10 / 0;
        });
        System.out.println(exception.getMessage());
    }

}
