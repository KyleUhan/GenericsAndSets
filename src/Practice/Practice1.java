package Practice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kyle
 */
public class Practice1 {

    public static void main(String[] args) {

        List<Integer> numList = new ArrayList();
        numList.add(5);
        
        int x = numList.get(0);

        List<String> myList = new ArrayList<>();
        myList.add("Guitar");
        myList.add("Drums");
        myList.add("Singer");

//        for(int i = 0; i < myList.size();i++){
//            String value = myList.get(i).toString();
//            System.out.println(value);
//        }
        for (String s : myList) {
            System.out.println(s);
        }
        System.out.println(" \n");

        myList.remove(0);

        for (String s : myList) {
            System.out.println(s);
        }
        System.out.println(" \n");

        myList.add(0, "Guitar");

        for (Object s : myList) {
            System.out.println(s);
        }
        System.out.println(" \n");

        myList.set(0, "Bass Guitar");

        for (Object s : myList) {
            System.out.println(s);
        }
        System.out.println(" \n");

    }

}
