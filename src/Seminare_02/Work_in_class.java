package Seminare_02;

public class Work_in_class {
    public static void main(String[] args) {
        //Person father = new Person("Petr");
        //Person son = new Person("Vasya");
        //Person sister = new Person("Yulia");
        //Person sister_son = new Person("Tolya");


        Person dad = new Person("Petya", "man", 34, "lib1", "My Animal");
        Person son = new Person("Tolya", "man", 15,"lib2", "son Animal");

        dad.persLibr.addBook("Pushkin", "Hero", "Ru");
        dad.persLibr.addBook("Tolstoy", "War and Piece", "Ru");
        son.persLibr.addBook("People", "Alphabet", "Ru");

        dad.persAnimal.addAnimal("Cat", "Vasya", "Red", 5);
        son.persAnimal.addAnimal("dog", "Grey", "brown", 2);

        dad.addName(son);
        TreeView.view(dad, 0);
/*        father.addName(son);
        father.addName(sister);
        sister.addName(sister_son);  */
        System.out.println("*".repeat(15));
        TreeView.viewBook(dad);

        System.out.println("*".repeat(15));
        TreeView.viewBook(son);
        dad.voice();

        System.out.println("*".repeat(15));
        TreeView.viewAnimal(dad);


        System.out.println("*".repeat(15));
        TreeView.viewAnimal(son);

    }
}
