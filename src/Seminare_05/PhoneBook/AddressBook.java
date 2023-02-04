package Seminare_05.PhoneBook;

import java.util.ArrayList;
import java.util.logging.Level;

import static Seminare_05.PhoneBook.Log.LOGGER;




public class AddressBook {

    public ArrayList<PhoneBook> pb = new ArrayList<>();

    public void AddresBook() {
        pb.add(new PhoneBook("Sidorov Sidor Fedorovich", "78945612321", "SPb"));
        pb.add(new PhoneBook("Ivanov Ivan Jovanovich", "7896321432", "Moscow"));
        pb.add(new PhoneBook("Petrov Petr Petrovich","7899874563", "Rostov"));
        LOGGER.log(Level.INFO,"Add contacts in list");
    }

    public void display(){
        for(PhoneBook i : pb){
            System.out.println(i.getName()+" "+i.getPhone()+" "+i.getCity());
        }
        LOGGER.log(Level.INFO,"Finish show all contacts");
    }
}
