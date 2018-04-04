package recursionPuzzles;


public class Letter {
private static int result (int n, int m) {
// Replace the following function with the recursive function to be tested
{
if(n==1) return 1;
return (m*result(m,n-1));
}
}

public static void main(String [] args) {
// Local variables used for testing
int actualResult;
int expectedResult;
// Test Number 1
actualResult = result(1,2);
// Test the Base Case
expectedResult = 1;
// Replace this line with what the actual expected result should be
if (actualResult == expectedResult)
System.out.println("Test 1: Pass; Result: " + actualResult);
else
System.out.println("Test 1: Fail; Result: " + actualResult + "; Expected: " + expectedResult);

// Test Number 2
actualResult = result(2,3);
// Test one away from the Base Case
expectedResult = 3;
// Replace this line with what the actual expected result should be
if (actualResult == expectedResult)
System.out.println("Test 2: Pass; Result: " + actualResult);
else
System.out.println("Test 2: Fail; Result: " + actualResult + "; Expected: " + expectedResult);

// Test Number 3
actualResult = result(3,4);
// Test a number of iterations away from the Base Case
expectedResult = 24;
// Replace this line with what the actual expected result should be
if (actualResult == expectedResult)
System.out.println("Test 3: Pass; Result: " + actualResult);
else
System.out.println("Test 3: Fail; Result: " + actualResult + "; Expected: " + expectedResult);
}


}


