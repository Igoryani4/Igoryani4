package Seminare_03;

import java.util.ArrayList;
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

}
