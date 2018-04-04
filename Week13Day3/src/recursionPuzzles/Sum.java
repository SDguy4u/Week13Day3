package recursionPuzzles;

public class Sum {
private static int result (int n) {
// Replace the following function with the recursive function to be tested
{
if(n>0) return (n+result(n-1));
return n;
}
}

public static void main(String [] args) {
// Local variables used for testing
int actualResult;
int expectedResult;
// Test Number 1
actualResult = result(5);
// Test the Base Case
expectedResult = 15;
// Replace this line with what the actual expected result should be
if (actualResult == expectedResult)
System.out.println("Test 1: Pass; Result: " + actualResult);
else
System.out.println("Test 1: Fail; Result: " + actualResult + "; Expected: " + expectedResult);

// Test Number 2
actualResult = result(10);
// Test one away from the Base Case
expectedResult = 55;
// Replace this line with what the actual expected result should be
if (actualResult == expectedResult)
System.out.println("Test 2: Pass; Result: " + actualResult);
else
System.out.println("Test 2: Fail; Result: " + actualResult + "; Expected: " + expectedResult);

// Test Number 3
actualResult = result(5);
// Test a number of iterations away from the Base Case
expectedResult = 15;
// Replace this line with what the actual expected result should be
if (actualResult == expectedResult)
System.out.println("Test 3: Pass; Result: " + actualResult);
else
System.out.println("Test 3: Fail; Result: " + actualResult + "; Expected: " + expectedResult);
}


}
