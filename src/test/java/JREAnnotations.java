import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

class JREAnnotations {

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    public void printHelloJre(){
        System.out.println("Hello JRE");
    }

    @Test
    @DisabledOnJre({JRE.JAVA_11, JRE.JAVA_8})
    public void printHelloJreDisabled(){
        System.out.println("Hello JRE disabled");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_9, max = JRE.JAVA_11)
    public void printJava9To14(){
        System.out.println("Hi ranged");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_10)
    public void printJavaMin10(){
        System.out.println("Hello ten");
    }

    @Test
    @EnabledForJreRange(max = JRE.JAVA_9)
    public void printJavaMax9(){
        System.out.println("Hello ten");
    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_9, max = JRE.JAVA_11)
    public void printJavaDisabled9To11(){
        System.out.println("Hello disabled for 9 to 11");
    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_9)
    public void printJavaDisabled9(){
        System.out.println("Hello disabled from 9");
    }

    @Test
    @DisabledForJreRange(max = JRE.JAVA_10)
    public void printJavaDisabledTo11(){
        System.out.println("Hello disabled to 11");
    }

}
