/**
 * JavaScript has 2 main scopes:
 *
 * Global and functional scope
 *
 * We saw this earlier with JavaScript's hoisting
 *
 * The global scope is available everywhere in the document
 *
 * Variables of Functional scope are only available within that function
 *
 * One feature that ties into this is that JavaScript allows defining functions
 *  inside other functions
 */

function outer() {
  var a = 'hello';
  var num = 15;

  function inner() {
    var obj = {key1: 'value1'};
    console.log(a);
    console.log(num);
    console.log(obj);
  }

  inner();

  // console.log(obj);
}

outer();

// Orignally JavaScript only had these 2 scopes
// However in a later version ES6, let and const were added to declare variables
// let and const do not utilize hoisting
// And they have support for a new scope: block/lexical

function outer2(input) {
  if(input) {
    let test = 'value';
    var something = 'something';
  }

  // console.log(test);
  console.log(something);
}

outer2(false);

function constant() {
  const test2 = 'some string';

  // const test3;
  // Cannot declare with const if you don't initialize it

  console.log(test2);

  // test2 = 'other string';
}

constant();

function redeclare() {
  var a = 'something';

  console.log(a);

  var a = 'else';

  console.log(a);

  // The above statements work with no errors
  // The below statements fail, since b cannot be redeclared

  let b = 'something2';

  console.log(b);

  // let b = 'else2';

  console.log(b);
}

redeclare();

let b = 'other value';
console.log(b);
