/**
 * AJAX: Asynchronous JavaScript And XML
 *
 * We've seen that we can use JavaScript to add dynamic functionality
 * to our webpage.
 *
 * However, it is primarily limited to information accessible from
 * that webpage already.
 *
 * For example, we can manipulate static information in a static way,
 * or we can introduce dynamic funcitonality by including
 * inputs on that webpage.
 *
 * Regardless, all of the information is already on the page.
 * This is not always the case in the real world.
 *
 * We want to be able to access information stored on some other
 * computer (our server), and dynamically manipulate our webpage
 * based on that information.
 *
 * To do this, we need to use HTTP requests. AJAX allows us to send these
 * HTTP requests.
 *
 * It utilizes this XMLHttpRequest objects
 */

let button = document.getElementById("btn");
button.addEventListener("click", ajax);

let input = document.getElementById("input");

function ajax() {

  // STEP 1: Create an XMLHttpRequest object
  let xhr = new XMLHttpRequest();
  // console.log(xhr);

  // STEP 2: Define the function that will be executed
  // every time the readyState changes
  /**
   * The readyState property defines the current state of this HTTP request
   * There are 5 states (0 through 4)
   *
   * 0: UNSENT - open() method has yet to be called
   * 1: OPENED - open() method HAS been called
   * 2: HEADERS_RECEIVED - The request has received a response,
   *        and the headers have been received, as well as the status
   * 3: LOADING - Currently downloading the response. The responseText
   *        property contains the actual response
   * 4: DONE - Operation is complete
   */
  xhr.onreadystatechange = function() {
    if(this.readyState == 4 && this.status == 200) {
      let data = JSON.parse(xhr.responseText);
      // console.log(data);
      placeImage(data);
    }
  }

  // STEP 3: Open the XMLHttpRequest
  // This allows us to define the url and HTTP verb for the request
  xhr.open("GET", "https://pokeapi.co/api/v2/pokemon/" + input.value);

  // STEP 4: Send it
  xhr.send(); // Sending the request to the server
}

function placeImage(data) {
  let output = document.getElementById("output");
  let paragraph = document.createElement("p");
  paragraph.innerHTML = "Name: " + data.name;
  let image = document.createElement("img");
  output.append(paragraph);

  image.setAttribute("src", data.sprites.front_shiny);
  output.append(image);
  output.append(document.createElement("hr"));
}
