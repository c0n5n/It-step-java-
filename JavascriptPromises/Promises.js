

const p = new Promise((resolve,reject) => {
    //resolve,reject - это лямбды(функции)

    if(true) {
        resolve([1,2,5,68]); //все хорошо
    } else {
        reject('error'); //все плохо
    }
});

//если в промисе сработал resolve, то вызовется лямбда,
//которая указана в then()
//если в промисе сработал reject, то вызовется лямбда,
//которая указана в catch()
p
.then((arr)=>{
    console.log('ok');
    return arr.filter(e=>e<10);
})
.then((arr)=>{
    return arr.reduce((prev,v)=> prev+v);
})
.then((result)=>{
    console.log(result);
})
.catch((e)=>{
        console.log(e);
})

console.log('continue');

// любая асинхронная функция оборачивает возвращаемый результат
//в обьект Promise
async function test() {
    return 123;
}
const res =test();
res.then((res)=> {


console.log(res);
});
async function test2(){
    const res = await test();
    console.log(res);
}

test2();







