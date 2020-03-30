package listPractice;

import interfaces.Man;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        Man vitalik = new Man("Vitalik", 30);
        Man semen = new Man("Semen", 22);
        Man alexandr = new Man("Alexandr", 31);

        List<Man> myList = new ArrayList<>();
        myList.add(vitalik);
        myList.add(semen);
        myList.add(alexandr);
        for (Man man : myList
        ) {
            System.out.print(man.getName() + " ");
        }
        System.out.println();
        System.out.println("myList.size() = " + myList.size());
        System.out.println("myList.contains(vitalik) = " + myList.contains(vitalik));
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i).getAge() + " ");
        }
        System.out.println();
        //Создал список длиной 20
        List<Integer> alexList = new ArrayList<>(20);
        System.out.println("alexList.size() = " + alexList.size());
        //Наполнил целыми числами равными индексам
        for (int i = 0; i < 20; i++) {
            alexList.add(i, i);
            System.out.print(alexList.get(i));
        }
        //вывести первый элемент
        System.out.println("alexList.get(0) = " + alexList.get(0));
        //Вывести последний элемент
        System.out.println("alexList.get(alexList.size()-1) = " + alexList.get(alexList.size() - 1));
        //Создал ещё список размером 5
        List<Integer> secList = new ArrayList<>(5);
        //Наполнил значениями ниже
        secList.add(45);
        secList.add(48);
        secList.add(51);
        secList.add(54);
        secList.add(57);
        //Добавил в список длиной 20 список длиной 5
        alexList.addAll(secList);
        // В тот же список добавил подряд 5 элементов
        Collections.addAll(alexList, 66, 66, 66, 66, 66);
        // в первую позицию 6ой элемент
        alexList.add(0, alexList.get(6));
        // в третью позицию 8 элемент
        alexList.add(3, alexList.get(7));
        // удалить элемент под двадцатым индексом
        alexList.remove(20);
        // удалить эемент со значением 48
        alexList.remove((Integer) 48);
        //проверить есть элемент со значением 66
        System.out.println("alexList.contains(66) = " + alexList.contains(66));
        //вывести список на экран
        for (int i = 0; i < alexList.size(); i++) {
            System.out.print(alexList.get(i) + " ");
        }
        System.out.println();
        System.out.println("List: " + alexList.toString());
        // Вывести элементы под индексом кратным трём
        for (int i = 0; i < alexList.size(); i++) {
            if (i % 3 == 0) {
                System.out.print(alexList.get(i) + " ");
            }
        }
        // продолжил задания уже с другим списком
        System.out.println();
        Person natasha = new Person("Natasha", "female", 22, "B3");
        Person natan = new Person("Natan", "male", 26, "C");
        Person artem = new Person("Artem", "male", 19, "A1");
        Person rita = new Person("Rita", "female", 19, "B1");
        Person ivan = new Person("Ivan", "male", 20, "A3");
        Person ignat = new Person("Ignat", "male", 19, "A2");
        Person sara = new Person("Sara", "female", 18, "B2");
        Person nikolay = new Person("Nikolay", "male", 18, "A1");
        Person feofan = new Person("Feofan", "male", 20, "A2");
        Person artem1 = new Person("Artem", "male", 20, "A1");
        Person ivan1 = new Person("Ivan", "male", 18, "B3");
        Person ivan2 = new Person("Ivan", "male", 19, "A3");
        Person nikifor = new Person("Nikifor", "male", 41, "A2");
        Person narayana = new Person("Narayana", "female", 29, "B4");
        List<Person> personal = new ArrayList<>();
        Collections.addAll(personal, narayana, nikifor, artem, nikolay, rita, ivan, ignat, sara,
                feofan, ivan1, artem1, ivan2, natasha, natan);
        int count = 0;
        for (int i = 0; i < personal.size(); i++) {
            if (personal.get(i).getName().equals("Ivan")) {
                count++;
                System.out.println(personal.get(i).getName() + " = " + count);
                //Выдернуть по имени и сосчитать
            }
        }
        System.out.println();
        for (int i = 3; i < personal.size(); i++) {
            System.out.print(personal.get(i).getAge() + " ");// Пропустить первых трех
        }
        System.out.println();
        count = 0;
        for (int i = 0; i < personal.size(); i++) {
            if (personal.get(i).getName().equals("Ivan") && (count < 2)) {
                i++;
                count++;
            }
            System.out.print(personal.get(i).getName() + " ");// Пропустить тех кого зовут Иван
        }
        System.out.print(" : this is the List without two Ivans");
        personal.add(2, ivan);
        personal.add(7, ivan1);
        System.out.println();
        count = 0;
        for (int i = 0; i < personal.size(); i++) {
            if (personal.get(i).getAge() % 3 == 0 && (count < 1)) {
                System.out.print(personal.get(i).getName() + " ");// показать первого, чей возраст делится на 3
                count++;
            }
        }
        System.out.println();
        for (int i = 0; i < personal.size(); i++) {
            if (personal.get(i).getAge() % 3 == 0) {
                System.out.print(personal.get(i).getName() + " : " + personal.get(i).getAge() + " "); // показать всех, чей возраст делится на 3
            }
        }
        System.out.println();
//Показать мужчин, имя которых начинается на N в возрасте от 18 включительно, до 27 невключительно.
        for (int i = 0; i <personal.size() ; i++) {
            if(personal.get(i).getSex().equals("male")&&personal.get(i).getAge()>=18&&
            personal.get(i).getAge()<27&&personal.get(i).getName().charAt(0)=="Name".charAt(0)){
                System.out.println(personal.get(i).getName()+ " "
                        + personal.get(i).getAge() + " " + personal.get(i).getSex());
            }
        }
    }
}
