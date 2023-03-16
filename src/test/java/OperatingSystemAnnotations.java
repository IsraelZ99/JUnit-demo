import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class OperatingSystemAnnotations {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void printHello(){
        System.out.println("Hello");
    }

    @Test
    @DisabledOnOs({OS.WINDOWS, OS.MAC})
    public void printHelloPython(){
        System.out.println("Hello Python");
    }

}
