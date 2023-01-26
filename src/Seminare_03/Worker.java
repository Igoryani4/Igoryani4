package Seminare_03;

import java.util.Scanner;

public class Worker extends Human{
    String titleDepartment;


    public Worker (String Name,  String Gender , int Age){
        setName(Name);
        setAge(Age);
        setGender(Gender);

    }
    public boolean checkAddGroup (Group group){
        System.out.println("Do you have work in group" + group.nameDept + "? :");
        System.out.println("Input yes/no");
        Scanner sc = new Scanner(System.in);
        String question = sc.nextLine();
        sc.close();
        return question.equalsIgnoreCase("yes");

    }

    public String  promotion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You have worked long and productively and we want to promote " +
                "you to the position of manager");
        System.out.println("""
                Your opinion:\s
                1. Yes I want to
                2. No I want to stay in this department
                Please input number\s""");
        int opinion = sc.nextInt();
        if (opinion == 1) {
            System.out.println("Excellent you as new manager, congratulations");
            return "Managers";
        }

        return "IT";
    }

}
