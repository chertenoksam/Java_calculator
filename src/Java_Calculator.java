/* **calculator.java**
Create a Custom Class:
- Create a Java Calculator Class that does the following five commands:

  - An **add** method that takes in two integer numbers and adds them together the call to that method would look like this: 
  **add(int num1, int num2)**
  - A **subtraction** method that takes in two integers and subtracts them from one another 
  would look like this: **subtract( int num1, int num2)** 
  - A **multiplication** method that takes in two integer numbers and multiplies them together the call to that method would look like this: multiply(int num1, int num2)
  - A **division** method that takes in two integer numbers and divides them the call to that method would look like this: divide(int num1, int num2)
  - A **square** method that takes in one integer and squares it: 
  square(int num1, int num2)
*/

public class Java_Calculator {

		public static int summ (int a, int b) {
			return a + b;		
		}
		
		public static int subtract(int a, int b) {
			return a - b;
		}
		
		public static int multiply (int a, int b) {
			return a * b;		
		}
		
		public static int division(int a, int b) {
			return a / b;		
		}
		
		public static int square (int a) {
			return a * a;		
		}
		
		public static void main(String[] args) {
				System.out.println(summ(24,25));
				System.out.println(subtract(24,25));
				System.out.println(multiply(24,25));
				System.out.println(square(24));
					
		}
}
