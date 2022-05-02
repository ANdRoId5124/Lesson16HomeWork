import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Integer> digits = new ArrayList<>(25);
        int campcityOfDigits = 25;
        for (int i = 0; i < campcityOfDigits; i++) {
            Integer digit = (int) ((Math.random() * campcityOfDigits) + 1);
            digits.add(digit);
        }
        System.out.println(digits);
        List<Integer> z;
        z = digits.stream().filter((x) -> x >= 7 && x <= 17 && x % 2 == 0)
                .collect(Collectors.toList()); // sorted digits (between 7 and 17)
        System.out.println(z);
        z = digits.stream().distinct().collect(Collectors.toList()); // unique digits
        System.out.println(z);
        z = digits.stream().map(element -> element * 2).collect(Collectors.toList()); // digits x 2
        System.out.println(z);
        double k;
        long l;
        k = digits.stream().reduce((acum, element) -> acum += element).get();
        System.out.println(k / digits.size()); // average
        z = digits.stream().sorted().limit(4).collect(Collectors.toList()); // first  four digits of sorted collection
        System.out.println(z);
        System.out.println(digits.stream().count()); // amount of digits in collection
        double i = digits.stream().mapToInt(x -> x).average().getAsDouble();
        System.out.println(i); // average

        List<Students> buffer;
        List<String> names;
        List<Students> students = new ArrayList<>();
        Students student = new Students("Andrei");
        Students student1 = new Students("Olga");
        Students student2 = new Students("Alex");
        Students student3 = new Students("Alex");
        Students student4 = new Students("Victoria");
        Students student5 = new Students("Kiril");
        Students.addToList(students, student);
        Students.addToList(students, student2);
        Students.addToList(students, student3);
        Students.addToList(students, student4);
        Students.addToList(students, student5);
        System.out.println("---------------------------------------------------------------------");
        long andreiStudents = students.stream().filter(x -> x.getName().equalsIgnoreCase("Andrei")).count();
        System.out.println(andreiStudents);
        buffer = students.stream().filter(x -> x.getName().startsWith("A") || x.getName().startsWith("a"))
                .collect(Collectors.toList());
        names = buffer.stream().map(x -> x.getName()).collect(Collectors.toList());
        System.out.println(names);
        names = students.stream().map(x -> x.getName()).sorted().limit(1).collect(Collectors.toList());
        System.out.println(names);
    }
}