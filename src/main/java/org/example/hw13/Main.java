package org.example.hw13;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<String> names = Arrays.asList("Max", "Kate", "Ann", "Vika", "Stas");
        List<String> genders = Arrays.asList("male", "female");

        Map<String, List<String>> usersByGender = Stream.generate(() ->
                new User(
                        names.get(rnd.nextInt(names.size())),
                        rnd.nextInt(30),
                        rnd.nextBoolean() ? "email@example.com" : null,
                        genders.get(rnd.nextInt(genders.size()))
                ))
                .limit(20)
                .filter(user -> user.getAge() > 18)
                .sorted(Comparator.comparing(User::getName))
                .filter(user -> user.getEmail() != null)
                .collect(Collectors.groupingBy(User::getGender, Collectors.mapping(User::getName, Collectors.toList())));

        System.out.println(usersByGender);
    }
}
