// A callback function is simply a function that is passed in
// as a parameter to another function
// This is a very common use-case of this feature
function caller(callback) {
  console.log(`Caller function invoked with param
  ${callback}`);
  callback(5, 6);
}

function other(one, two) {
  console.log(`The params are ${one} and ${two}`);
  console.log(`The result is ${one + two}`);
}

caller(other);

caller( (one, two) => {
  console.log(one);
  console.log(two);
});
