package com.company;

public class Main {

    public static void main(String[] args) {
	byte b = 123;
	short s = 240;
	//int i = 2345436;
	long l = 1212;
	Long c = 123123142412L + 24;
	float f = 23425.2f;
	float f2= 14125.5f;
	double d = 1234.56567;
	char ch = '$'; // задаем символ по его коду
	char ch2 = 64;
	System.out.println((int)ch);
	System.out.println(ch2);
// условные операторы указывается логическое условие
		// {} указывается код который выполнится только в том случае, если условие истинно
		// >, <, <=, >=, == (равенство),
		if (f>=f2)	{
			System.out.println("if works");
		}
      //&&, знак и  || знак или
		if (s>= b || b==123 && s!=b) {
			System.out.println("gg");
		}
		boolean isMale = true;
		if (isMale) {
			System.out.println("true");
			// ! - ставится только перед логическими выражениями
			// также перед переменными типа boolean
			// для инвертирования логического значения

		}
		if(!isMale) {
			System.out.println("isfeMale");
		}
		// сразу после конструкции if () {}
		// можно указать блок else {}
		if (f2==124) {
			System.out.println("JAva");
		} else {
			// код выполнится только в том случае
			// если выражения указанные в if - ложно
			System.out.println("Python");
		}
 int age = 34;
		if (age<13) {
			System.out.println("Ребенок");
		}
			else {
				if (age>=13 && age < 21) {
					System.out.println("Teenager");
				} else {
					System.out.println("Взрослый");
				}
			}

		}


    }


