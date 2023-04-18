# Tycho

### Overview

Tycho is a microservice that manages roles as part of a much larger application. 
It is responsible for maintaining roles used by the application in many ways.

The current implementation only supports retrieving a default set of roles. 
It needs to be extended to allow adding, updating and removing roles from the system.

Technologies/Libraries used:

- Java
- Spring boot
- H2 (in-memory database)
- QueryDSL
- Liquibase
- Gradle

### Task

1. Add an endpoint that allows roles to be added
2. Add unit tests (and integration tests)

Bonus:
1. Add an endpoint that allows roles to be updated
2. Add an endpoint that allows roles to be deleted

