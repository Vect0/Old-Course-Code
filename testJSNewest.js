Copied from debugger console:


var obj1 = {color: "blue"};
 
var obj2 = {size: 33, __proto__: obj1};
 
Service Worker termination by a timeout timer was canceled because DevTools is attached.
obj2.color;
"blue"

--
class User {

  constructor(name) {
    this.name = name;
  }

  sayHi() {
    alert(this.name);
  }

}

let user = new User("John");
user.sayHi();

* is the same as:   *

function car(value){

		this.value=value;
}
 
car.prototype.thisCar = function() { return "it is " + this.value; }
var car1 = new car(3);
 
car1.thisCar();
"it is 3"

--
*static makes the function respective to the class and not the object that calls it and lets that function be called without an object declaration*

class myClass2{

	static hi() { return " static wutup"};

}
 
var myClassObj2 = new myClass2();

myClassObj2.hi();
VM325:1 Uncaught TypeError:

myClass2.hi();
" static wutup"



--

* good example of "this" *

var obj = {name: "paul"}

 
var obj2 = {name: "raul"}
 
function Hi () { return "Your name is " + this.name; }
 
obj.f = Hi;

obj.f();
"Your name is paul"
obj2.f = Hi;

obj2.f();
"Your name is raul"



--





--




--
