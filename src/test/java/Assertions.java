import org.junit.jupiter.api.Test;

class Assertions {

    @Test
    public void assertAlternative(){
        JavaOperations javaOperations = new JavaOperations();
        if(javaOperations.add(4,5) == 8){
            System.out.println("Test passed");
        } else
            System.out.println("Test failed");
    }

}
