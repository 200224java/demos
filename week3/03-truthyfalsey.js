/**
 * JavaScript has a lot of support for type conversion
 *
 * In particular, all values can be converted into booleans
 *
 * We refer to this as each value's truthy/falsey value
 *
 * If a value is converted into true, it is referred to as truthy,
 *
 * and likewise for falsey
 */

function checkTruthy(input) {
  console.log(`
  input = ${input}, and the type is ${typeof(input)}
  and the truthy/falsey value is ${!!input}`);
}

checkTruthy(true);

checkTruthy(1); // true?
checkTruthy(-1); // false? true? === TRUE
checkTruthy(0); // false?

// Any number outside of zero, is truthy
// zero is falsey

checkTruthy(NaN); // false? true? ==== FALSE

checkTruthy(null); // false? true? === FALSE
checkTruthy(undefined); // false? === FALSE

// All of these below are true since they are objects
checkTruthy({}); // true? false?
checkTruthy([]); // true? false?
checkTruthy({key1: 'value1'}); // true?
checkTruthy([1, 2, 3]); // true?

// ALL objects are always truthy

checkTruthy('true'); // truthy? YES
checkTruthy('false'); // truthy?
checkTruthy(''); // FALSE

// The empty string is falsey, and all other strings are truthy

checkTruthy(Infinity); // truthy?
checkTruthy(-Infinity);

// Both Infinity and -Infinity are truthy

checkTruthy(-1 / Infinity);
// Falsey

var other = checkTruthy;

other('true');

// Since in JavaScript functions are objects, we can assign them to other
// variables, and invoke from with that new alias

// This particular feature is VERY useful, which we utilize all the time
// In particular, we use them with event-listeners
