package homework_course7;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Homework_8 {
    public static void main(String[] args) {

        List<Assignment> moviesPaperWork = new ArrayList<>();
        moviesPaperWork.add(new Assignment(UUID.randomUUID(), 2, "The Lord Of The Rings", DifficultyLevel.EASY));
        moviesPaperWork.add(new Assignment(UUID.randomUUID(), 6, "The Hobbit", DifficultyLevel.MEDIUM));
        moviesPaperWork.add(new Assignment(UUID.randomUUID(), 9, "Vikings", DifficultyLevel.HARD));
        moviesPaperWork.add(new Assignment(UUID.randomUUID(), 3, "Peaky Blinders", DifficultyLevel.EASY));
        moviesPaperWork.add(new Assignment(UUID.randomUUID(), 5, "The Last Kingdom", DifficultyLevel.MEDIUM));

        //1. List using .stream().map()
        System.out.println("\n List of unique Ids");
        final Set<UUID> uniqueIds2 = moviesPaperWork.stream()
                .map(Assignment::getUniqueId)
                .collect(Collectors.toSet());
        uniqueIds2.forEach(System.out::println);



        //2.
        System.out.println("\n List filtered for difficulty level: easy");
        moviesPaperWork.stream()
                .filter(assignment -> assignment.getMyLev().equals(DifficultyLevel.EASY))
                .forEach(System.out::println);

        //4.
        System.out.println("\n Map having unique ids and assignment values");
        Map<UUID, Assignment> movieMap = moviesPaperWork.stream()
                .collect(Collectors.toMap(Assignment::getUniqueId, Function.identity()));
        movieMap.forEach((uuid, assignment) -> System.out.println(movieMap));




    }
}
