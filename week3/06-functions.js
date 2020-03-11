// We can declare functions with the function keyword

// We can provide default values for parameter
function add(a = 0, b = 0) {
  return a + b;
}
// This additionally means that parameters can be optional
// They will utilize the default value if not provided

console.log(add(5, 10));
console.log(add(7));
console.log(add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
// Extra parameters are ignored


// This arrow notation was also added in ES6
// This is called an anonymous function or just arrow notation for a function
// Also referred to as lambdas
let otherAdd = (one, two) => {
  return one + two;
}

console.log(otherAdd(5, 6));

console.log(otherAdd('string1', 'string2'));


// This utilizes spread syntax to accomplish varargs, but the spread syntax
// can be used in other ways
function varargs(...stuff) {
  stuff.forEach( param => {
    console.log(param);
  })
}
varargs(1, 2, 3, 4, {}, 'Test string');
