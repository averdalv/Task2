package ua.training;

import java.util.List;

public class View {
    public static final String WRONG_INPUT = "Wrong input!";
    public static final String LESS_NUMBER = "Wrong number, it should be less";
    public static final String GREATER_NUMBER = "Wrong number, it should be greater";
    public static final String WIN_MESSAGE = "Congratulations! You Win!";
    public static final String INPUT_MESSAGE = "Enter integer number from range";
    public static final String SPACE = " ";
    public static final String LEFT_BRACKET = "[";
    public static final String RIGHT_BRACKET = "]";
    public static final String HISTORY = "Your attempts:";
    public String getRange(Model model) {
        return View.LEFT_BRACKET + model.getLeftRange() + View.SPACE + model.getRightRange()+ View.RIGHT_BRACKET;
    }
    public void printMessage(String message) {
        System.out.println(message);
    }
    public void printInputMessage(Model model)
    {
        System.out.println(View.INPUT_MESSAGE+View.SPACE+getRange(model));
    }
    public void printAttempts(List<Integer> attempts)
    {
        System.out.println(View.HISTORY);
        for(Integer attempt:attempts)
        {
            System.out.println(attempt);
        }
    }
}
