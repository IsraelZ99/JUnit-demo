import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

public class ParameterizedTestDemo {

    @ParameterizedTest
    @ValueSource(strings = {"abc", "xyz", ""})
    public void checkBlanks(String value){
        Assertions.assertTrue(StringUtils.isBlank(value));
    }

    /*
        Placeholders of parameterisedTest:
            - displayName
            - index
            - arguments
    */
    @ParameterizedTest(name = "Check blanks {arguments}")
    @ValueSource(strings = {"abc", "xyz", ""})
    public void checkBlanksWithPlaceholders(String value){
        Assertions.assertTrue(StringUtils.isBlank(value));
    }

    @ParameterizedTest(name = "Check blanks {arguments}")
    @ValueSource(strings = {"abc", "xyz"})
//    @EmptySource
    @NullSource
    public void checkBlanksWithPlaceholders1(String value){
        Assertions.assertTrue(StringUtils.isBlank(value));
    }

    @ParameterizedTest(name = "Check blanks {arguments}")
    @ValueSource(strings = {"abc", "xyz"})
    @NullAndEmptySource
    public void checkBlanksWithPlaceholders2(String value){
        Assertions.assertTrue(StringUtils.isBlank(value));
    }

}
