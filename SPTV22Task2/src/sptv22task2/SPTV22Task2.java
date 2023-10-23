/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv22task2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SPTV22Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();
        
        // Проверяем, является ли число трехзначным
        if (number < 100 || number > 999) {
            System.out.println("Введенное число не является трехзначным.");
        } else {
            int sum = 0;
            int digit;
            
            // Вычисляем сумму цифр в числе
            digit = number / 100;
            sum += digit;
            number %= 100;
            
            digit = number / 10;
            sum += digit;
            number %= 10;
            
            sum += number;
            
            System.out.println("Сумма цифр введенного числа: " + sum);
        }
    }
}