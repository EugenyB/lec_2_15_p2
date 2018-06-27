package lec215p2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(17,1,4,2,7,3,5,6,8,9,16,20));
        System.out.println(set);
        System.out.println(set.size());
        set.add(18);
        set.add(19);
        System.out.println(set);
        Set<String> strs = new TreeSet<>();
        strs.add("a");
        strs.add("aa");
        strs.add("ba");
        strs.add("ab");
        strs.add("abbbbb");
        System.out.println(strs);

        Set<Student> students = new TreeSet<>(
                Comparator.comparingInt(Student::getMark).reversed()
                        .thenComparing(Student::getName));
        students.add(new Student("Іван", 2));
        students.add(new Student("Василь", 4));
        students.add(new Student("Вєсиль", 4));
        students.add(new Student("Алекс", 5));
        students.add(new Student("Олексій", 4));
        students.add(new Student("Євген", 1));
        System.out.println(students);
    }
}
