import java.util.HashSet;
public class HashSetC {
    public static void main(String[] args) {
        //DECLARE -> INTEGER
        HashSet<Integer> set = new HashSet<>(); 
        set.add(5);
        set.add(15);
        set.add(8);
        set.add(29);
        set.add(7);
        System.out.println("Original Hashset: " +set);
        set.add(15);
        System.out.println("After adding again 15: "+set);
        // TO CHECK THE ELEMENT BY HASHSET OR NOT
        System.out.println(" is Contains?" +set.contains(15));

        //REMOVING ELEMENT 
        set.remove(105);
        System.out.println("After removing 105: "+set);

        //TO ITERATE OVER HASHSET
        for(int num:set){
            System.out.println(num+ "  ");
        }

        //REMOVE EVERYTHING FROM HASHSET
        set.clear();
        System.out.println("Clearing: "+set);
     }
    
}
