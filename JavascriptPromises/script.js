
//Promises

const users = [
{
    name:"Vasya",
    age: 12,
    email:"vasya@mail.ru"
},
{
    name:"Petya",
    age: 13,
    email:"petya@mail.ru"
},
{
    name:"Irina",
    age: 16,
    email:"irina@mail.ru"
},

];

function showUsers(users) {
    const tbody = document.querySelector('#users >tbody');
    tbody.innerHTML ='';
  /* tbody.childNodes.forEach((child) =>{
   child.remove();
   });*/

   /*
   <tr>
   <td>user.name</td>
   <td>us
   </tr>
   */
   for (let user of users) {
    const tr = document.createElement('tr');

    const tdName = document.createElement('td');
    tdName.innerText = user.name;

    const tdAge = document.createElement('td');
    tdAge.innerText = user.age;

    const tdEmail = document.createElement('td');
    tdEmail.innerText = user.email;

    const tdAction = document.createElement('td');
    const delBtn = document.createElement('input');
    delBtn.type = 'button';
    delBtn.value = 'Remove';
    delBtn.addEventListener('click', () =>  {
        const index = users.indexOf(user);
        if (index !==-1) {
            users.splice(index, 1);
            showUsers(users);
        }
    });
    tdAction.appendChild(delBtn);


    tr.append(tdName, tdAge, tdEmail, tdAction);
    tbody.appendChild(tr);
   }
}
showUsers(users);

function addUser(){
    const name = document.getElementById('name');
    const age = document.getElementById('age');
    const email = document.getElementById('email');
    
    users.push({
        name: name.value,
        age:age.value,
        email:email.value
    });
    showUsers(users);
    name.value=null;
    name.value = null;
    name.value = null;
}