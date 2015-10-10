package op.olutopas;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.Stack;
//KESKEN! Jako ei toimi kunnolla 9> ei toimi. ja logiikka... noh.
/**
 * Luokka hoitaa laskujarjestyksen
 *
 */
public class LaskuJarjestys {

    public LaskukaavaIkkuna laskukaavaikkuna;
    public JButton button;
    public Laskutoimitukset laskut;
    public JTextArea textArea;
    public JTextField input;
    static int decider;
    static char checker;
    static Node root = null;

    public LaskuJarjestys(JTextArea textArea, Laskutoimitukset laskut) {
        this.textArea=textArea;
        this.laskut=laskut;
       
    }
/**
 * Metodi saa parametrina syötteen käyttäjältä 
 * ja pilkkoo syötteen ja lähettää laskutoimitukset laskutoimitukset luokalle
 * joka välittää ne takaisin ja metodi tulostaa tuloksen
 *
 */
    public void laske(String lauseke) {

            System.out.println(lauseke);

            char[] infix = lauseke.toCharArray();


            char[] postfix = postfixer(infix);

            for (int i = 0; i < postfix.length && postfix[i] != '_'; i++) {

            }

            Stack<Node> stack = new Stack<Node>();

            for (int i = 0; i < postfix.length; i++) {
                    Node node = new Node(postfix[i]);
                    
                    switch (postfix[i]) {
                    case '0':case '1':case '2':case '3':case '4':
                    case '5':case '6':case '7':case '8':case '9':
                            stack.push(node);

                            break;
                    case '+':case '-':case '/':case '*':

                            node.right = stack.pop();
                            node.left = stack.pop();
                            stack.push(node);
                            break;
                    default:
                    }
            }

            root = stack.pop();



            Stack<NodeDouble> intStack = new Stack<NodeDouble>();

            for (int i = 0; i < postfix.length; i++) {
                    NodeDouble NodeDouble = new NodeDouble(0);
                    switch (postfix[i]) {

                    case '0':case '1':case '2':case '3':case '4':
                    case '5':case '6':case '7':case '8':case '9':
                   

                            NodeDouble = new NodeDouble(Character.getNumericValue(postfix[i]));
                            intStack.push(NodeDouble);

                            break;
                    case '+':

                            double x = intStack.pop().data;
                            double y = intStack.pop().data;

                            NodeDouble.data = this.laskut.plussaa(y, x);
//                            this.laskut.plussaa(y, x);
                            intStack.push(NodeDouble);


                            break;

                    case '-':


                            x = intStack.pop().data;
                            y = intStack.pop().data;

//                            NodeDouble.data = y - x;
                            NodeDouble.data = this.laskut.miinusta(y, x);
                            intStack.push(NodeDouble);

                            break;

                    case '/':


                            x = intStack.pop().data;
                            y = intStack.pop().data;

//                            NodeDouble.data = y / x;
                            NodeDouble.data = this.laskut.jakoLasku(y, x);
                            intStack.push(NodeDouble);

                            break;

                    case '*':


                            x = intStack.pop().data;
                            y = intStack.pop().data;

//                            NodeDouble.data = y * x;
                            NodeDouble.data = this.laskut.tulo(y, x);

                            intStack.push(NodeDouble);

                            break;

                    default:
                    }

            }

    double aDouble = intStack.pop().data;
    String aString = Double.toString(aDouble);

//            this.textArea.setText(Double.parseDouble(intStack.pop().data));
//doubleparseduoble tohon ja sextText
             this.textArea.setText(aString);          
//        }
      

                }
    public static char[] postfixer(char[] infix) {


            Stack<Character> stack = new Stack<Character>();


            char[] result = new char[infix.length];

            for (int i = 0; i < result.length; i++) {
                    result[i] = '_';
            }


            int count = 0;

            for (int i = 0; i < infix.length; i++) {


                    switch (infix[i]) {
                        
                    case '0':case '1':case '2':case '3':case '4':
                    case '5':case '6':case '7':case '8':case '9':
                    
                            result[count] = infix[i];
                            count++;

                            break;

                    case '(':
                            stack.add(infix[i]);

                            break;

                    case ')':
                            while ((!stack.empty()) && (stack.peek() == '(')) {
                                    stack.pop();
                            }

                            if ((!stack.empty())) {
                                    result[count] = stack.pop();
                                    count++;
                            }

                            break;

                    case '+':case '*':case '-':case '/':
                            while ((!stack.empty()) && (stack.peek() == '(')) {
                                    stack.pop();
                            }

                            if ((!stack.empty())) {
                                    checker = stack.peek();

                                    // if 0, same. if 1, more. if 2, less.
                                    checkPrecedence(infix[i], checker);

                                    if (decider == 1) {
                                            stack.add(infix[i]);
                                    } else {
                                            result[count] = stack.pop();
                                            count++;
                                            stack.add(infix[i]);
                                    }

                            } else {
                                    stack.add(infix[i]);
                            }

                            break;

                    default:

                    }

            }

            while ((!stack.empty())) {
                    result[count] = stack.pop();
                    count++;
            }

            return result;
    }
/**
 * 
 *
 */

    public static void checkPrecedence(char a, char b) {

            switch (a) {

            case '/':
                    switch (b) {
                    case '/':decider = 0;break;
                    case '*':decider = 1;break;
                    case '+':decider = 1;break;
                    case '-':decider = 1;break;
                    default:
                    }
                    break;
            case '*':
                    switch (b) {
                    case '/':decider = 2;break;
                    case '*':decider = 0;break;
                    case '+':decider = 1;break;
                    case '-':decider = 1;break;
                    default:
                    }
                    break;
            case '+':
                    switch (b) {
                    case '/':decider = 2;break;
                    case '*':decider = 2;break;
                    case '+':decider = 0;break;
                    case '-':decider = 1;break;
                    default:
                    }
                    break;
            case '-':
                    switch (b) {
                    case '/':decider = 2;break;
                    case '*':decider = 2;break;
                    case '+':decider = 2;break;
                    case '-':decider = 0;break;
                    default:
                    }
                    break;
            default:
            }

    }

}
    class NodeDouble {
    double data;
    NodeDouble(double data) {
            this.data = data;
    }
}
class Node {
    char data;
    Node left;
    Node right;
    Node(char data) {
            this.data = data;
    }
}

