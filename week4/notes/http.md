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
