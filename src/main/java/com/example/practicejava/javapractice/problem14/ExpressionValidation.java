package com.example.practicejava.javapractice.problem14;
import java.util.*;
import java.util.function.BiFunction;
public class ExpressionValidation {


    public static int precedence(char c){
        if(c=='+'||c=='-') return 1;
        else if(c=='*'||c=='/') return 2;
        return -1;
    }

    public static void validate(Stack<Character> word){
        Map<String, BiFunction<Integer, Integer, Integer>> operations = new HashMap<>();
        operations.put("+", (a, b) -> a + b);
        operations.put("-", (a, b) -> a - b);
        operations.put("*", (a, b) -> a * b);
        operations.put("/", (a, b) -> a / b);
        Stack<Integer> stack = new Stack<>();

        for (Character t : word) {
            String token=Character.toString(t);
            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token));
            } else if (operations.containsKey(token)) {
                int b = stack.pop();
                int a = stack.pop();
                int result = operations.get(token).apply(a, b);
                stack.push(result);
            }
        }

        System.out.println(stack.pop());
    }
    public void infixToPostfix(String expression){
        //String expression=expression;
        Stack<Character> symbol=new Stack<>();
        Stack<Character> word=new Stack<>();
        for(int i=0;i<expression.length();i++){
            char letter=expression.charAt(i);
            if((letter>='0'&&letter<='9')|| (letter>='A'&&letter<='Z')){
                word.push(letter);
            }
            else if(letter=='('){
                symbol.push(letter);
            }
            else if(letter==')'){
                while(symbol.size()>0&&symbol.peek()!='('){
                    word.push(symbol.pop());
                }
                symbol.pop();
            }
            else if(letter==' ') continue;
            else{
                while(symbol.size()>0&&(precedence(letter)<=precedence(symbol.peek()))){
                    word.push(symbol.pop());
                }
                symbol.push(letter);
            }

        }

        while(symbol.size()>0){
            word.push(symbol.pop());
        }
      //  System.out.println(word);
        validate(word);


    }
    }

