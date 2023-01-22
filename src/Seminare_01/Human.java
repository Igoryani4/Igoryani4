package Seminare_01;

public abstract class Human {
    private String gender;
    private String name;
    private int age;

    public void setGender(String gender){
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public abstract void voice();
}
