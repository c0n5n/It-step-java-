package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Serialization
        //сериализация - это представление обьекта(или примитивного типа)
        //в двоичном виде (для записи в файл, передачи по сети и т.д.)
        //Десереализация - обратная конвертация в примитивный тип
        File f = new File("1.bin");
        if (!f.exists()) {
            f.createNewFile();
        }
        //серриализация
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeInt(10);
        oos.writeDouble(-34.30);
        //не все обьекты в Java подвергаются сериализации
        //только те классы которых реализуют интерфейс Serializable
        User u = new User();
        u.setAge(13);
        u.name = "Petya";
        u.job = new Job();
        u.job.name = "programmer";
        u.job.salary = 10000000;
        oos.writeObject(u);

        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i<20;i++) {
            User user = new User();
            user.setAge(i);
            users.add(user);
        }

        oos.writeObject(users);
        oos.close();
        fos.close();


        //десериализация
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);

        //Чтение данных из бинарного потока
        //Должно происходить в том же порядке, что
        //и была произведена запись
        int x = ois.readInt();
        double d = ois.readDouble();
        User u2 = (User) ois.readObject();
        ArrayList<User> usersList = (ArrayList<User>)ois.readObject();

        System.out.println(x);
        System.out.println(d);
        System.out.println(u2.name);
        System.out.println(u2.getAge());

        usersList.stream().forEach((user)-> System.out.println(user.getAge()));

        ois.close();
        fis.close();
    }
}
