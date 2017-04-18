package ua.training;

public class Model {
    private int number;
    private int leftRange;
    private int rightRange;
    public int rand(int min,int max) {
        if (min > max) throw new IllegalArgumentException();
        return min + (int) (Math.random() * (max - min) + 1);
    }
    public int rand() {
        return rand(ConstData.LEFT_RANGE,ConstData.RIGHT_RANGE);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLeftRange() {
        return leftRange;
    }

    public void setLeftRange(int leftRange) {
        this.leftRange = leftRange;
    }

    public int getRightRange() {
        return rightRange;
    }

    public void setRightRange(int rightRange) {
        this.rightRange = rightRange;
    }
}
