## This is a forked project for practicing Spring (not SpringBoot) testing
So this project has the standard JSP, XML, etc. structure

- using the Spring Context to...

    - Test the auto wiring of beans (EJB)
    - Test the setting of active profiles
    - Spring Test Configuration
    - JUnit 4 and JUnit 5
    
    - Spring MVC Test
        - Spring MVC Test is used for testing interactions with Spring MVC Controllers
        - Provides Servlet API Mock objects to mock the web environment
            - MockHttpServletRequest
            - MockHttpServletResponse
        - DispatcherServlet - requests are routed through Spring MVC's DispatcherServlet
        
        - Spring MVC Test Configuration Modes
            - Standalone Setup
                - Very light weight - ideal for unit tests
                - Tests one controller at a time
                - Allows for testing of controller requests and responses
                
            - WebAppContextSetup
                - Loads larger context of Spring Configuration
                - Tests many controllers - per configuration
                - Allows for testing of application config
                
        - Spring MVC Test uses a "fluent" API via several static imports
            - MockMvcRequestBuilders.* - Builds request
            - MockMvcResultMatchers.* - Create assertions against response
            - MockMvcBuilders.* - Configure and build an instance of MockMvc
        
        - Spring MVC Test does not use a running Servlet container
        - No network request is made (ie to port 80 or 8080)
        - HTML is not generated, thus templates are not executed (JSP, Thymeleaf, etc.)
        - You can test the view (template) requested, or redirected to
            - but cannot test expected HTML to be rendered as a result
        - Spring does support testing with a running container when needed




# Spring Pet Clinic 

All source code examples in the repository are for my [Online Course - Testing Spring Beginner to Guru](https://www.udemy.com/testing-spring-boot-beginner-to-guru/?couponCode=GITHUB_REPO)

This source code repository contains JUnit 5 and Spring Framework Testing examples.

The main source code is a copy of the [Spring Framework Pet Clinic project](https://github.com/spring-petclinic/spring-framework-petclinic). This is a reference project 
using a traditional 3-layer architecture without Spring Boot.

## Setup
### Requirements
* Should use Java 11 or higher. Previous versions of Java are un-tested.
* Use Maven 3.6.0 or higher

### Running Locally
After cloning this repo, from the project root run:
```text
./mvnw jetty:run-war
```

## Support
For questions and help:
* Please post in course
* Or post in the Slack Community exclusive to the course.

GitHub Issues will not be addressed.