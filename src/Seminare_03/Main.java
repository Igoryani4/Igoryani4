package Seminare_03;



import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//    private ArrayList<Worker> noDeptWorker;

    public static void main(String[] args) {
        ArrayList<Worker> noDeptWorker = new ArrayList<>();

        Group depAcc = new Group("Accounting");
        Group IT = new Group("IT");
        Group manager = new Group("Managers");

        Main m = new Main();


        m.newWorker(noDeptWorker);
        m.addPersonaToGroup(noDeptWorker.get(0), depAcc);
        m.TrasferDept();

//        System.out.println(manager.workersInDept.get(0));
//        System.out.println(noDeptWorker.get(0));



    }
    /*public void menu(){
        Scanner sc = new Scanner(System.in);
        String title = String.valueOf(noDeptWorker);
        while (true){

            System.out.println("""
                Main menu:\s
                1. Create new worker.               
                2. Show all workers in group.
                3. Transfer worker.
                4. Promotion worker.
                5. Fired worker.
                6. Exit program.               
                Please input number\s""");
            int itemMenu = sc.nextInt();
            switch (itemMenu){
                case 1:
                    Main m = new Main();
                    newWorker(m.noDeptWorker);
                case 2:
                    selectGroup();
            }
        }

    }*/
 /*
    public ArrayList <W selectGroup(){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Menu Group:\s
                1. Accounting group.               
                2. IT group.
                3. Managers group.             
                Please input number\s""");
        int itemGroup = sc.nextInt();
        sc.nextLine();
        switch (itemGroup){
            case 1:
                return ;
        }
    }*/
    public void newWorker (ArrayList<Worker> title){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Input First name and second name: ");
        String name = sc.nextLine();
        System.out.print("Input Gender: ");
        String gender = sc.nextLine();
        System.out.print("Input Age: ");
        int age  = sc.nextInt();
        sc.nextLine();
        title.add(new Worker(name, gender, age));


    }


    public void addPersonaToGroup (Worker name, Group title){
        boolean check = name.checkAddGroup(title);
        if(check){
            title.addWorker(name);
            System.out.println(title.workersInDept.get(0));
        }
        else
            System.out.println("You're fired");
    }

    public String TrasferDept () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have transfer another group?");
        System.out.println("0- NO\n1- YES");
        int answer = sc.nextInt();
        sc.nextLine();
        if (answer == 0)
            System.out.println("Okey you stay this Group");
        String b = null;
        if (answer == 1) {
            System.out.println("How department you want to transfer?");
            System.out.println("1 - Managers\n2 - IT\n3 - Accounting");
            int transferToGroup = sc.nextInt();
            sc.nextLine();

            if (transferToGroup == 1)
                b = "Managers";
            if (transferToGroup == 2)
                b = "IT";
            if (transferToGroup == 3)
                b = "Accounting";
        }

        return b;
    }

    public void showGroupsWorkers (Group title){
        System.out.println(title.workersInDept);
    }


}
