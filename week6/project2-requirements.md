Project 2 will be a group-based Full Stack application of your choosing.

Each team will decide on their own project idea to implement.
Each team must decide on a Team Leader, Team Name, Project Name, and Project Description. Then send this information to me on Slack (along with team members)

There are several requirements:

Spring Framework Backend
  - Structured as a REST API using SpringMVC
    - May still perform authentication, so does not need to be fully stateless
  - May NOT use Spring Data
  - Spring Boot technically is allowed, but it will generally make it much more difficult to configure SpringMVC
  - SpringORM & Hibernate
  - Log4J
    - Preferable to be performed in an Aspect using Spring AOP
  - JUnit Tests

Angular Frontend
  - Must consume your backend's REST API
  - Must consume another, completely separate, REST API

DevOps Pipeline
  - Must use Jenkins
  - Backend must be deployed
    - Using an EC2 is fine
  - Frontend may optionally be deployed, but is not required
