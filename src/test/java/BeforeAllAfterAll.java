import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BeforeAllAfterAll {

    @BeforeAll
    static void openDatabase(){
        System.out.println("Open database connection");
    }

    @AfterAll
    static void closeDatabase(){
        System.out.println("Close database connection");
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
