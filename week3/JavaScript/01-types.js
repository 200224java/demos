/*
There are several datatypes in JS:

number
string
boolean
undefined
object
function*
null*
*/

function logType(input) {
  console.log('input is:')
  console.log(input)
  console.log('And its type is ' + typeof(input));
}

logType(5)

logType(a)
var a = 'Something';
logType(a);
/**
 * JavaScript has a 'feature' called hoisting.
 *
 * When you declare a variable with 'var', the declaration
 * of that variable is moved to the top of either the function or
 * the entire document
 *
 * If that variable was outside any functions, it will be hoisted
 * to the top of the JS document
 */

let b = 'Else';
logType(b);

logType(true)

logType({})

logType({
  key1: 1,
  key2: true,
  key3: 'value3'
})
// Objects in JavaScript are just key-value pairs
// We define them as object literals using JavaScript Object Notation: JSON

/**
 * JSON, being so easy to use and not tied to any specific language
 * (There are no keywords)
 * Is a very nice language-agnostic data-interchange format
 */

logType(JSON.parse(`{
  "key1": 1,
  "key2": true,
  "key3": "value3"
}`))

var obj = {
  car: 'Sedan',
  make: 'Nissan',
  model: 'Rogue',
};

logType(JSON.stringify(obj))

logType(null);

if(isNaN(NaN)) {
  console.log("Test");
}

var l = 1 / 'hello';

console.log(l)

if(l === NaN) {
  console.log("Test 2");
}

logType(NaN);

logType([1, 2, 3]);

logType(logType);

logType(1 / 0);

logType(1 / -Infinity);

logType(0 == -0);

logType(0 / 0);

logType(Infinity / -Infinity);

logType(5 + '5');

logType(3 / 3.1);

logType(false + "true");

logType(true + true);

logType('' == []);

/**
 * JavaScript has liberal type-casting features
 * Which can make it difficult to properly compare values
 * So JavaScript additionally has strict comparison, the === operator
 * To not only compare values, but also their types
 */
