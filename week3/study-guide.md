# Study Guide (Overall Concepts)

For each topic, I suggest you be able to answer these overall questions:
  Tell me about your experience with X.
  What is X?
  How does X work?
  Why should I use X?

Additionally, be able to follow up with more detail as needed.
As well as examples for them.

Make sure you are able to offer specific syntax for each of these topics.

I also suggest reviewing the "How to do well in QC" document that was shared and pinned in the slack workspace (general channel).

Make sure to be continuously practicing your communication style/soft skills as discussed
with me in our interviews, as well as with the PDP team.
Along with Enthuware and Hackerrank (Also CodeSignal) practice.

## Topics (HTML - CSS - Bootstrap - JavaScript)
- Misc
  - SonarLint
  - URI vs URL
- HTML 5
  - HyperText Markup Language
  - What is a Markup Language?
  - What are some tags?
    - Specific examples with syntax
  - What are attributes?
    - class, id, name, style (and more)
  - What are forms?
  - Events & Listeners
    - Bubbling & Capturing
- CSS
  - Cascading Style Sheets
  - What are selectors?
    - id, class selectors
    - Sibling and Child selectors
    - Pseudo class and pseudo element selectors
    - Attribute Selectors
  - CSS Box Model
    - Margin, Border, Padding, Content (Outside -> In)
  - How to include
    - External StyleSheet
    - Internal StyleSheet
    - Inline styles
- Bootstrap
  - Why would I use it?
  - Pros/Cons
  - Some common classes
    - container, container-fluid, row
    - miscellaneous column classes
  - Bootstrap Grid System
    - 12 columns per row
- JavaScript
  - What is it?
  - Is it the same as Java?
  - How to include JavaScipt?
  - Types
  - Template Literals
  - Truthy/Falsey
  - Variables Scopes
    - Global and Functional
      - Variable Hoisting with var
    - ES6 added in Lexical aka Block scope
      - Using let and const ONLY
  - Closures
  - Arrow Notation (Lambdas or Anonymous Functions)
  - How function parameters work
    - Extra parameters are unused
    - Can offer default values
  - Objects
    - Key-Value pairs
    - Object Literal Notation (curly-braces)
      - No 'new' keyword needed
    - Can use 'new' keyword when utilizing functions as classes
      - As well as the 'class' keyword added in ES6
    - JSON
      - What is it?
  - The 'this' keyword
  - Callback functions
    - What are they?
    - Why do I want to use them?
  - Prototypal Inheritance
    - With ES6, can use more practical inheritance syntax
      - Although it still uses Prototypal inheritance under the hood
  - DOM Manipulation
    - What is the DOM?
    - document.getElementById
    - document.getElementsByClassName
    - document.getElementsByName
    - document.getElementsByTagName
    - etc
    - Can chain these methods (functional programming)
      - Offers more specific selection
    - document.createElement
    - elementVar.append or elementVar.appendChild
  - Cancelling Events
  - Declaring Event Listeners in JavaScript (as well as HTML)
  - Event Object (Recommend looking more into this)
  - AJAX
    - Asynchronous JavaScript And XML
    - What can we use it for?
      - Sending HTTP requests
        - HyperText Transfer Protocol
        - Several common Verbs/Methods
          - GET, POST, PUT, DELETE, PATCH, etc
        - Status Codes in HTTP Response
          - 2XX Series responses mean success
            - 200 OK
            - 201 Created
            - 204 No Content
    - XMLHttpRequest Object
      - 4 Steps to send a request
      - readyState property
      - onreadystatechange property
        - What is it for?
      - responseText property
- Enterprise Architecture
  - Monolith vs Microservices (High Level)
  - Send HTTP Requests across internet
    - Communicate between frontend and backend
      - Frontend = HTML, CSS, JavaScript
        - What contributes to what the User sees?
      - Backend = Java, OracleSQL database, etc
        - What forms the foundation of the application?
- XML vs JSON
  - Pros & Cons
- XML
  - eXtensible Markup Language
  - Some characteristics
  - Well-Formed vs Valid
  - Namespaces
  - How to Parse
    - JAXP: Java API for XML Parsing
      - SAX (Simple API for XML Parsing) vs DOM (Document Object Model)
  - How to define Valid
    - DTD: Document Type Definition
    - XSD: XML Schema Definition
- SDLC: Software Development LifeCycle
  - The steps of SDLC
    1. Requirements Phase
    2. Analysis Phase
    3. Design Phase
    4. Development Phase
    5. Testing Phase
    6. Deployment and Maintence Phase
  - Waterfall
  - Agile
    - It is a approach/mindset
    - CI/CD/CD (Remember, this ties into DevOps)
      - Continuous Integration
      - Continuous Delivery
      - Continious Deployment
  - Pros & Cons
  - When they should be used
  - What WE will be using in training (Agile-Scrum)
    - Scrum (Agile Methodology)
    - What is it?
    - Roles
    - Meetings
    - Artifacts
