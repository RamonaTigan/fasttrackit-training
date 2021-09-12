package homework_course7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.UUID;

public class AssignmentCollections {
    public static void main(String[] args) {
        //2. Collection with unique elements
        Assignment assign1 = new Assignment(UUID.randomUUID(), 3, "Holiday", DifficultyLevel.EASY);
        Assignment assign2 = new Assignment(UUID.randomUUID(), 5, "Last plane", DifficultyLevel.MEDIUM);
        Assignment assign3 = new Assignment(UUID.randomUUID(), 8, "Best choises", DifficultyLevel.HARD);
        HashSet<Assignment> paperWork = new HashSet<>();
        paperWork.add(assign1);
        paperWork.add(assign2);
        paperWork.add(assign3);
        System.out.println(paperWork);

        //3. Sorted collection, compared by course number
        Assignment assign4 = new Assignment(UUID.randomUUID(), 2, "The benefits of laughing", DifficultyLevel.EASY);
        Assignment assign5 = new Assignment(UUID.randomUUID(), 7,"From dusk till dawn", DifficultyLevel.MEDIUM);
        Assignment assign6 = new Assignment(UUID.randomUUID(), 11, "Unstoppable", DifficultyLevel.HARD);
        TreeSet<Assignment> morePaperWork = new TreeSet<>(new AssignmentComparator());
        morePaperWork.add(assign4);
        morePaperWork.add(assign5);
        morePaperWork.add(assign6);
        System.out.println(morePaperWork);


        //5.
        DifficultyLevel myLev = DifficultyLevel.EASY;
        DifficultyLevel myLev1 = DifficultyLevel.MEDIUM;
        DifficultyLevel myLev2 = DifficultyLevel.HARD;

        HashMap<Integer, String> paperWorkMap = new HashMap<>();
        paperWorkMap.put(2, myLev.toString());
        paperWorkMap.put(5, myLev1.toString());
        paperWorkMap.put(11, myLev2.toString());
        System.out.println(paperWorkMap.get(11));



    }
}
