/*
Andreas Nathanael Priambodo
Program Animals
 */
package modul4;
public class Animals {
    public static void main(String[] args) {
        boolean rabbit = true;
        boolean donkey = false;
        boolean leporidae = true;
        if (rabbit & donkey | donkey & leporidae | donkey)
        System.out.print("DOG ");
        if (rabbit & donkey | donkey & leporidae | donkey | rabbit)
        System.out.println("CAT ");
    }
}
