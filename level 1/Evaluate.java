import java.util.Stack;

public class Evaluate {

    public static int precedence(char operator) {
        switch (operator) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            default: return -1;
        }
    }

    public static int applyOperation(int a, int b, char operator) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0;
        }
    }

    public static int evaluate(String expression) {
        Stack<Integer> values = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // Skip spaces
            if (ch == ' ')
                continue;

            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                values.push(num);
                i--;  
            }

      
            else if (ch == '(') {
                operators.push(ch);
            }

            else if (ch == ')') {
                while (operators.peek() != '(') {
                    int b = values.pop();
                    int a = values.pop();
                    char op = operators.pop();
                    values.push(applyOperation(a, b, op));
                }
                operators.pop(); 
            }

            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(ch)) {
                    int b = values.pop();
                    int a = values.pop();
                    char op = operators.pop();
                    values.push(applyOperation(a, b, op));
                }
                operators.push(ch);
            }
        }

        while (!operators.isEmpty()) {
            int b = values.pop();
            int a = values.pop();
            char op = operators.pop();
            values.push(applyOperation(a, b, op));
        }

        return values.pop();
    }

    public static void main(String[] args) {
        String expression1 = "10 + 2 * 6";
        String expression2 = "100 * (2 + 12) / 14";

        System.out.println("Result of \"" + expression1 + "\": " + evaluate(expression1));
        System.out.println("Result of \"" + expression2 + "\": " + evaluate(expression2));
    }
}