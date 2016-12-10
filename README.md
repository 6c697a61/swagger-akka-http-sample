# swagger-akka-http-sample

Clone this git repo and use sbt run to start the Akka Http server.

Uses [swagger-akka-http](https://github.com/swagger-akka-http/swagger-akka-http) which is built using [swagger.io](http://swagger.io/) libs.

Test using http://petstore.swagger.io/ and replace the swagger.json with http://localhost:12345/api-docs/swagger.json

The Swagger UI can be used to send sample requests.

## Scala 2.12

There is a Scala 2.12 branch. It uses a 0.8.2-SNAPSHOT version of swagger-akka-http. This version uses a patched vesrion of the swagger-core code base that I have hosted on [Jitpack](https://jitpack.io/#pjfanning/swagger-core).
