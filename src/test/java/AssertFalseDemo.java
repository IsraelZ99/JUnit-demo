import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AssertFalseDemo {

    @Test
    public void assertForFalse() {
        String test = "I love java";
        Assertions.assertFalse(test.startsWith("I"), "Test assertFalse failed");
    }

}
