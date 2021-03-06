package modeldata;

import businesscomponent.Calculator;
import testing.CalculationsTest;

/**
 * @Autor: Jef Beyens
 * @Date: 16/10/2016
 * @Project: Calculator
 * @Purpose: Model data klasse
 * 
 * Additional explanation:
 * - operand1, operand2 and operation:
 *   These properties will only get a getter and not a settor. They have to be inputted through the constructor.
 *   REASON: They are not allowed to be changed after the instantiation of the class.
 *   Preventing changes to these parameters ensure more data consistency.
 */
public class Exercise {
	
	private double operand1;
	private double operand2;
	private char operation;
	
	public Exercise(double operand1, double operand2, char operation) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operation = operation;
	}
	
	public double getOperand1() {
		return operand1; 
	}	

	
	public double getOperand2() {
		return operand2; 
	}

	
	public char getOperation() {
		return operation; 
	}


	@Override
	public String toString() {
		return "" + operand1 + " " + operation + " " + operand2 + "= ";
	}
}
