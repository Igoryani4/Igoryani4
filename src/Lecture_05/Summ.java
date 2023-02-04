package Lecture_05;

public class Summ <T,D> {
    T num1;
    D num2;

    public Summ(T num1, D num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public void setNum2(D num2) {
        this.num2 = num2;
    }

    public D getNum2() {
        return num2;
    }

    public T getNum1() {
        return num1;
    }


    public String toString(Integer a) {
        return a.toString();
    }
}

