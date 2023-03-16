import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Printing Hello class")
class DisplayNames {

    @Test
    @DisplayName("Printed hello")
    public void printHello(){
        System.out.println("Hello");
    }

}
