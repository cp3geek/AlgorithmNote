package 练习;

import java.util.Stack;

public class Main_1 {

	public static void main(String[] args) {
		 String expression = "(8*(7-2))";
	        calculate(expression);

	}
	public static void calculate(String expression) {
        Stack<Character> opt = new Stack<>();
        Stack<Double> values = new Stack<>();
        char[] charArray = expression.toCharArray();
        for(char c : charArray) {
            switch(c) {
              case '(': 
                  break;
              case '+':
              case '-':
              case '*':
              case '/':
                  opt.push(c);
                  break;
              case ')':
                  if(opt.isEmpty()) {
                      break;
                  }
                  char o = opt.pop();
                  double v = values.pop();
                  switch(o) {
                     case '+': v = values.pop() + v; break;
                     case '-': v = values.pop() - v; break;
                     case '*': v = values.pop() * v; break;
                     case '/': v = values.pop() / v; break;
                  }
                  values.push(v);
                  break;
              default:
                  values.push(Double.parseDouble(String.valueOf(c)));
                  break;  
            }
        }
         System.out.println("the result is : "+values.pop());
    }


}
