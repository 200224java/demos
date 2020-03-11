let objLiteral = {
  name: 'Larry',
  age: 29,
  func: () => {
    console.log("I am inside the objLiteral!");
  }
}

console.log(objLiteral);
console.log(objLiteral.age);
console.log(objLiteral.name);
objLiteral.func();

objLiteral.func = () => {
  console.log("I am not inside the objLiteral!");
}

objLiteral.func();

function Person(name, age, f) {
  this.name = name;
  this.age = age;
  this.func = f;
}

let otherPerson = new Person('Jerry', 108, () => {
  console.log("Hello there!");
});

otherPerson.func();
console.log(otherPerson);


// The class keyword was added in ES6
class PersonClass {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }
  // This will create the name and age member variables

  // Do not have to use the function keyword or use arrow notation
  func() {
    console.log("Inside the class definition")
  }

  // func(input1) {
  //   console.log(input1);
  // }
  // Don't have overloading in the Java typical sense
}

let secondPerson = new PersonClass('Mike', 42);
secondPerson.func();
secondPerson.func('some string');// This parameter will be ignored
