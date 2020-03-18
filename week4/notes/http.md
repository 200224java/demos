We are introducing a frontend to our applications. Project 0 did not have any frontend. But now we do, and we will communicate between them
using HTTP.

Our backend will use Tomcat as a Web Container. It will be responsible for retrieving and sending HTTP Requests and Responses.

Tomcat will handle the logic for actually receiving and sending these requests, our only concern will be populating the response with
relevant information.

This is accomplished using Java's Servlet API. Servlets are a Singleton Design Pattern that have some methods to process http requests.

Servlet is instantiated when it receives its first request. It will stay alive for a while, processing any requests. If a long time
passes without being used, it will be destroyed.

We can have as many Servlets as we want. But in general, it ends up being easier with only 1 or a few servlets. There is a design pattern
where we only have 1 servlet, called the Front Controller Design Pattern.


If your java application is running on the same computer as the client, the url is "localhost" = 127.0.0.1, otherwise the url is whatever the ip is.


Look into these topics for an overview, as well as some details of they operate
Servlet Inheritance Tree
  - Servlet Interface
  - GenericServlet Abstract Class
  - HttpServlet Abstract Class
  - CustomServlet Class
Servlet LifeCycle
  - init(): Logic to instantiate the Servlet object
  - service(): Logic to process requests
  - destroy(): Logic to destroy the Servlet object
Differences between:
  - sendRedirect()
    - On the response object (res.sendRedirect("static html page or URI to some servlet"))
    - Visible on the client side
    - Send a response back to the client that automatically triggers another request
      - General idea is that the request was asking for some outside resource
      - We are simply telling them to find that resource at some other location
  - forward()
    - On the RequestDispatcher interface
    - Indirectly on the request object (req.getRequestDispatcher("location").forward(req, res))
    - Not visible on the client
    - General idea is that the request was asking for information that the server does have,
      but it is in a different location
HTTP Request/Response structure
  - URL
  - HTTP Verb/Method
  - HTTP version
  - Query Parameters
  - Headers
  - Optional Body
  - Response also has the status
HTTP Status Codes
  - 1XX: Informational
  - 2XX: Successful
    - 200 OK
    - 201 Created
    - 204 No Content
  - 3XX: Redirection
    - 301 Moved Permanently
    - 307 Temporary Redirect
  - 4XX: Client-Side Errors
    - 400 Bad Request
    - 401 Not Authorized
    - 403 Forbidden
    - 404 Not Found
    - 418 I'm a Teapot
  - 5XX: Server-Side Errors
    - 500 Internal Server Error
    - 501 Not Implemented
    - 502 Bad Gateway
    - 504 Gateway Timeout
REST: REpresentational State Transfer
  - Our server contains a collection of resources
    - We will be transferring the state of these resources
    - We represent the state of these resources in different ways (JSON)
    - Uniquely identified by URI
      - Path variables / Path params
  - 6 Traits (characteristics/properties/constraints)
    - Cacheable
    - Uniform Interface
    - Layered Architecture
    - Stateless
    - Client-Server Relationship
    - Code on Demand (optional)
  - Extra
    - Richardson Maturity Model (RMM)
      - HATEOAS (HyperMedia As The Engine Of Application State)
Sessions
  - Why sessions?
    - User Experience
    - Security
