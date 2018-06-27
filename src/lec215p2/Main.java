package lec215p2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        workWithSets();
//        workWithMaps();
//        example();
        example2();
    }

    private static void example2() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Іван", 2));
        students.add(new Student("Вєсиль", 2));
        students.add(new Student("Василь", 4));
        students.add(new Student("Алекс", 5));
        students.add(new Student("Олексій", 4));
        students.add(new Student("Євген", 1));
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------------------");
//        for (int i = 0; i < students.size(); i++) { // НЕ ДЕЛАЙТЕ ТАК
//            if (students.get(i).getMark()<3) {
//                students.remove(i);
//            }
//        }
        students.removeIf(student -> student.getMark() < 3); // МОДНАЯ ШТУКА КАК ТО, ЧТО НИЖЕ
//        for (Iterator<Student> iterator = students.iterator(); iterator.hasNext(); ) {
//            Student student = iterator.next();
//            if (student.getMark()<3) {
//                iterator.remove();
//            }
//        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void example() {
        String s = "it contains polymorphic algorithms that operate on collections";
        Map<Character, Integer> map = new TreeMap<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (Character.isLetter(aChar)) {
                int count = map.getOrDefault(aChar, 0);
                map.put(aChar, count + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void workWithMaps() {
        HashMap<String,Integer> map = new HashMap<>();
        System.out.println(map.put("one", 1));
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        System.out.println(map.put("four", -2));
//        map.put(null, null); // НЕ ДЕЛАЙТЕ ТАК НИКОГДА!!!
        System.out.println(map);
    }

    private static void workWithSets() {
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
