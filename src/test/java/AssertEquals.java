import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AssertEquals {

    @Test
    public void assertDemo() {
        JavaOperations javaOperations = new JavaOperations();
        int actual = javaOperations.add(4, 5);
        Assertions.assertEquals(9, actual);
    }

}
