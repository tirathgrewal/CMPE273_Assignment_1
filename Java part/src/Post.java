import java.util.*;
public class Post{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the postfix expression:");
String expr=sc.nextLine();
System.out.println("Expression is:"+expr);
int res=st(expr);
}

public static int st(String expr) {
	
	  Stack s=new Stack();
	  int num1,num2,ans;
	  for(int i=0;i<expr.length();i++){
	      char c=expr.charAt(i);
	      if (c > '0' && c < '9') {
	                    s.push(c);
	      } 
	      else {
	                    num2 = Integer.parseInt("" + s.pop());
	                    num1 = Integer.parseInt("" + s.pop());
	
	                    switch (c) {
	                        case '+':
	                            s.push(num1 + num2);
	                            break;
	                        case '-':
	                            s.push(num1 - num2);
	                            break;
	                        case '*':
	                            s.push(num1 * num2);
	                            break;
	                        case '/':
	                            s.push(num1 / num2);
	                            break;
	
	                        default:
	                            System.out.println("Invalid Input");
	                    }
	                }
	            }
	        
	
	    ans = Integer.parseInt("" + s.pop());
	
	    System.out.println("Result of postfix expression is: "+ans);
	    return ans;
}
}