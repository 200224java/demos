For a headstart:
  Look up Hibernate & Java Persistance API (JPA)
  In general, these provide many java annotations to configure the mappings

Hibernate is an ORM (Object Relational Mapping)

It allows us to perform SQL operations on a database in an object-oriented fashion.

Provides many annotations to configure classes as tables in the DB.
  - @Entity
  - @Table (optional 99%, just uses the class name)
  - @Id
  - @Column (optional, just defines the column name, otherwise uses the variable name)
  - Mapping annotations
    - @OneToOne
    - @OneToMany
    - @ManyToOne
    - @ManyToMany
  - and more

We also use an xml configuration file (hibernate.cfg.xml)

Hibernate uses Sessions (Which come from SessionFactory)

API:

  Configuration Class that represents the information in the hibernate.cfg.xml
  SessionFactory Interface that is used to build Sessions (obtained with the Configuration object)
  Session Interface that represents a session with the DB
  Transaction Interface that represents a transaction

Cache

Hibernate uses several caches to provide optimizations for our SQL operations
  Ex: If we were to perform multiple update operations, hibernate can track all of the changes
    and then perform a single update at the end with the resulting values

There are different levels caches

The built in cache that is provided to us is called the L1 cache
  It is a session-scoped cache.

There is an L2 cache that we can add to our project, but it does not come with Hibernate.
L2 caches are sessionFactory-scoped.
  Optimizations can be performed across multiple sessions, however, things get very complicated.

Object States
Objects are synchronized with the DB through Hibernate and therefore can have different states depending on when/if they are currently synchronized.

TRANSIENT:
  A newly created object that has yet to be associated with the DB (or any session).

PERSISTENT:
  This is an object whose state is managed by Hibernate, and is synchronized with the DB through sessions.
  This means that we have currently active session to synchronize the object.

DETACHED:
  This is an object that was previously persistent, but the session that it was associated with has closed.

Hibernate has a feature called "Automatic Dirty Checking"

This means if we modify a PERSISTENT entity in any way (such as with setters), Hibernate will automatically
  update that entity.
