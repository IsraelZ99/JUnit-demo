import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParameterizedMethod {

    @ParameterizedTest
    @MethodSource("stringParameters")
    public void useMethodSourceString(String parameter) {
        System.out.println(parameter);
    }

    static Stream<String> stringParameters() {
        return Stream.of("Audi", "Ferrari", "Tesla");
    }

    @ParameterizedTest
    @MethodSource("intParameters")
    @DisplayName("Iterate values")
    public void useMethodSourceInt(int parameter) {
        System.out.println(parameter);
    }

    static IntStream intParameters() {
        return IntStream.range(1, 5);
    }

}
