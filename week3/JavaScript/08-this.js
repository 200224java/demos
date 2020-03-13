/**
 * We've seen the 'this' keyword in Java, and it is very similar in JavaScript as it is
 * in Java. However, there are some significant differences.
 *
 * The 'this' keyword refers to different things in different contexts.
 *
 * - When used alone, outside any contexts, this refers to the global window object
 * - When used in a function, it refers to the global window object as well
 * - When used with event handlers, it refers to the HTML element that is the
 *    recipient of the event
 */

// Examples

var windowObj = this;
// This is the global window object as expected
var bigFoot = 'BigFoot is totally real, prove me otherwise!';
console.log(windowObj);

console.log(bigFoot);
console.log(windowObj.bigFoot);

function func() {
  var proof = 'BigFoot is absolutely a myth!';
  console.log(this.bigFoot);
  console.log(bigFoot);
  console.log(this);
  console.log(proof);
}

func();

// 3rd context

/**
 * If you used this within an event handler (within an HTML file)
 *
 * <button onclick="this.style.display='none'">Button Text</button>
 *
 * The this keyword here, refers to the specific button element itself
 */
