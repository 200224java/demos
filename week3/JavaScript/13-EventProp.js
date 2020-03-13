/**
 * Events in HTML will propagate through the DOM.
 * There are 2 phases, bubbling and capturing.
 * When we create event listeners, we can have trigger on the event
 * in either phase.
 * This allows us to define the order that some event listeners will
 * execute (to a certain extent)
 *
 * With bubbling, the innermost element will occur first, followed by
 * the outer elements.
 * With capturing, the outermost element will occur first, then
 * the further nested elements.
 *
 * For any single event, it will start in capturing phase, and once it reaches
 * the target element, it switches to bubbling, and "bubbles back up" to the top
 * of the DOM.
 */

let capturing = true;
let bubbling = false;

document.getElementById("inner").addEventListener("click", () => {
  alert("INNER - BUBBLING");
}, bubbling); // This third parameter is optional, and will default to false
// So, putting a false directly doesn't actually change anything

document.getElementById("middle").addEventListener("click", (event) => {
  alert("MIDDLE - BUBBLING");
  // event.stopPropagation(); // stopPropagation() will prevent the event
  // from continuing to propagate to the NEXT element
  // However, if there are multiple listeners on THIS element,
  // they will still occur.

  event.stopImmediatePropagation(); // stopImmediatePropagation() will also
  // prevent other event listeners on the SAME element from occuring.
}, bubbling);

document.getElementById("outer").addEventListener("click", () => {
  alert("OUTER - BUBBLING");
}, bubbling);

document.getElementById("inner").addEventListener("click", () => {
  alert("INNER - CAPTURING");
}, capturing);

document.getElementById("middle").addEventListener("click", () => {
  alert("MIDDLE - CAPTURING");
}, capturing);

document.getElementById("outer").addEventListener("click", () => {
  alert("OUTER - CAPTURING");
}, capturing);

document.getElementsByTagName("html")[0].addEventListener("click", () => {
  alert("HTML - CAPTURING");
}, capturing);

// At least for Chrome (possibly chromium based browsers),
// in the event of a tie for multiple event listeners on the same
// element, they will be executed in the order that they were created

// Note: On the element that triggered the event,
// it counts as a tie for both capturing and bubbling event listeners
