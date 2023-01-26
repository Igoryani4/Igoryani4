package Seminare_03;

import java.util.ArrayList;

public class Printer {
    public  static void print(ArrayList<Group> items){
        for (Group item : items){
            System.out.println(item);
        }
    }
}
