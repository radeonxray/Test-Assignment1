# Test-Assignment1

Assignment-link: https://github.com/datsoftlyngby/soft2019spring-test/blob/master/Assignments/01%20Test%20cases%20assignment.pdf

Slides: https://github.com/datsoftlyngby/soft2019spring-test/blob/master/Slides/02%20Unit%20Testing%20Slides.pdf

## Exercise 1 (White-box techniques)
1. Rewrite Peter Sestoft’ code example 2.1 so it can be tested automatically with xUnit framework. You can find the example in his article on Systematic software testing: https://www.itu.dk/~sestoft/papers/softwaretesting.pdf
  - Done using Java and Intellij
  
  
2. Write automated unit tests
  - Done using JUnit 5
  
  
3. Generate a code coverage report (e.g. using JaCoCo)
  - Coverage report for Test has been generated using Jacoco (index.html-file)
  - Code coverage report has not been generated for "general"-code, since this project does not do anything but host a whitebox.java file, which is tested with the whiteboxTest.java-file.
  - Running the whiteboxTest.java with Codecoverage shows, that all the code in the whitebox.java-file is covered 100%

## Exercise 2 (Black-box techniques)
1. Derive test cases for the train scenario described below based on equivalence partitioning and boundary value analysis. Remember both valid and invalid test cases.
  - Partitioning:
  - Boundary value:
  - Valid and invalid Test cases
2. Does test case design help identify any weaknesses in the scenario description? Comment on that.
Train Scenario
Pricing must be identified based on this scenario:
If you take your train before 9.30 am or in the afternoon after 4.00 pm until 7.30 pm (‘the rush hour’) you must pay full fare. A saver ticket is available for trains between 9.30 am and 4.00 pm, and after 7.30 pm.

So the assignment is dealing with time, rather than monetary values (like money) that we’ve dealt with before.

What I’ve distilled from the text below is:
A customer has to pay full price for a train ticket during Rush Hour, which is time before 09:30 and between 16:00 to 19:30

A customer can save money by buying a ticket for train ride between 09:30-16:00 and again after 19:30

From looking at the current setup, the weakness I’m looking at, is that time slot between 19:30 in the evening to 09:30 in the morning.

According to the text, the tickets gets cheaper after 19:30, but is full price until 09:30. So the obvious question is: when does Rush hour exactly being in the morning? 05:30? 06:00? 06:30? The text does not state!  

#### Partitions

- [Full Pay] Valid Partitions: 16-19:30
- [Full Pay] InValid Partitions: 09:30-16:00
- [Save Money] Valid Partitions: 09:30-16:00 
- [Save Money] InValid Partitions: 16:00-19:30
- [Save Money] Valid Partition: 19:30- Some time BEFORE 09:30 - Based on the text, this partition can’t be defined exactly.

#### Boundary Values:

05:59 |06:00 | 08:00 | 09:30 | 16:00 | 19:30 | 20:00 | 23:59 

The thoughts behind my boundary values, is to test where the payment is either full or saved, and also this “grey area” that was not defined by the text.

##### Working Notes
Full pay/Rush Hour: time < 09:30 16-19:30 

Save Money: 09:30 - 16:00 && time > 19:30


