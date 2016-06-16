# gHipster

## Requirements

  1. java >= 1.8
  2. nodejs >= 5.0 (need ES2015 support)


  [Event better configuration with gulp](https://michael-bull.com/blog/2015/09/29/deployment-ready-websites-with-spring-boot)

## What's inside

 Backend:
  * Gradle
  * Spring boot
  * Spock test framework

Frontend:
  * Webpack
  * AngularJS 1.x
  * Karma/Jasmine unit tests

Frontend was copied from [webpack-angular-es6](https://github.com/hanskoff/webpack-angular-es6)

## To do After clone

    ./gradlew build

  This should invoke for you `npm install` and get frontend dependencies.

## Developement mode

  * backend:

        ./gradlew bootRun

      or from ide:

        run WebsiteApplication

       When working with intelij IDEA you need to compile after each change to make auto-reload work :(
       [Automatic restart](http://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-devtools.html#using-boot-devtools-restart)
  * frontend: with `cd frontend`

        npm start

      This command starts webpack that is hotreloading and proxies all calls to `/api/*` to backend


### Build distribution
This command will build fat-jar:

    ./gradlew build

### Serve distribution
Start your distribution:

    java -jar build/libs/gHipster.jar
