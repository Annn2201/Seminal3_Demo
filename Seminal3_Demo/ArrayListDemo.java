import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> arlist = new ArrayList<Integer>();

        for (int i = 0; i <= n; i++) {
            arlist.add(i);
        }

        System.out.println(arlist);

        arlist.remove(3);

        System.out.println(arlist);

        for (int i = 0; i < arlist.size(); i++) {
            System.out.println(arlist.get(i) + " ");
        }
    }
}
