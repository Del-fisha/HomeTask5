import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        // заполнение книги
        phoneBook.put("Иван Иванов", Arrays.asList("8-911-555-1234", "8-905-555-5678"));
        phoneBook.put("Светлана Петрова", Arrays.asList("8-911-555-8765"));
        phoneBook.put("Кристина Белова", Arrays.asList("8-905-555-4321", "8-921-555-8765"));
        phoneBook.put("Анна Мусина", Arrays.asList("8-911-555-1234", "8-921-555-5678"));
        phoneBook.put("Анна Крутова", Arrays.asList("8-905-555-8765"));
        phoneBook.put("Иван Юрин", Arrays.asList("8-905-555-4321", "8-911-555-8765"));
        phoneBook.put("Петр Лыков", Arrays.asList("8-921-555-5678"));
        phoneBook.put("Павел Чернов", Arrays.asList("8-921-555-1234", "8-905-555-8765"));
        phoneBook.put("Петр Чернышов", Arrays.asList("8-911-555-5678"));
        phoneBook.put("Мария Федорова", Arrays.asList("8-905-555-1234"));
        phoneBook.put("Марина Светлова", Arrays.asList("8-911-555-5678", "8-905-555-4321"));
        phoneBook.put("Мария Савина", Arrays.asList("8-921-555-8765"));
        phoneBook.put("Мария Рыкова", Arrays.asList("8-911-555-1234", "8-921-555-8765"));
        phoneBook.put("Марина Лугова", Arrays.asList("8-905-555-5678"));
        phoneBook.put("Анна Владимирова", Arrays.asList("8-911-555-1234", "8-921-555-5678"));
        phoneBook.put("Иван Мечников", Arrays.asList("8-921-555-8765"));
        phoneBook.put("Петр Петин", Arrays.asList("8-911-555-1234", "8-921-555-5678"));
        phoneBook.put("Иван Ежов", Arrays.asList("8-911-555-5678"));

        // поиск повторяющихся имен
        Map<String, Integer> nameCount = new HashMap<>();
        for (String name : phoneBook.keySet()) {
            String firstName = name.split(" ")[0]; // получаем имя
            if (nameCount.containsKey(firstName)) {
                nameCount.put(firstName, nameCount.get(firstName) + 1); // увеличиваем счетчик
            } else {
                nameCount.put(firstName, 1); // добавляем имя в список
            }
        }

        // вывод повторяющихся имен
        System.out.println("Повторяющиеся имена:");
        for (String firstName : nameCount.keySet()) {
            if (nameCount.get(firstName) > 1) {
                System.out.println(firstName + " - " + nameCount.get(firstName));
            }
        }

        // сортировка номеров телефонов по убыванию популярности
        List<Map.Entry<String, List<String>>> phoneList = new ArrayList<>(phoneBook.entrySet());
        phoneList.sort((o1, o2) -> o2.getValue().size() - o1.getValue().size());

        // вывод отсортированных номеров телефонов
        System.out.println("Номера телефонов:");
        for (Map.Entry<String, List<String>> entry : phoneList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}