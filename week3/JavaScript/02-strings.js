// 'use strict';

a = 'hello';
// If no keyword is used, the variable will be declared with var
// This will not happen if you declare at the top of the document
// to use only strict declarations with 'use strict'

console.log(a);

var templateLiteral = `
This is a template literal
It allows for multi-line strings
as well as string interpolation`;

console.log(templateLiteral);

var literal2 = `The value of variable a is ${a}`;
// Template literals are static once declared, so if the
// value of the variable a is updated, the template literal
// is NOT updated
console.log(literal2);

a = 'Something else'

console.log(literal2);

var mathLiteral = `5 + 5 = ${5 + 5}`;

console.log(mathLiteral);

// Template literals use the backtick character (`)
// to the left of 1 on your keyboard
