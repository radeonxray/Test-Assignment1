import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class whiteboxTest {

    @DisplayName("whiteBoxTestSEmptyArr")
    @Test
    void whiteBoxTestEmptyArr() {
        whitebox wb = new whitebox();
        String[] myStringArray = new String[0];
        Assert.assertEquals("No numbers", wb.whiteBoxTest(myStringArray));
    }

    @DisplayName("whiteBoxTestTwoValues")
    @Test
    void whiteBoxTestTwoValues() {
        whitebox wb = new whitebox();
        String[] myStringArray = new String[2];
        myStringArray[0] = "9";
        myStringArray[1] = "20";
        Assert.assertEquals("Minimum = 9; maximum = 20", wb.whiteBoxTest(myStringArray));
    }


    //This test will fail, due to the error in the original code
    //See page 6 of https://www.itu.dk/%7Esestoft/papers/softwaretesting.pdf for how to correct the error
    //Our assignment only asked us to take the provided code and set it up, so we could run white-box on the code,
    //not fix any potential errors.
    //I guess the assignment wanted us to use whitebox-testing to spot the error?
    @DisplayName("whiteBoxTestSixValues")
    @Test
    void whiteBoxTestSixValues() {
        whitebox wb = new whitebox();
        String[] myStringArray = new String[6];
        myStringArray[0] = "9";
        myStringArray[1] = "20";
        myStringArray[2] = "40";
        myStringArray[3] = "15";
        myStringArray[4] = "2";
        myStringArray[5] = "8";
        Assert.assertEquals("Minimum = 2; maximum = 40", wb.whiteBoxTest(myStringArray));
    }



}