// Задание №2
// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

package HashMapTest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class Task2_sem5 {
    
    public static Boolean validation(HashMap<String, Integer> outBracket, HashMap<String, Integer> closeBracket, String line) {

        Deque<String> stack = new ArrayDeque<>();
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            String symbol = Character.toString(ch);
            if (outBracket.containsKey(symbol)){
                stack.push(symbol);
            }
            else if (closeBracket.containsKey(symbol)){
                if (!stack.isEmpty()){
                    Integer val1 = closeBracket.get(symbol);
                    String last = stack.pop();
                    Integer val2 = outBracket.get(last);
                    if (!val1.equals(val2)) return false;
                }
                else return false;
            }
        }
        return stack.isEmpty();
    }
}
