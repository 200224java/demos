# AWS: Amazon Web Services
Amazon provides many technical services available on the cloud
They follow a pay as you go model, which means you are only charged for the exact up-time of the services that you are leveraging.

There are MANY different services
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

- Auto-scaling
  - Configuration for automatically scaling a service upwards to support larger loads
  - Vertical Scaling
    - Getting a larger/more powerful service
    - More memory
    - More storage
    - Strong CPU/GPU
  - Horizontal Scaling
    - Duplicating instances
    - Having many weaker servers running clustered

## Cloud Models

### Software Infrastructure Components
  1. Application
  2. Data
  3. Runtime Environment
  4. Middleware
  5. Operating System
  6. Virtualization
  7. Servers
  8. Storage
  9. Networking

Different Cloud Models offer different portions of the Software Infrastructure Components as a Service
- Software as a Service (SaaS) provides everything from 1 - 9
  - Ex: Google Docs, Microsoft Office 365
  - Providers: Salesforce
  - Consumers: End Users
- Platform as a Service (PaaS) provides everything from 3 - 9
  - Ex: Microsoft Azure, Heroku, AWS Elastic Beanstalk
  - Consumers: Developers
- Infrastructure as a Service (IaaS) provides everything from 5 - 9
  - Ex: AWS EC2
  - Consumers: System Administrators (Sometimes Developers)
