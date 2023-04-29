/*
* Task_1_PhoneBook
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_1_PhoneBook {

    private Map<String, List<String>> map = new HashMap<>();

    void addContact(String name, String phoneNumber) {
        if (map.containsKey(name)) {
            List<String> list = map.get(name);
            if (!list.contains(phoneNumber)) {
                list.add(phoneNumber);
            } else {
                System.out.println("Такой номер телефона уже есть у контакта " + name);
            }
            
        } else {
            List<String> list = new ArrayList<>();
            list.add(phoneNumber);
            map.put(name, list);
        }
    }

    String getContact(String name) {
        return name + ": " + map.get(name);
    }

    String getAllContacts(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    void removeContact(String name) {
        if (map.containsKey(name)) {
            map.remove(name);
        } else {
            System.out.println("Такого контакта нет в телефонной книге");
        }
    }
    
}