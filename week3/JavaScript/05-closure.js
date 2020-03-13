
var x = function cake() {
  var flour = true;
  var cornMeal = false;
  var cupsOfSugar = 1;

  function bake() {
    var heat = 350;

    console.log("Baking cake at " + heat + " degrees!");
    console.log("Flour? " + flour);
    console.log("Corn Meal? " + cornMeal);
    console.log("Cups of Sugar: " + cupsOfSugar);

    heat++;
    flour = !flour;
    cornMeal = !cornMeal;
    cupsOfSugar++;

    otherfunc();
  }

  function otherfunc() {
    console.log('Other function!');
  }

  return bake;
}

var y = x(); // Invoke the cake() function and returns the bake function
// By doing this action, we LOSE access to the cake function
// We instead have x as an alias for the inner bake function

y();
y();
y(); // Each of these is invoking the bake() function

y = x();

y; // does nothing
y();
y(); // invokes a function
y();

// x(); // POINTING to cake() (outer) function

/**
 * Some characteristics of closures:
 *
 * 1) Allow an inner function to access an enclosing function's variables
 * 2) Allow an inner function to preserve (closure) an enclosing function's scope
 */

// This is ENCAPSULATION


// This stuff below is unrelated
var test = {
  otherfunc: () => {
    console.log("Test function");
  }
}

test.otherfunc();
