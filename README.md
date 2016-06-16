# gHipster

Simple project to quickly start developing a web application using AngularJS and Akka HTTP,

## Requirements

  1. java >= 1.8
  2. nodejs >= 5.0 (need ES2015 support)


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

## To do after clone

    ./gradlew build

  This should invoke for you `npm install` and get frontend dependencies.

## Developement mode
You interact with app on this address:

    http://localhost:9090/

  It's a webpack dev server which proxies requests to backend.
  If you go to `localhost:8080` will be served static files from `backend/src/main/resource/public` so no changes in frontend dir will affect your ui.

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

    java -jar backend/build/libs/gHipster-0.1.0.jar


#### Useful links

  * [How to $inject into Angular class w/ES6](http://stackoverflow.com/a/31629505/2011031)
  * [Event better configuration with gulp](https://michael-bull.com/blog/2015/09/29/deployment-ready-websites-with-spring-boot)