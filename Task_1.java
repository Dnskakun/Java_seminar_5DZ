/**
 * Реализуйте структуру телефонной книги с помощью HashMap,
 * учитывая, что 1 человек может иметь несколько телефонов.
 */

public class Task_1 {
    public static void main(String[] args) {
        Task_1_PhoneBook phoneBook = new Task_1_PhoneBook();
        
        phoneBook.addContact("Иванов", "+79843246559");
        phoneBook.addContact("Иванов", "+79843246559");
        phoneBook.addContact("Петров", "+73541256578");
        phoneBook.addContact("Иванов", "+76824595578");
        phoneBook.addContact("Сидоров", "+73576549815");

        System.out.println(phoneBook.getContact("Иванов"));
        
        System.out.println(phoneBook.getAllContacts());

        phoneBook.removeContact("Васильев");
        phoneBook.removeContact("Иванов");

        System.out.println(phoneBook.getAllContacts());

    }
}