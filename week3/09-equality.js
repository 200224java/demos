/**
 * We already talked about == vs ===
 * Which is equality vs strict equality
 *
 * Ex:
 * 5 == '5' -> true
 * 5 === '5' -> false
 */

function compare(one, two) {
  console.log(`
  one = ${one}, and is of type ${typeof(one)}
  two = ${two}, and is of type ${typeof(two)}
  one == two evaluates to ${one == two}
  one === two evaluates to ${one === two}`);
}

compare(5, '5');
compare('a', 97);
compare(null, undefined);// true false is correct
compare({}, []); // false false
compare({}, {}); // false false
// Objects are NEVER equal to each other
compare({}, null);
compare([], null); // false false
compare(NaN, NaN); // false false
// NaN is NEVER equal to itself
compare(null, null); // true true
compare(Infinity, Infinity); // true true
compare(Infinity, -Infinity); // false false
compare(5 / 0, Infinity); // true true
