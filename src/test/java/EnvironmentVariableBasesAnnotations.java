import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

class EnvironmentVariableBasesAnnotations {

    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "israe")
    public void matchesUserName(){
        System.out.println("User name matched");
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USERNAME", matches = "israe")
    public void matchesUserNameDisabled(){
        System.out.println("User name matched disabled");
    }

}
