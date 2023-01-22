package Seminare_02;

import java.util.ArrayList;

public class Person extends Human {

    public Library persLibr;
    public HomeAnimal persAnimal;

    public Person(String Name, String Gender, int Age, String PersLibr, String Animal){
        setName(Name);
        setAge(Age);
        setGender(Gender);
        this.persLibr = new Library(PersLibr);
        this.persAnimal = new HomeAnimal(Animal);
    }


 //   public void addBookToPers(String Author, String Title, String Lang){
//        persLibr.addBook(Author, Title, Lang);
//    }
    ArrayList<Person> names = new ArrayList<>();
    public void addName(Person Persona ){
        names.add(Persona);
    }

    public ArrayList <Person> getNames(){
        return names;
    }

    public void voice() {
        String name = getName();
        System.out.println("My name "+ name);

    }


}
