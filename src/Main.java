import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 6, 7));
        String str = "Легендарный Лунный Скульптор или Легендарный Скульптор Лунного Света Виид (Ли Хэн) главный герой всей серии книг Легендарный Лунный Скульптор, известен как «Бог Войны». ";
        List<String> words = new ArrayList<>(List.of("один", "два", "два", "три", "три","один", "два", "два", "три", "три", "три"));

        task1(nums);
        task2(nums);
        task3(str);
        task4(words);
    }

    public static void task1(List<Integer> list) {
        System.out.println("Задание 1");
        for (Integer number : list) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void task2(List<Integer> list) {
        System.out.println("Задание 2");
        Set<Integer> set = new TreeSet<>(list);
        for (Integer number : set) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void task3(String str) {
        System.out.println("Задание 3");
        List<String> words = new ArrayList<String>(Arrays.asList(str.split(" ")));
        Set<String> uniqueWords = new HashSet<>(words);
        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }
    }

    public static void task4(List<String> words) {
        System.out.println("Задание 4");
        Set<Integer> set = new TreeSet<>();
        for (String word : words) {
            int frequency = Collections.frequency(words, word);
            set.add(frequency);
        }
        System.out.println(set);

    }

}