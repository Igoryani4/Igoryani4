package Lecture_05;

public class Main {
    public static void main(String[] args) {
        Summ <Integer, Integer> result = new Summ<>(2,5);
        Integer summ = result.getNum1()+ result.getNum2();
        System.out.println(summ);
        System.out.println(result.getNum1().toString());
        System.out.println(summ.toString());
    }
}
