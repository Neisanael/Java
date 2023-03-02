package binary_search_tree;

import java.util.Scanner;

public class MainTree {

    public static void main(String[] args) {
        Scanner dtSc = new Scanner(System.in);
        Tree Ob = new Tree();
        Ob.Insert(42);
        Ob.Insert(21);
        Ob.Insert(38);
        Ob.Insert(27);
        Ob.Insert(71);
        Ob.Insert(82);
        Ob.Insert(55);
        Ob.Insert(63);
        Ob.Insert(6);
        Ob.Insert(2);
        Ob.Insert(40);
        Ob.Insert(12);
        System.out.println();
        System.out.print("Search Data : ");
        int search = dtSc.nextInt();
        TreeNode dataSearch = Ob.Search(search);
        if (dataSearch == null) {
            System.out.println("Data not Found");
        } else {
            System.out.println("Data " + dataSearch.getData() + " Found");
        }
    }
}
