import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedCSVSource {

    @ParameterizedTest
    @CsvSource({
            "Audi,55",
            "Tesla,99",
            "Ferrari,101"
    })
    public void csvSourceMethod(String car, int quantity){
        System.out.println(car + " : " + quantity);
    }

    /*
        A useful case probably be a login combination username and password
    */
    @Tag("feature-1")
    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/input.csv")
    public void csvFileMethod(String car, int quantity){
        System.out.println(car + " : " + quantity);
    }

}
