/**
 * 
 */
package mockito.example.services;

public interface CalculatorService {

	double calculateSum(int a, int b);
	double calculateSubstraction(int a, int b);
	double calculateDivision(int a, int b) throws ZeroDivisionException;
	double calculateMultiplication(int a, int b);
	double calculateAverage();
	boolean isEven(int a);
	String printResult(double result);
}
