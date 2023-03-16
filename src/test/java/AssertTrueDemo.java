import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AssertTrueDemo {

    @Test
    public void assertForTrue(){
        String test = "I love java";
        Assertions.assertTrue(test.equals("I love javas"), "Test assertTrue failed");
    }

}
