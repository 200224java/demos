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

## Topics (Linux - AWS - DevOps (Jenkins) - Hibernate)
- Linux
  - Operating System
  - Open Source
  - Basic Linux Commands
    - man
    - cd
    - ls
    - mkdir
    - rm
    - mv
    - cat
    - touch
    - echo
    - grep
    - yum
    - ssh
    - scp
    - sudo
    - source
    - chmod
    - git
    - mvn
  - Less common commands:
    - usermod
    - chown
    - chgrp
    - which
    - groupadd
    - systemctl
  - Command Flags
    - -a, -l, etc
  - Command Line Editors
    - VIM
    - Nano
    - Emacs
  - Simple Bash Scripting
    - Uses sh command
  - Environment Variables in Linux
    - export varname=value
  - I/O Redirection
    - <, <<, >, >>, | Operators
  - Package managers
    - yum = Yellowdog Updater, Modified
  - File Permissions
    - Uses chmod and related commands
- AWS = Amazon Web Services
  - Pay Model (Pay for what you use)
  - Cloud Models
    - SaaS = Software as a Service
    - PaaS = Platform as a Service
    - IaaS = Infrastructure as a Service
    - (Technically there are more, but these are primary ones)
    - Software Infrastructure Components
      1. Application
      2. Data
      3. Runtime Environment
      4. Middleware
      5. Operating System
      6. Virtualization
      7. Servers
      8. Storage
      9. Networking
  - Offered Services (There are TONS more, but these are some commonly used ones)
    - EC2: Elastic Compute Cloud
    - EBS: Elastic Block Storage
      - SSDs that are attached EC2 instances
    - ELB: Elastic Load-Balancing
      - Control traffic to split between sources/targets evenly
    - RDS: Relational Databasing Service
    - S3: Simple Storage Service
      - Large object storage (up to 5000 TB+)
    - Route 53: Domain Name System (DNS) Service
    - AMI: Amazon Machine Image
      - Amazon's blueprints for Operating Systems
    - IAM: Identity & Access Management
      - Role-based permissions/security
    - SG: Security Group:
      - Set of rules defining how traffic is filtered
  - Security Groups
  - Regions & Availability Zones
  - Key Pairs
- SonarCloud & Family
  - SonarLint
  - SonarCloud
    - Setup & Generating/Submitting Reports
  - SonarQube
- Jenkins
  - Build Automation Server
  - Used to Achieve DevOps
    - (DevOps is a combination of Development and Operations)
  - Create DevOps pipelines (using Jenkins) to automate the cycle of releasing products
    - Achieves CI/CD/CD
  - Steps to setup
    - Setup an EC2
    - Installed dependencies
      - Java
      - Maven
      - Tomcat
      - Jenkins
      - Git
    - Went through Jenkins GUI
      - Login with initialAdminPassword
      - Installed Suggested Plugins
      - Created a Freestyle Project
    - Create a maven project in a dedicated repository
      - Created a Github Webhook
      - Add Github related IPs to our Security Group to allow Webhook through
    - Created a Jenkins Job for that project
      - Configured Git with url
      - Use GitScm Polling
      - Execute Shell
        - Wrote a script to clean, compile, test, package, and deploy to tomcat
        - Later added on command to generate and submit SonarCloud report
- Hibernate
  - Is an ORM (Object-Relational Mapping/Mapper)
    - The goal is to perform SQL operations on a database in an object-oriented fashion
    - Mapped Classes to SQL Tables & Objects to Records in those tables
  - Hibernate API
    - Configuration Class
    - SessionFactory Interface
    - Session Interface
    - Transaction Interface
  - Obtain sessions from SessionFactory
    - Sessions are an abstraction around a connection
  - JPA = Java Persistence API
    - Provides many annotations to configure our classes as Hibernate "Entities"
  - Hibernate Object States
    - Transient
    - Persistent
    - Detached
  - Configuring Hibernate Mappings
    - XML
    - Annotations
      - @Entity
      - @Table
      - @Id
      - @Column (optional)
  - Methods that exist on Session
    - get() & load()
    - update() & merge()
    - save() & persist()
    - delete()
  - How to perform queries using Hibernate
    - Criteria Query API
      - CriteriaBuilder
      - CriteriaQuery
      - Root
    - HQL = Hibernate Query Language
    - Native SQL
    - Named Queries
  - Object Relationships & Cardinalities
    - @OneToOne
    - @OneToMany
    - @ManyToOne
    - @ManyToMany
    - @JoinColumn
    - @JoinTable
  - Hibernate Fetching Strategies
    - Eager (Default)
    - Lazy (Utilizies Proxies)
      - Can be difficult to work with
      - For example, load uses proxies, and if the session is closed when you to try to access that proxy, throws LazyInitializationException
      - Do have benefits
        - Don't need data if not going to be used
  - Hibernate Cascade Types
    - ALL
    - DETACH
    - MERGE
    - PERSIST
    - etc
  - Hibernate utilizes Caching to provide optimizations
    - L1 cache built in
      - Session-scoped cache
    - L2 cache (Need to use from some other dependency)
      - SessionFactory-scoped cache
