package home;
 /*
1)  Реализовать ф-цию. Параметр weekday принимает true, если сейчас будний день иначе выходные.
    Параметр vacation говорит, что мы в отпуске.
    sleepIn(false, false) -> true
    sleepIn(true, false) -> false
    sleepIn(false, true) -> true

2)  Реализовать ф-цию. Вернуть сумму чисел a и b, если они не равны. Иначе вернуть двойную сумму этих чисел.
    public int sumDouble(int a, int b)
    sumDouble(1, 2) -> 3
    sumDouble(3, 2) -> 5
    sumDouble(2, 2) -> 8

3)  Реализовать ф-цию. Вернуть строку, которая состоит из пар индексов 0,1, 4,5, 8,9 и т.д.
    public String altPairs(String str)
    altPairs("kitten") -> "kien"
    altPairs("Chocolate") -> "Chole"
    altPairs("CodingHorror") -> "Congrr"
*/

import java.util.Arrays;

public class HomeOne {
    public static boolean sleepIn(boolean weekday, boolean vacation){
    if(weekday && !vacation) {
        return false;
    }
    else
        return true;
    }

    public static int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        }
        else if (a == b) {
            return (a + b) * 2;
        }
        else return 0;
    }

    public static String altPairs(String str) {
        StringBuilder sb = new StringBuilder(str);

        for (int i = 2; i <sb.length() ; i=i+2) {
            int y = i;
            sb = sb.delete(y, y = y + 2);
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        System.out.println(sleepIn(false,false));
        System.out.println(sleepIn(true,false));
        System.out.println(sleepIn(false,true));
        System.out.println(sumDouble(1,2));
        System.out.println(sumDouble(3,2));
        System.out.println(sumDouble(2,2));
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));


    }
}

