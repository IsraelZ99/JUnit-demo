import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("feature-2")
public class BeforeEachAfterEach {

    JavaOperations javaOperations;

    @BeforeEach
    public void init(){
        javaOperations = new JavaOperations();
        System.out.println("Initialize");
        // all init tasks
    }

    @AfterEach
    public void cleanUp(){
        System.out.println("Cleanup data");
    }

    @Test
    public void addTest(){
        // open database
        System.out.println("First test ... using Databases");
        // close database
    }

    @Test
    public void multiplyTest(){
        // open database
        System.out.println("Second test ... using Databases");
        // close database
    }

}
