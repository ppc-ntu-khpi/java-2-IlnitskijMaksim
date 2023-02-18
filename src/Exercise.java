package domain;

public class Exercise {


    public static String Calculate(String d){
        //Цикл додає числа рядка d, поки його довжина не досягне 1 символа
           while (d.length() > 1) {
            int sum = 0;
            for (char c : d.toCharArray()) {
                //Перевіряє, чи є символ цифрою і віднімає символ 0, щоб отримати числове значення
                if (Character.isDigit(c)) {
                    sum += (c - '0');
                }
            }
            //Призначення нового значення для радка d
            d = String.valueOf(sum);
        }
        //Повертає вже обчислений рядок d
        return d;
    }
}
