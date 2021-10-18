package Lesson4;
import java.util.*;
public class Words {
    public static void main(String[] args) {
        num1();
        num2();
    }

    private static void num1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "овощи", "фрукты", "инжир", "инжир",
                "картофель", "картофель", "картофель",
                "морковь", "яблоко", "груша",
                "абрикос", "абрикос", "абрикос",
                "груша", "груша", "помидор",
                "ананас", "банан", "ежевика", "ежевика"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void num2() {
        Directory directory = new Directory();

        directory.add("Егоров", "89001231212");
        directory.add("Иванов", "89105554433");
        directory.add("Петров", "89105554233");
        directory.add("Сидоров", "89105554438");
        directory.add("Антонов", "89105054433");
        directory.add("Есин", "89105564433");
        directory.add("Есин", "89105554437");
        directory.add("Моисеев", "89105554431");
        directory.add("Майоров", "89155554433");

        System.out.println(directory.get("Егоров"));
        System.out.println(directory.get("Моисеев"));
        System.out.println(directory.get("Петров"));
        System.out.println(directory.get("Есин"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }
}
