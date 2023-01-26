package Seminare_03;

import java.util.ArrayList;

public abstract class Department {
    String nameDept;

    ArrayList<Worker> workersInDept = new ArrayList<>();




    public String getNameDept() {
        return nameDept;
    }

    public void setNameDept(String nameDept) {
        this.nameDept = nameDept;
    }
}
