package com.company;

public class Main {
    public static void main(String[]Args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.size = 122;
        cat.weight = 22;
        cat.say();
        cat.name = "Bublik";
        dog.name = "Bim";
        dog.age = 12;
        dog.size=111;
        dog.weight=222;
        dog.say();
        //явное преобразование обьекта dog
        //в обьект типа animal

        Animal a = dog;
        a.name = "Bobik";
        System.out.println(dog.name);

        float res = avgWeight(dog, cat);
        //побитовые операции
        //побитовые операторы
        //& - битовый "И"
        //| - битовый "Или"
        // << - побитовый сдвиг влево
        // >> - побитовый сдвиг вправо
        // побитовые операции возможны только для целых чисел
        System.out.println(3&13); //= 0
        System.out.println(3 | 13); //= 15
        int v = 349;
        System.out.println(v >>2);// = 87
        System.out.println(v<<3);// = 232


    }
    public static float avgWeight(Animal ...animals){
        float w=0;
        for(Animal a: animals ) {
            w += a.weight;
        }
        return w/animals.length;
    }
}
