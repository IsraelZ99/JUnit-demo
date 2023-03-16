import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AssertNotEquals {

    @Test
    public void assertNotEqualsDemo(){
        JavaOperations operations = new JavaOperations();
        int add = operations.add(4, 5);
        Assertions.assertNotEquals(9, add, "Assertion add (4,5) failed ");
    }

}
