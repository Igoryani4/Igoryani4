package Seminare_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> noDeptWorker = new ArrayList<>();
        Group depAcc = new Group("Accounting");
        Group IT = new Group("IT");

        Main m = new Main();
        m.setWorker(noDeptWorker);
        m.addPersonaToGroup(noDeptWorker.get(0), depAcc);


    }
    public void setWorker (ArrayList<Worker> noDeptWorker){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Input First name and second name: ");
        String name = sc.nextLine();
        System.out.print("Input Gender: ");
        String gender = sc.nextLine();
        System.out.print("Input Age: ");
        int age  = sc.nextInt();
        sc.nextLine();
        noDeptWorker.add(new Worker(name, gender, age));
        System.out.println(noDeptWorker);
    }

    public void addPersonaToGroup (Worker name, Group title){
        boolean check = name.checkAddGroup(title);
        if(check){
            title.addWorker(name);
        }
        else
            System.out.println("You false");
    }

    public void showGroupsWorkers (Group title){
        System.out.println(title.workersInDept);
    }


}
