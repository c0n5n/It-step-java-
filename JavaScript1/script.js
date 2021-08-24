console.log("Javascript");
//comment
/*
comment
*/

/*высокоуровневый, 
интерпретируемый, не строготипизированный*/

//создание переменной или константы.
var a = 123123;
console.log(a);
a="hello";
console.log(a);

let b = true;
b = 12;


//var - область видимости-это весь скрипт на странице()
//(глобальная область видимости)

//Let - область видимости - ближайшие{}
{
    let c =12;
    var d =14;
}
// console.log(c);
console.log(d);
//console.log(c); - ошибк, с не видна

const pi=3.14; // const - область видимости как и у let

//массивы 
let arr = [1,2,true,"hello"];
console.log(arr);
console.log(arr.length);

// циклы 
for(let i=0;i<5;i++){
    console.log(i);
}

let j=3
while(j!=0){
    console.log;
    j--;
}

do{
    j++;
    console.log("js");
} while(j<4);

//в i записываются индксы элементов массива
for(let i in arr){
        console.log(arr[i]);
}
//в e записываются значения элементов массива
for(let e of arr){
    console.log(e);
}
// continue
//break
console.clear();

//условные операторы
if(true){

}else{

}

switch(a) {
    case 2:
        console.log("hi!");
        break;
        default:
            console.log("default");
}

//null 
let obj =null;
let obj2=undefined;
let obj3 = 0;
let obj4 = "";
if(!obj)// obj!=null 
{
    console.log("no")
}
if(!obj2) {
    console.log("no")
}
if(!obj3) {
    console.log("no")
}
if(!obj4) {
    console.log("no")
}

console.log(2=="2"); //не сравнивает типы
console.log(2==="2"); //сравнивает типы
//!= не сравнивает типы
//!== сравинвает типы

//тернарный оператор
let test=a>0?78:"test";


//функции 
function sum(a,b){ //область видимости как и у var
    return a+b;
}

console.log(sum(12,45, 100,56,78,89));

function min(a,b,c){
    if(a==undefined){
        return undefined;
    }
    if(b==undefined){
        return a;
    }
    if(c==undefined){
        return a<b ? a:b;
    }
    if(a<b && a<c){
        return a;
    }
    return b<c? b:c;
}
console.log(min());//undefined
console.log(min(20,10));//10
console.log(min(2,3,1));//1

function calcTotalBill(bill, tips=0.2){
    return bill*(1+tips);
}

console.log(calcTotalBill(200));
console.log(calcTotalBill(150,0.25));

let fn = sum;
let fn2 = function(){
console.log(x);
}
console.log(fn(1,6));
fn2("test");

function test_bill(fn, bill, tips=0.2){
    console.log(fn(bill,tips));
}

test_bill(calcTotalBill, 100);

let fact = (n) => {};
fact = (n)=> console.log(n);
fact = (n)=> console.log(n);
fact = n=> n==1 ? 1 :n*fact(n-1);

console.log(fact(5));

// работа со строками
let s ="string";
let s2= 'string';
let name ="Vasya"
let s3 = `My name is ${name}`;
console.log(s3);


