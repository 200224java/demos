// As we have seen, JavaScript DOES have some object-oriented features
// We saw we can use the new keyword with functions or classes (as of ES6)
// And when we printed to the console, it mentioned what class that object was

// This implies that we do have inheritance
// However, it doesn't take the same form as it does in Java

// JavaScript has what is referred to as "Prototypal Inheritance"
// Each object has a property called "__proto__"
// And this is some object
// The default value for this property is a built in object that looks like this:
// {} <-- The empty object

// This is the parent or "prototype" of all objects that we make in JavaScript
// Similar to the Object class in Java

let car = {
  color: 'red',
  wheels: 3,
  fourdoor: true,
}

console.log(car);

let rogue = {
  color: 'blue',
  wheels: 4,
  make: 'Nissan',
  model: 'Rogue',
}

rogue.__proto__ = car;

console.log(rogue);
console.log(rogue.fourdoor);

// JavaScript has the idea of:
// If it looks like a duck, quacks like a duck, and walks like a duck,
// then it IS a duck

// The idea is that any object that has ALL of the properties and behaviors
// of another object, IS an instance of that object/type
