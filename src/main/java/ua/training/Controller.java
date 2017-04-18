package ua.training;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Controller {
    private Model model;
    private View view;
    private List<Integer> attempts;

    public Controller(Model model, View view) {
        this.view=view;
        this.model=model;
        this.model.setNumber(this.model.rand());
        this.model.setLeftRange(ConstData.LEFT_RANGE);
        this.model.setRightRange(ConstData.RIGHT_RANGE);
        attempts=new ArrayList<Integer>();
    }
    public void processUser() {
        Scanner sc=new Scanner(System.in);
        int numberFromUser;
        do {
            numberFromUser = getNumberFromUser(sc);
            addNumberToAttempts(numberFromUser);

        }while(!checkNumber(numberFromUser));
    }

    public int getNumberFromUser(Scanner sc) {
       view.printInputMessage(model);
        while( ! sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT);
            view.printInputMessage(model);
            sc.next();
        }
        int numberFromUser=sc.nextInt();
        if(numberFromUser<0||numberFromUser>100) {
            view.printMessage(View.WRONG_INPUT);
            return getNumberFromUser(sc);
        }
        return numberFromUser;
    }
    public void addNumberToAttempts(int number) {
        attempts.add(number);
    }
    public boolean checkNumber(int numberFromUser)
    {
        if(numberFromUser>model.getNumber())
        {
            model.setRightRange(numberFromUser);
            view.printMessage(View.LESS_NUMBER);
        }
        else if(numberFromUser<model.getNumber()) {
            model.setLeftRange(numberFromUser);
            view.printMessage(View.GREATER_NUMBER);
        }
        else {
            view.printMessage(View.WIN_MESSAGE);
            view.printAttempts(attempts);
            return true;
        }
        return false;
    }
}
