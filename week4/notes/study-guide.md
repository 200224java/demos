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

## Topics (Servlets - REST - TypeScript - Angular)
- Servlet Intro
  - Servlet Heirarchy
    1. Servlet Interface
    2. GenericServlet Abstract Class
    3. HttpServlet Abstract Class
    4. CustomServlet (The one we create)
  - FrontController Design Pattern
    - Only make 1 or a few Servlets, and switch on the URI (or portions of the URI)
- Container & LifeCycle
  - Tomcat is Web Container
  1. HTTP Request sent to Server
  2. Tomcat creates a flat file (no file extension) for HTTP response & creates Java objects for Request & Response
  3. Tomcat (Web Container) consults Deployment Descriptor (web.xml)
  4. Delegates Request & Response objects to a particular Servlet
    1. If Servlet is not instantiated, the init() method is called
    2. The service() is called to process the response
    3. If a long time passes without the Servlet being used, the destroy() method is called
  5. Servlet hands response back to Tomcat
  6. Tomcat populates HTTP response flat file with information from object
  7. Tomcat sends the response back
- HTTP: HyperText Transfer Protocol
  - Contents of HTTP Request/Response
  - Status Codes
    - 1XX Series: Informational
    - 2XX Series: Success
    - 3XX: Redirections
    - 4XX: Client-Side Errors
    - 5XX: Server-Side Errors
- Servlet Config vs Context
- Redirection with forward() vs sendRedirect()
  - forward() is on RequestDispatcher, which originates from request
  - sendRedirect() is on response
    - Creates a new HTTP Request
  - Forward/sendRedirect to either other servlets, or static web pages
- Session Management
  - HttpSession
    - choose whether or not to create a new session
    - End session with invalidate() method
- Handling Data
  - Use getParameter() method to retrieve query parameters or information from a form
  - Use getReader() to read from the body of the request
  - Use getWriter() to write to the body of the response
- Jackson-Databind ObjectMapper
  - How it works
  - readValue()
  - writeValueAsString()
- Exception/Error handling with Servlets
  - Error pages in web.xml
- REST: REpresentational State Transfer
  - Represent our data as a collection of resources
  - Each resource has a unique endpoint
  - Adheres to the meaning behind the HTTP verbs/methods and status codes
  - 6 Traits/Characteristics/Properties of REST
    - Cachable
    - Stateless
    - Client-Server Relationship
    - Layered Architecture
    - Uniform Interface
    - Provide Code on Demand (optional)
  - Richardson Maturity Model (Which defines steps for becoming more RESTful) (optional)
    - Similar to the idea of Normalization
  - HATEOAS: HyperMedia As The Engine Of Application State (optional)
    - Ties into the idea of Client-Server Relationship & Uniform Interface
- TypeScript
  - What is it?
    - Superset of JavaScript
    - It has many additional features
      - Most common feature is support for strict typing
  - Transpiled into JavaScript
  - Some features:
    - Decorators
    - Access Modifiers
      - public, protected, private (There is NO default)
    - Additional data types
      - any
      - never
      - unknown
- Node
  - Node.js
    - JavaScript Runtime Environment
    - Includes npm
      - Node Package Manager
        - A package manager install, update, and remove packages, and manages their versions
          - A package is some sort of dependency/library
      - Angular installed with npm
- Angular
  - Has a CLI: Command Line Interface to interact
    - ng serve to start development server (NOT needed/used for production; ONLY in development)
    - ng build to transpile to javascript to deploy static files to a web server
    - ng generate _________ to automatically create necessary files and update modules as needed
  - Differences between AngularJS & Angular 2+
    - AngularJS uses JavaScript but Angular 2+ uses TypeScript
  - It is a framework for developing Single Page Applications
    - A website that is composed of a SINGLE html page
    - Leverages heavy use of DOM manipulation to make it appear as if it were multiple pages
  - 3 Primary features
    - Components
      - A segment of a webpage
        - A view (anything that can be seen)
          - HTML & CSS files
        - Logic (to control the view)
          - TypeScript file
        - Optional testing file
          - spec.ts file
      - Follows the MVC Design Pattern
        - Model - View - Controller
      - Can be layered with other components (components of components)
      - Uses the @Component decorator to associate the 3 required files with each other
      - LifeCycle hooks (methods that are invoked at different times)
        - ngOnInit()
        - ngOnChanges()
        - ngOnDestroy()
        - etc
        - We can implement these interfaces to have some functionality execute at specific times
    - Modules
      - Container for Components & Services
      - Organizational structure
      - Can import other modules
      - Offers some features such as lazy loading
        - Configured with routing
      - A new Angular project starts with 1 root module (Generally auto-named AppModule)
      - Can of course add more modules as needed
      - Uses the @NgModule decorator
    - Services
      - Dedicated/Isolated logic that is not associated with a view
      - Uses the @Injectible decorator
        - Services in Angular can be injected elsewhere
          - The Dependency Injection design pattern
          - Other components/services do not have to care where the object comes from,
            it just has access to it
            - This makes development clean and organized (very convenient)
      - Commonly used to perform HTTP requests with HttpClient
        - Often stores results from these requests to be shared across multiple components
        - HttpClient is the Angular API to perform HTTP requests
          - It contains many methods for the different HTTP verbs
            - get
            - post
            - put
            - delete
            - options
            - request
          - Is a convenient wrapper around AJAX to make HTTP requests easier to utilize
  - Many other features
    - Routing
      - Angular's means of simulating multiple webpages
      - Maps portions of the URI to specific components
      - Can leverage parameterized routes
        - metadata inside the route itself
      - Wildcards for defining unused paths/urls
      - Needed to utilize Module's lazy loading feature
    - Directives
      - 2 primary kinds
        - Structural Directives (Use * as a prefix)
          - *ngIf
          - *ngFor
          - *ngSwitch
        - Attribute Directives
          - ngStyle
          - ngClass
    - Pipes
      - Used to transform data in some way
        - Very customizable
        - Can accomplish filtering, but be careful
          - Do NOT expose large amounts of data to a filter pipe
    - Data-Binding
      - String Interpolation
        - Uses {{ }} syntax
      - Property/Attribute Binding
        - Uses [] syntax
      - Event Binding
        - Uses () syntax
      - Two-Way Data-Binding
        - Requires FormsModule to be imported
        - Uses [(ngModel)] syntax
        - Use the phrase "banana in a box" to remember the syntax [()]
    - Observables (RxJs Library)
      - Modern API to make asynchronous requests/tasks
      - Compare/Contrast with Promises
        - Promises cannot be cancelled, whereas Observables CAN (using unsubscribe() method)
        - Observables can return multiple values whereas Promises can only return 1
        - Observables have a more comprehensive API
          - map method
          - reduce method
          - etc
      - RxJs Subjects
        - Used to accomplish multiple listeners on a single observable
          - Impossible to accomplish without subjects
    - Other cool features in Angular (optional)
      - Parent/Child Components
        - Utilize @Input and @Output decorators
      - @Output decorator is used with EventEmitters
