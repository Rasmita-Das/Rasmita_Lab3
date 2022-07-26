package question1;

import java.util.Scanner;
import java.util.Stack;

public class CheakBrackets {
	 public static void main(String[] args)
	   {
	      String expression;
	      int i, length;
	      char ch;
	      try (Scanner s = new Scanner(System.in)) {
			System.out.print("Enter the Expression: ");
			  expression = s.nextLine();
		}
	      
	      Stack<Character> stack = new Stack<Character>();
	      length = expression.length();
	      
	      for(i=0; i<length; i++)
	      {
	         ch = expression.charAt(i);
	         if(ch=='(' || ch=='{' || ch=='[')
	         {
	            stack.push(ch);
	         }
	         else if(ch==')')
	         {
	            if(stack.isEmpty() || stack.pop() != '(')
	            {
	               System.out.println("\nThe entered Strings do not contain Balanced Brackets!");
	               return;
	            }
	         }
	         else if(ch=='}')
	         {
	            if(stack.isEmpty() || stack.pop() != '{')
	            {
	               System.out.println("\nThe entered Strings do not contain Balanced Brackets!");
	               return;
	            }
	         }
	         else if(ch==']')
	         {
	            if(stack.isEmpty() || stack.pop() != '[')
	            {
	               System.out.println("\nThe entered Strings do not contain Balanced Brackets!");
	               return;
	            }
	         }
	      }
	      if(stack.isEmpty())
	         System.out.println("\nThe entered String has Balanced Brackets.");
	   }
}
