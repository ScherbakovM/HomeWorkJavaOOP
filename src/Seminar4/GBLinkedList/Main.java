package Seminar4.GBLinkedList;

public class Main {
    public static void main(String[] args) {
        GBLinkedList<String> pets = new GBLinkedList<>();
        pets.append("Kitty"); // добавление в конец
        pets.append("Cow");
        pets.append("Mouse");
        pets.append("Tiger");
        pets.append("Cat");
        pets.append("Dog");
        System.out.println(pets.toString());
        System.out.println(pets.length()); // длина
        pets.prepend("Worm"); // добавление в начало
        pets.prepend("Hors");
        System.out.println(pets.toString());
        System.out.println(pets.getIndex(3)); // элемент по индексу
        System.out.println(pets.length());
    }
}