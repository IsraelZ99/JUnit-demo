import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

class CustomConditionsBasesAnnotations {

    @Test
    @EnabledIf("checkIfUserValid")
    public void validateUser(){
        System.out.println("User is valid");
    }

    @Test
    @DisabledIf("checkIfUserValid")
    public void validateUserDisabled(){
        System.out.println("User is valid");
    }

    public boolean checkIfUserValid(){
        return false;
    }

}
