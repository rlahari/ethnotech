import java.util.HashSet;
import java.util.Set;

public class IdCollection {

    public static void main(String[] args) {

        Set<Integer> idCollection = new HashSet<>();

        idCollection.add(101);
        idCollection.add(102);
        idCollection.add(103);
        idCollection.add(104);
        idCollection.add(105);
        idCollection.add(106);
        idCollection.add(107);
        idCollection.add(108);
        idCollection.add(109);
        idCollection.add(110);

        System.out.println("ID collection is : " + idCollection);

        System.out.println("Contains 105 : " + idCollection.contains(105));

        System.out.println("Size : " + idCollection.size());

        idCollection.remove(110);

        System.out.println("After removing 110 : " + idCollection);

        System.out.println("Is Empty : " + idCollection.isEmpty());

        for (Integer id : idCollection) {
            System.out.println(id);
        }

        idCollection.clear();

        System.out.println("After clear : " + idCollection);
    }
}