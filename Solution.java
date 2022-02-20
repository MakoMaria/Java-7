import com.sun.security.auth.module.UnixSystem;

import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дробь 1");
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();
        Fraction f1 = new Fraction(num1, den1); // переход в класс Fraction и присваивание введенных значений

        System.out.println("Введите дробь 2");
        int num2 = sc.nextInt();
        int den2 = sc.nextInt();
        Fraction f2 = new Fraction(num2, den2);

        Fraction sum1=Fraction.sum1(f1, f2);
        System.out.println(f1 + "+" + f2 + "=" + sum1);

        Fraction sum2 =f1.sum2(f2);
        System.out.println(f1 + "+" + f2 + "=" + sum2);

        Fraction sub1 =Fraction.sub1(f1, f2);
        System.out.println(f1 + "+" + f2 + "=" + sub1);

        Fraction sub2 =f1.sub2(f2);
        System.out.println(f1 + "+" + f2 + "=" + sub2);}

        Fraction mul1 = Fraction.mul1(f1, f2);
        System.out.println(f1 +"*" + f2 + "=" + mul1);

        Fraction sub2 =f1.sub2(f2);
        System.out.println(f1 + "*" + f2 + "=" + sub2);
