import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'bull',
  templateUrl: './mycomponent.component.html',
  styleUrls: ['./mycomponent.component.scss']
})
export class MycomponentComponent implements OnInit {
  public myid: string = 'test';
  public lastname: string='Petrov';
  public styles={'color': 'red', 'fontsize':'32px'}
  public classes = {'myclass': true, 'myclass2': false}
  public human: string = 'child'; // man, woman, child 

  public users = [
    {
      name: 'Vasya',
      age: 12,
      sex: 'male'
    },
    { name: 'Vova',
      age: 16,
      sex: 'male'},
    { name: 'Inna',
      age: 24,
      sex: 'male'}
    ]
  constructor() {}

  ngOnInit(): void {
  }
  showMessage(name: string){
    alert(name);
    console.log(this.lastname);
  }
  changeStyle(){
    const randColor =() =>Math.trunc(Math.random() *255);
    const r = randColor();
    const g = randColor();
    const b = randColor();
    this.styles['color'] = `rgb(${r}, ${g}, ${b})`;
  }
  changeClasses(flag: boolean) {
    this.classes.myclass = !flag;
    this.classes.myclass2 = flag;
  }
}
