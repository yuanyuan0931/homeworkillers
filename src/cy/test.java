package cy;

import java.util.Scanner;

public class test {

	private static int score = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char[] operator = new char[5];
//		operator[] = {'+', '-', '*', '/'};

		int count = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("这是四则运算小游戏，你将得到十个题目，每个题目1分，满分10分，祝你好运");

		while(count <= 10) {
			String operator = getOperator();
			int num1 = (int)(Math.random()*(100-1)+1);
			int num2 = (int)(Math.random()*(100-1)+1);
			if(judgeEquation(num1, num2)) {
				System.out.println("第"+count+"题");	
				System.out.print(num1 + operator + num2 +"=");
				int res = sc.nextInt();
				judgeResult(num1, num2, operator, res);
				System.out.println();
				count ++;
			}
		}
		System.out.println("游戏结束，你的得分是："+score+"分");
	}
	
//***获取符号***
	public static String getOperator() {
		char[] operator=new char[]{'+','-','*','/'};
		int num = (int) (Math.random()*(4-0)+0); 
//		int s= random.nextInt(4);
		return String.valueOf(operator[num]);
	}

//***判断范围是否在要求范围内***
	public static boolean judgeEquation(int num1, int num2) {
		if(num1 + num2 >= 100 || num1 * num2 >= 100) {
			return false;
	}
		if(num1 - num2 < 0) {
			return false;
		}
		if(num1 % num2 != 0) {
			return false;
		}
		return true;
}
	
//***判断运算结果***
	public static boolean judgeResult(int num1, int num2, String operator, int res) {
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
		if(res == result) {
			System.out.println("√");
			score  ++;
			return true;
		}
		else {
			System.out.println("×");
			return false;
		}
	}
	
}