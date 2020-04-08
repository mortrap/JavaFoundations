package listPractice;


import interfaces.Man;
import interfaces.Woman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LinkedListPractice {
    public static void main(String[] args) {
//        MyNode node1 = new MyNode(new Object(), null);
        MyLinkedList<Object> linkedList = new MyLinkedList<>();
        Man yasha = new Man("Yasha", 40);
        Man serega = new Man("Serega", 33);
        Man sasha = new Man("Sasha", 31);
        Man gleb = new Man("Gleb", 28);
        Man vasiliy = new Man("Vasenka", 18);
        linkedList.add(yasha);
        linkedList.add(serega);
        linkedList.add(sasha);
        linkedList.add(gleb);
        linkedList.add(vasiliy);
        System.out.println(linkedList.toString());
        linkedList.remove(2);
        linkedList.add(sasha);
        System.out.println(linkedList.toString());
        linkedList.size();
        System.out.println("linkedList.contains(sasha) = " + linkedList.contains(sasha));
//        System.out.println("linkedList.toArray() = " + Arrays.toString(linkedList.toArray()));
//        linkedList.remove(sasha);
//        System.out.println("linkedList.toArray() = " + Arrays.toString(linkedList.toArray()));
        System.out.println(linkedList.toString());
        MyLinkedList<Woman> womanLinkedList = new MyLinkedList<>();
        Woman galina = new Woman("Galina", 45);
        Woman kristina = new Woman("Kristina", 16);
        Woman svetlana = new Woman("Sveta", 26);
        Woman toma = new Woman("Tamara", 35);
        womanLinkedList.add(galina);womanLinkedList.add(kristina);womanLinkedList.add(svetlana);
        linkedList.addAll(womanLinkedList);
        System.out.println(linkedList.toString());
//        linkedList.addAll(2, womanLinkedList);
//        womanLinkedList.clear();
        System.out.println(womanLinkedList.toString());
        System.out.println("womanLinkedList.get(2) = " + womanLinkedList.get(2));
//        System.out.println("womanLinkedList.set(2, toma) = " + womanLinkedList.set(2, toma));
        System.out.println(womanLinkedList.toString());
        System.out.println("linkedList.contains(yasha) = " + linkedList.contains(yasha));
        Man gena = new Man ("Gennadiy", 38);
//        linkedList.add(3, gena);
        System.out.println(linkedList.toString());
        linkedList.indexOf(sasha);
//        linkedList.removeAll(womanLinkedList);
        linkedList.add(serega);
        System.out.println(linkedList.toString());
        linkedList.containsAll(serega);
        linkedList.contains(toma);
    }
}
