/* инкапсуляция, полиморфизм, наследование*/

const obj = {
    name: 'Vasya',
    age:0,

    info: () =>{
        console.log(`${this.name}, ${this.age}`);
    } 
};

obj.age =13;
obj.info();
console.log(obj);
console.log(obj[`name`]);
obj[`info`]();

obj["test"] = "12";// свойства тест нет в obj
obj.test=56;

/* v js вместо наследования используется прототипирование */

//обьект Object -
//является прототипом для всех обьектов(по умолчанию)

console.log(obj.toString());

const obj2 = {
    id:100,
    age:18,

    info: () => {
        console.log('hello');
    }
};
//obj2.__proto__ = obj; //не правильно
Object.setPrototypeOf(obj2, obj); //правильно
console.log(obj2);
console.log(obj2.name);

obj.name = 'Petya';
console.log(obj2.name);
console.log(obj.name);

function User(age){
    this.age = age
    ;

    this.info = ()=>{
        console.log(this.age);
    }
}
    const user = new User(13);
    const user2 = new User(15);
    console.log(user);
    console.log(user2);

    class Animal{
        color ='red';
        age;

        constructor(age,color){
            this.age=  age;
            this.color=color;
        }

        say() {
            console.log('???');
        }
    }

    class Dog extends Animal{
        name;
        #secret = 21;
        static paws = 4;
        //вычисляемое свойства (computed)
        ['test' +22]= 12;

        constructor(name,age,color){
            super(age,color);
            this.name=name;
        }
        say(){
            super.say();
            console.log('haw-haw');
            console.log(this.#secret);
        }
    }
    const animal = new Animal(10, 'red');
    console.log(animal);
    const dog = new Dog('Bobik', 2, 'brown');
    console.log(dog);
    console.log(dog.paws);

    try{
        throw new Error('aaaaa')
    }catch(e){
        if(e instanceof Error){
            console.log('error blet')
        }
        if (e instanceof Animal){
            console.log('its animal');

        }
        console.log(e.message);
    }finally{
    }
const n = 12.56;
const b = true;
const s = 'hello';
const obj3 = {};

const fn = () => {};
function test(){}

console.log(typeof n); // number
console.log(typeof b); // boolean
console.log(typeof s); // string
console.log(typeof obj3); //Object
console.log(typeof fn); // function
console.log(typeof Animal);//function

//функции генераторы - функции, 
//которые могут возвращать промежуточные значения без 
// завершения

function *gen(n) {
    n*=10;
    yield n; //типо ретурн не останавливающие функцию

    n--;
    yield n;
}

const it = gen(10);
console.log(it.next()); //{value:20, done:false} 
console.log(it.next()); //{value: 20, done: false}
console.log(it.next()); // {value: undefined, done:true}

