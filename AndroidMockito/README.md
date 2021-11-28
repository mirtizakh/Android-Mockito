## Table of contents
* [General info](#General-info)
* [What is Unit Testing](#Unit-Testing)
* [What makes a good Unit Test](#Good-Unit-Test)
* [Test Doubles](#Test-Doubles)
* [Types of Test Doubles](#Test-Doubles-Types)

## General info
* In this repo you will find Mockito examples.
* I follow this you tube link for creating all the examples .You tube link : https://www.youtube.com/watch?v=53fncREn8k0&list=PL6Zs6LgrJj3vy7yWpH9xb3Y0I_pAPrvCU

## Unit Testing
* A unit test is a piece of code written by a developer to test certain functionality of code.
* The class which we want to test is called System / Class Under Test.
* The method which we want to test is called as Method Under Test.
* Unit test instantiates class under test, executes method under test and verifies that it worked as expected.

## Good Unit Test
* Easy to write. (Developer should not put a lot of effort to write the unit test)
* Readable. (It should be readable by evey developer)
* Reliable. (It should run on every machine like CI server)
* Fast. (Unit test provide feedback to the developer very quick)
* Isolated. (If you want to test a class and that class depends on other services like database or network calls,so what happens these external factors take time to bring back the results ,they are consuming much time , so the unit tests are no longer fast .So whenever you want to test a class it should be isolated from external factors.

## Test Doubles
* Test double is a generic term for any case when you replace a production object for testing purpose.
* Sometimes it is not possible to unit test a code because of the unavailability of the external dependency.
* If code under test is dependent on database operations, it is not possible to unit test the code unless the database is available.
* Example : Think of a Stunt Double in a movie which replaces actor whenever actor is not available or actor needs to perform dangerous actions etc.

## Test Doubles Types
* Dummy
* Fake
* Spy
* Mock
* Stub