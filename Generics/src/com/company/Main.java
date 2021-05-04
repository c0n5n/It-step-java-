package com.company;

public class Main {
    //Generics
    public static void main(String[] args) {
        //если тип дженерика явно не указан, то по умолчанию будет
        //использоваться класс Object
	User u = new User();

	User<Integer, Float> u2 = new User<>();
	u2.id = 12;
	u2.setId(122);

	User<String, Integer> u3 = new User<>();
	u3.id ="id_121123";
	u3.salary = 100;

	u2.<Integer>test(21, 12);

	Cat [] cats = new Cat[]{
			new Cat(),
			new Cat(),
	};
	Dog[] dogs = new Dog[]{
			new Dog(),
			new Dog(),
			new Dog(),
	};
	Printer p = new Printer();
	p.<Cat>printArray(cats);
	p.<Dog>printArray(dogs);
    }
}
