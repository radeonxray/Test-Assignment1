# Test-Assignment1

Assignment-link: https://github.com/datsoftlyngby/soft2019spring-test/blob/master/Assignments/01%20Test%20cases%20assignment.pdf

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
2. Does test case design help identify any weaknesses in the scenario description? Comment on that.
Train Scenario
Pricing must be identified based on this scenario:
If you take your train before 9.30 am or in the afternoon after 4.00 pm until 7.30 pm (‘the rush hour’) you must pay full fare. A saver ticket is available for trains between 9.30 am and 4.00 pm, and after 7.30 pm.
