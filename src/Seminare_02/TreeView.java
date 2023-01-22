package Seminare_02;

public class TreeView {
    public static void view (Person root, int n){
        String line  = "_".repeat(n);
        System.out.println(line+ root.getName());
        for (Person i : root.getNames()){
            view( i,n + 1);
        }
    }

    public static void viewBook (Person root){

        System.out.println(root.persLibr.libraryName);
        for (LibraryBooks s: root.persLibr.listBook){
            System.out.println(s.boobAuthor + " " + s.bookTitle + ".");

        }
    }

    public static void viewAnimal (Person root){

        System.out.println(root.persAnimal.homeAnimal);
        for (HomeAnim e: root.persAnimal.MyAnimals){
            System.out.println(e.hType + " " + e.hName + " "+ e.hColor);

        }
    }
}
