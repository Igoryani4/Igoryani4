package Seminare_01;

public class Work_in_class {
    public static void main(String[] args) {
        //Person father = new Person("Petr");
        //Person son = new Person("Vasya");
        //Person sister = new Person("Yulia");
        //Person sister_son = new Person("Tolya");


        Person dad = new Person("Petya", "man", 34, "lib1");
        Person son = new Person("Tolya", "man", 15,"lib2");

        dad.persLibr.addBook("Pushkin", "Hero", "Ru");
        dad.persLibr.addBook("Tolstoy", "War and Piece", "Ru");
        son.persLibr.addBook("People", "Alphabet", "Ru");

        dad.addName(son);
        TreeView.view(dad, 0);
/*        father.addName(son);
        father.addName(sister);
        sister.addName(sister_son);  */
        System.out.println("*".repeat(15));

        TreeView.viewBook(dad);

        TreeView.viewBook(son);
        dad.voice();
    }
}
