package Seminare_04;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("1", 5000);
        System.out.println(acc1.getId());
//        int a = (int) acc1.getId();  //требуется явное приведение к типу int

        Account acc2 = new Account("Vladik", 1000);
        System.out.println(acc2.getId());

        AccounWorker acc3 = new AccounWorker(1, 2500.0);
        String [] people = {"Valera", "Vasya", "Petya"};
        Integer[] numbers = {1,23,45,6,34,14};
        Printer.<String >print(people);
        Printer.<Integer>print(numbers);


    }
}
