import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AssertionWithArrays {

    @Test
    public void assertsWithArraysDemo(){
        int[] arrayA = {1,2,3};
        int[] arrayB = {1,2,3};
        Assertions.assertArrayEquals(arrayA, arrayB);
//        Assertions.assertArrayEquals(arrayA, arrayB, "Comparison of arrays failed");
    }

}
