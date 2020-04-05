package cy;


//***获得算式***
public class equationExe {

	private static String equation;
	public static int res1 = 0;

	public static String getEquation() {
				
		do {
			int num1 = (int)(Math.random()*(100-1)+1);
			int num2 = (int)(Math.random()*(100-1)+1);
				
			String operator = test.getOperator();
			String equation = num1 + operator + num2 +"=";			//方便后续调用
				
			if(test.judgeEquation(num1, num2)) {
				res1 = getResult(num1, num2, operator);
				return equation;
			}

		}while(equation == null);
			return null;
	}
	
	public static int getResult(int num1, int num2, String operator) {
		int result = 0;
		switch(operator) {
			case "+":
				result = num1 + num2;
				break;
				
			case "-":
				result = num1 - num2;
				break;
				
			case "*":
				result = num1 * num2;
				break;
				
			case "/":
				result = num1 / num2;
				break;
		}
		
		return result;
	//		if(res == result) {
	//			System.out.println("√");
	//			score  ++;
	//			return true;
	//		}
	//		else {
	//			System.out.println("×");
	//			return false;
	//		}
	}
}
