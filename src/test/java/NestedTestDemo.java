import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

class NestedTestDemo {

    @Test
    public void printHello(){
        System.out.println("Hello outer");
    }

    @Nested
    // To be static
    // @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class NestedDemo{
        @Test
        public void printHelloInner(){
            System.out.println("Hello inner");
        }
    }

}
