package ua.training;


import org.junit.Assert;
import org.junit.Test;

public class ModelTest {
    @Test(expected = IllegalArgumentException.class)
    public void testArgumentExceptionIfMaxLessThanMin() {
        Model model = new Model();
        int min=40;
        int max=20;
        int randNum = model.rand(min,max);

    }


    @Test
    public void testRandFrom0to100() {
        Model model = new Model();
        int min=0;
        int max=100;
        int numberOfTests=1000;
        for(int i=0;i<numberOfTests;i++)
        {
            int randNum = model.rand(min,max);
            Assert.assertTrue(randNum>=min&&randNum<=max);
        }
    }
}
