import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GroupedAssertions {

    @Test
    public void multipleAssertionDemo() {
        JavaOperations operations = new JavaOperations();
        Assertions.assertEquals(4, operations.add(3, 1));
        Assertions.assertEquals(25, operations.add(3, 22));
        Assertions.assertEquals(100, operations.add(70, 30));
    }

    @Test
    public void groupAssertionDemo() {
        JavaOperations operations = new JavaOperations();
        Assertions.assertAll(
                () -> Assertions.assertEquals(5, operations.add(3, 1)),
                () -> Assertions.assertEquals(26, operations.add(3, 22)),
                () -> Assertions.assertEquals(100, operations.add(70, 30))
        );
    }

}
