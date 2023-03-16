import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

/*
    If the assumption is true, the test can continue, otherwise is mark as ignored
*/
public class AssumptionsDemo {

    @Test
    public void assumptionDemo() {
        Assumptions.assumeTrue("test".startsWith("t"));
        System.out.println("Assumption demo 1");
        Assumptions.assumeFalse("false".startsWith("q"));
        System.out.println("Assumption demo");
    }

}
