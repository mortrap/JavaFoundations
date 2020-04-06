package listPractice;

import interfaces.Man;
import interfaces.Woman;

import java.util.ArrayList;

public class MyArrayListRunner {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        Man yasha = new Man("Yasha", 40);
        Man serega = new Man("Serega", 33);
        Man sasha = new Man("Sasha", 31);
        Man gleb = new Man("Gleb", 28);
        Man vasiliy = new Man("Vasenka", 18);
        myArrayList.add(serega);
        myArrayList.add(yasha);
        myArrayList.add(new Man("Yasha", 22));
        myArrayList.add(1, sasha);
        myArrayList.add(3, gleb);
        myArrayList.add(1, vasiliy);
        System.out.println(myArrayList);
        System.out.println("myArrayList.size() = " + myArrayList.size());
//        myArrayList.remove(0);
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
        System.out.println("myArrayList.indexOf(serega) = " + myArrayList.indexOf(serega));
        System.out.println("myArrayList.contains(sasha) = " + myArrayList.contains(sasha));
        System.out.println("myArrayList.indexOf(sasha) = " + myArrayList.indexOf(sasha));
        ArrayList subArrayList = new ArrayList(3);
        Woman galina = new Woman("Galina", 45);
        Woman kristina = new Woman("Kristina", 16);
        Woman svetlana = new Woman("Sveta", 26);
        subArrayList.add(galina);
        subArrayList.add(kristina);
        subArrayList.add(svetlana);
        myArrayList.addAll(subArrayList);
        System.out.println(myArrayList);
        myArrayList.set(0, svetlana);
        myArrayList.set(8, serega);
        System.out.println(myArrayList);
        System.out.println("myArrayList.containsAll(subArrayList) = "
                + myArrayList.containsAll(subArrayList));
        myArrayList.remove(sasha);
        System.out.println(myArrayList);
        myArrayList.toArray();
        myArrayList.clear();
        System.out.println("myArrayList.isEmpty() = " + myArrayList.isEmpty());
    }
}
