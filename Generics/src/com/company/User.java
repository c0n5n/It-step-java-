package com.company;

//в качестве типа для задания дженерика
//нельзя использовать примитивные типы
//в качестве типа для дженерика s
//можно использовать как любой класс наследующий класс Number
//так и сам класс Number
public class User<T,S extends Number> {
    public T id;
    public S salary;


    public T getId() {
        return this.id;
    }

    public void setId(T id){
        this.id=id;
    }

    public <V> V test(V value, T a) {
        System.out.println(value);
        System.out.println();

        return value;
    }
}
