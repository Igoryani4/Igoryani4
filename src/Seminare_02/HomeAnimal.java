package Seminare_02;

import java.util.ArrayList;

class HomeAnim{
    public String hType;
    public String hName;
    public String hColor;
    public int hAge;
}
public class HomeAnimal extends Animal{
    public String homeAnimal;

    public HomeAnimal(String homeAnimal){
        this.homeAnimal = homeAnimal;
    }

    ArrayList<HomeAnim> MyAnimals = new ArrayList<>();


    public void addAnimal(String Type, String Name, String Color, int Age){
        HomeAnim he = new HomeAnim();
        setType(Type);
        setName(Name);
        setAge(Age);
        setColor(Color);
        he.hAge = getAge();
        he.hColor = getColor();
        he.hName = getName();
        he.hType = getType();
        MyAnimals.add(he);

    }
    public ArrayList<HomeAnim> getMyEnimals(){
        return MyAnimals;
    }


    @Override
    public void enimalVoice() {
        String type = getType();
        System.out.println(type.equalsIgnoreCase("cat")? "May".repeat(2):"");
        System.out.println(type.equalsIgnoreCase("dog")? "Gaw".repeat(3):"");
    }



}
