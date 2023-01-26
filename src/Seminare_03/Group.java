package Seminare_03;

public class Group extends Department{


    public  Group(String titleGroup){
        setNameDept(titleGroup);
    }

    public void addWorker (Worker Name){
        workersInDept.add(Name);
    }
}
